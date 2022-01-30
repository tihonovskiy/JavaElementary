package Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger {
    private FileLoggerConfiguration flc;
    private BufferedWriter writer;
    private FileWriter fileLogWriter;


    public FileLogger(FileLoggerConfiguration newflc) throws IOException {
        flc = newflc;
        fileLogWriter = new FileWriter(flc.getFile());
    }

    public FileLogger() {

    }

    public void debug(String message) throws IOException {
        if (flc.getLevel() == LoggedLevel.DEBUG) {
            checkFileSize();
            writer = new BufferedWriter(fileLogWriter);
            writeToFile(String.format(flc.getWriteFormat(), LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LoggedLevel.DEBUG, message));
        }
    }

    public void info(String message) throws IOException {
        checkFileSize();
        writer = new BufferedWriter(fileLogWriter);
        writeToFile(String.format(flc.getWriteFormat(), LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LoggedLevel.INFO, message));
    }

    public void writeToFile(String logMessage) throws IOException {
        writer.write(logMessage);
        writer.newLine();
        writer.flush();
    }

    private void checkFileSize() throws IOException {
        if (flc.getFile().length() > flc.getMaxSizeFile()) {
            File newFile = new File(String.format("./Log_%s.txt", LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("yyyy_MM_dd HH-mm-ss.SSS"))));
            flc.setFile(newFile);
            fileLogWriter = new FileWriter(newFile);
        }
    }
}
