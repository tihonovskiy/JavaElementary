package Logger;

public class FileMaxSizeReachedException extends Exception {
    public FileMaxSizeReachedException (String message) {
        super (message);
    }
}
