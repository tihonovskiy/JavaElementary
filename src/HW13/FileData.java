package HW13;

public class FileData implements Comparable<FileData> {
    private String name;
    private int sizeByte;
    private String path;

    public FileData(String name, int sizeByte, String path) {
        this.name = name;
        this.sizeByte = sizeByte;
        this.path = path;
    }

    public Integer getSizeByte() {
        return sizeByte;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "name='" + name + '\'' +
                ", sizeByte=" + sizeByte +
                ", path='" + path + '\'' +
                '}';
    }

    @Override
    public int compareTo(FileData file) {
        return this.getSizeByte() - file.getSizeByte();
    }
}
