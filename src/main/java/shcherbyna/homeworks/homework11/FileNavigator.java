package shcherbyna.homeworks.homework11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FileNavigator {
    private Map<String, List<FileData>> fileMap;

    public FileNavigator() {
        fileMap = new HashMap<>();
    }

    public void add(FileData fileData) {
        String[] pathParts = fileData.getPath().split("/");
        if (pathParts.length < 2 || !pathParts[0].isEmpty()) {
            System.out.println("Помилка: Неправильний формат шляху до файлу");
            return;
        }

        String key = "/" + pathParts[1];

        if (!fileMap.containsKey(key)) {
            fileMap.put(key, new ArrayList<>());
        }

        fileMap.get(key).add(fileData);
    }

    public List<FileData> find(String path) {
        List<FileData> result = new ArrayList<>();
        for (List<FileData> files : fileMap.values()) {
            for (FileData file : files) {
                if (file.getPath().equals(path)) {
                    result.add(file);
                }
            }
        }
        return result;
    }

    public List<FileData> filterBySize(long maxSize) {
        List<FileData> filteredFiles = new ArrayList<>();
        for (List<FileData> files : fileMap.values()) {
            for (FileData file : files) {
                if (file.getSize() <= maxSize) {
                    filteredFiles.add(file);
                }
            }
        }
        return filteredFiles;
    }

    public void remove(String path) {
        String key = "/" + path.split("/")[1];
        if (fileMap.containsKey(key)) {
            List<FileData> filesToRemove = fileMap.get(key);
            List<FileData> filesToRemoveCopy = new ArrayList<>(filesToRemove);

            for (FileData file : filesToRemoveCopy) {
                if (file.getPath().equals(path)) {
                    filesToRemove.remove(file);
                }
            }
        }
    }

    public List<FileData> sortBySize() {
        List<FileData> allFiles = new ArrayList<>();
        for (List<FileData> files : fileMap.values()) {
            allFiles.addAll(files);
        }

        allFiles.sort((file1, file2) -> Long.compare(file1.getSize(), file2.getSize()));

        return allFiles;
    }

    public static void main(String[] args) {
        FileNavigator navigator = new FileNavigator();

        FileData file1 = new FileData("files.txt", 100, "/path/to/file");
        FileData file2 = new FileData("firstApp.java", 200, "/path/to/file");
        FileData file3 = new FileData("document.pdf", 150, "/path/to/documents");

        navigator.add(file1);
        navigator.add(file2);
        navigator.add(file3);

        System.out.println("Файли за шляхом /path/to/file:");
        List<FileData> filesAtPath = navigator.find("/path/to/file");
        for (FileData file : filesAtPath) {
            System.out.println(file.getName());
        }

        System.out.println("Файли, розмір яких не перевищує 150 байтів:");
        List<FileData> filteredFiles = navigator.filterBySize(150);
        for (FileData file : filteredFiles) {
            System.out.println(file.getName());
        }

        System.out.println("Сортування файлів за розміром:");
        List<FileData> sortedFiles = navigator.sortBySize();
        for (FileData file : sortedFiles) {
            System.out.println("Ім'я: " + file.getName() + ", Розмір: " + file.getSize());
        }

        navigator.remove("/path/to/documents");
        System.out.println("Після видалення /path/to/file:");
        for (List<FileData> files : navigator.fileMap.values()) {
            for (FileData file : files) {
                System.out.println("Ім'я: " + file.getName() + ", Розмір: " + file.getSize() + ", Шлях: " + file.getPath());
            }
        }
    }
}


class FileData {
    private String name;
    private long size;
    private String path;

    public FileData(String name, long size, String path) {
        this.name = name;
        this.size = size;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    public String getPath() {
        return path;
    }
}



