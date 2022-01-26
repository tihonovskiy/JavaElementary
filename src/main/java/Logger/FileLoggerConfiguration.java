package Logger;

import java.io.File;

public class FileLoggerConfiguration {
    private File file;
    private LoggedLevel level;
    private byte maxSizeFile = 127;
    private String writeFormat = "[%s][%s] Message:[%s]";

    public FileLoggerConfiguration() {
    }

    public FileLoggerConfiguration(File file, LoggedLevel level, byte maxSizeFile, String writeFormat) {
        this.file = file;
        this.level = level;
        this.maxSizeFile = maxSizeFile;
        this.writeFormat = writeFormat;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public LoggedLevel getLevel() {
        return level;
    }

    public void setLevel(LoggedLevel level) {
        this.level = level;
    }

    public byte getMaxSizeFile() {
        return maxSizeFile;
    }

    public void setMaxSizeFile(byte maxSizeFile) {
        this.maxSizeFile = maxSizeFile;
    }

    public String getWriteFormat() {
        return writeFormat;
    }

    public void setWriteFormat(String writeFormat) {
        this.writeFormat = writeFormat;
    }
}
