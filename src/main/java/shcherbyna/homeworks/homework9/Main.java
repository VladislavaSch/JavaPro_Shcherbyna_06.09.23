package shcherbyna.homeworks.homework9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        createLogFile();
        writeLog("INFO", "Creating a new project");
        writeLog("ERROR", "Something went wrong");
        writeLog("DEBUG", "Handling bugs");
        readLog("INFO,DEBUG");

    }

    public static void createLogFile() {
        new File("Console.log");
    }

    public static void writeLog(String level, String message) {
        try {
            FileWriter writer = new FileWriter("Console.log", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(level + ": " + message);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readLog(String levels) {
        String[] levelArray = levels.split(",");
        for (String level : levelArray) {
            try (BufferedReader reader = new BufferedReader(new FileReader("Console.log"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.startsWith(level)) out.println(line);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}