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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSizeByte() {
        return sizeByte;
    }

    public void setSizeByte(Integer sizeByte) {
        this.sizeByte = sizeByte;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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
