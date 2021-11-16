package HW13;

public class FileData {
    private String name;
    private Integer sizeByte;
    private String path;

    public FileData(String name, Integer sizeByte, String path) {
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
}
