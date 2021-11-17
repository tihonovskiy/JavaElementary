package HW13;

import java.util.*;

public class FileNavigator {
    private Map<String, List<FileData>> files = new HashMap<>();

    public void add(String path, FileData newFile) {
        if (!path.equals(newFile.getPath())) {
            System.out.println("The path does not match the specified path in the file");
        } else if (files.containsKey(path)) {
            files.get(path).add(newFile);
        } else {
            List<FileData> file = new ArrayList<>();
            file.add(newFile);
            files.put(path, file);
        }
    }

    public List<FileData> find(String findPath) {
        return files.get(findPath);
    }

    public List<FileData> filterBySize(int findSize) {
        List<FileData> result = new ArrayList<>();

        for (List<FileData> allFile : files.values()) {
            for (FileData file : allFile) {
                if (file.getSizeByte() <= findSize) {
                    result.add(file);
                }
            }
        }

        return result;
    }

    public void remove(String path) {
        files.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> sortFiles = new ArrayList<>();
        for (List<FileData> allFile : files.values()) {
            for (FileData file : allFile) {
                sortFiles.add(file);
            }
        }
        Collections.sort(sortFiles);
        return sortFiles;
    }

    @Override
    public String toString() {
        return "FileNavigator{" +
                "files=" + files +
                '}';
    }
}
