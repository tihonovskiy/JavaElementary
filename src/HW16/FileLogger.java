package HW16;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger {
    private FileLoggerConfiguration flc;
    private BufferedWriter writer;
    private final File fileDebug;
    private final File fileInfo;
    private final FileWriter fileWriterDebug;
    private final FileWriter fileWriterInfo;

    public FileLogger() throws IOException {
        this.flc = new FileLoggerConfiguration();
        fileDebug = new File("./debug.txt");
        fileInfo = new File("./info.txt");
        fileWriterDebug = new FileWriter(fileDebug);
        fileWriterInfo = new FileWriter(fileInfo);

    }

    public void debug(String message) throws IOException, FileMaxSizeReachedException {
        if(fileDebug.length() > flc.getMaxSizeFile()) {
            throw new FileMaxSizeReachedException("Actual fileSize = " + fileDebug.length() + " maxSize = " + flc.getMaxSizeFile());
        }
        flc = new FileLoggerConfiguration(fileDebug, LoggingLevel.DEBUG);
        writer = new BufferedWriter(fileWriterDebug);
        flc.setWriteFormat(message);
        writeToFile();
    }

    public void info(String message) throws IOException {
        flc = new FileLoggerConfiguration(fileInfo, LoggingLevel.INFO);
        writer = new BufferedWriter(fileWriterInfo);
        flc.setWriteFormat(message);
        writeToFile();
    }

    public void writeToFile() throws IOException {
        writer.write(flc.getWriteFormat());
        writer.newLine();
        writer.flush();
    }

    public File getFileInfo() {
        return fileInfo;
    }
}
