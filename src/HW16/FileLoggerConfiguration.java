package HW16;

import java.io.File;
import java.util.Date;

public class FileLoggerConfiguration {
    private File file;
    private LoggingLevel level;
    private byte maxSizeFile = 127;
    private String writeFormat;

    public FileLoggerConfiguration() {
    }

    public FileLoggerConfiguration(File file, LoggingLevel level) {
        this.file = file;
        this.level = level;
    }

    public byte getMaxSizeFile() {
        return maxSizeFile;
    }

    public String getWriteFormat() {
        return writeFormat;
    }

    public void setWriteFormat(String writeFormat) {
        this.writeFormat = "[" + new Date() + "][" + level + "]" + "Message:[" + writeFormat + "]";;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setLevel(LoggingLevel level) {
        this.level = level;
    }

    public void setMaxSizeFile(byte maxSizeFile) {
        this.maxSizeFile = maxSizeFile;
    }
}
