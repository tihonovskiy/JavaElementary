package HW13;

import java.util.*;

public class FileNavigator {
    private Map<String, ArrayList<FileData>> files = new HashMap<>();

    public void add(String path, FileData newFile) {
        if(path.equals(newFile.getPath())) {
            if (files.containsKey(path)) {
                files.get(path).add(newFile);
            } else {
                ArrayList<FileData> file = new ArrayList<>();
                file.add(newFile);
                files.put(path, file);
            }
        } else {
            System.out.println("The path does not match the specified path in the file");
        }
    }

    public ArrayList<FileData> find(String findPath) {
        return files.get(findPath);
    }

    public ArrayList<FileData> filterBySize(Integer findSize) {
        ArrayList<FileData> result = new ArrayList<>();
        Iterator<Map.Entry<String, ArrayList<FileData>>> iterator = files.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, ArrayList<FileData>> next = iterator.next();
            for (int i = 0; i < next.getValue().size(); i++) {
                if (next.getValue().get(i).getSizeByte() <= findSize) {
                    result.add(next.getValue().get(i));
                }
            }
        }
        return result;
    }

    public void remove(String path) {
        for (int i = 0; i < files.get(path).size(); i++) {
            files.get(path).remove(i);
        }
        files.remove(path);
    }

    public ArrayList<FileData> sortBySize() {
        ArrayList<FileData> sortFiles = new ArrayList<>();

        Iterator<Map.Entry<String, ArrayList<FileData>>> iterator = files.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, ArrayList<FileData>> next = iterator.next();
            for (FileData file : next.getValue()) {
                sortFiles.add(file);
            }
        }

        for (int i = sortFiles.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sortFiles.get(j).getSizeByte() > sortFiles.get(j + 1).getSizeByte()) {
                    FileData tmp = sortFiles.get(j);
                    sortFiles.set(j, sortFiles.get(j + 1));
                    sortFiles.set(j + 1, tmp);
                }
            }
        }

        return sortFiles;
    }

    @Override
    public String toString() {
        return "FileNavigator{" +
                "files=" + files +
                '}';
    }
}
