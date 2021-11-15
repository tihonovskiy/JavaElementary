package HW13;

import java.util.*;

public class FileNavigator {
    private Map<String, ArrayList<FileData>> files = new HashMap<>();

    public void add(FileData newFile) {
        if(files.containsKey(newFile.getPath())) {
            files.get(newFile.getPath()).add(newFile);
        } else {
            ArrayList<FileData> file = new ArrayList<>();
            file.add(newFile);
            files.put(newFile.getPath(), file);
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
                if(next.getValue().get(i).getSizeByte() <= findSize) {
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

    @Override
    public String toString() {
        return "FileNavigator{" +
                "files=" + files +
                '}';
    }
}
