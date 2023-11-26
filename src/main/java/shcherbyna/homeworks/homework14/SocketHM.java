package shcherbyna.homeworks.homework14;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SocketHM {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8081);
            System.out.println("З'єднання з сервером 8081...");
            Socket accept = serverSocket.accept();
            System.out.println("Клієнт підключений.");

            BufferedReader in = new BufferedReader(new InputStreamReader(accept.getInputStream()));
            PrintWriter out = new PrintWriter(accept.getOutputStream(), true);

            out.println("Hello");
            String clientGreeting = in.readLine();
            System.out.println("Client greeting: " + clientGreeting);

            if (containsRussianLetters(clientGreeting)) {
                out.println("Що таке паляниця?");
                String clientAnswer = in.readLine();

                if ("Хліб".equalsIgnoreCase(clientAnswer.trim())) {
                    System.out.println("Correct answer. Sent date and time.");
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();
                    out.println("Current date and time: " + dtf.format(now));
                    out.println("Goodbye");
                    System.out.println("Server is saying goodbye.");
                } else {
                    out.println("Incorrect answer. Disconnecting.");
                    System.out.println("Incorrect answer. Disconnecting client.");
                }
            } else {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                out.println("Current date and time: " + dtf.format(now));
                out.println("Goodbye");
                System.out.println("Server is saying goodbye.");
            }

            in.close();
            out.close();
            accept.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean containsRussianLetters(String text) {
        String txt = text.toLowerCase();
        return (txt.contains("ы")) || (txt.contains("ъ")) || (txt.contains("э")) || (txt.contains("ё"));
    }
}
