package HW10;

public class MySizeArrayException extends RuntimeException {
    public MySizeArrayException(String message) {
        super(message);
    }

    public MySizeArrayException(String message, Throwable cause) {
        super(message, cause);
    }
}
