package HW16;

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

    public void debug(String message) throws FileMaxSizeReachedException, IOException {
        if (flc.getLevel() == LoggingLevel.DEBUG) {
            checkFileSize();
            writer = new BufferedWriter(fileLogWriter);
            writeToFile(String.format(flc.getWriteFormat(), LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LoggingLevel.DEBUG, message));
        }
    }

    public void info(String message) throws IOException {
        checkFileSize();
        writer = new BufferedWriter(fileLogWriter);
        writeToFile(String.format(flc.getWriteFormat(), LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), LoggingLevel.INFO, message));
    }

    public void writeToFile(String logMessage) throws IOException {
        writer.write(logMessage);
        writer.newLine();
        writer.flush();
    }

    private void checkFileSize() throws IOException {
        if (flc.getFile().length() > flc.getMaxSizeFile()) {
            //throw new FileMaxSizeReachedException("Actual fileSize = " + flc.getFile().length() + " maxSize = " + flc.getMaxSizeFile());
            File newFile = new File(String.format("./Log_%s.txt", LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("yyyy_MM_dd HH-mm-ss.SSS"))));
            flc.setFile(newFile);
            fileLogWriter = new FileWriter(newFile);
        }
    }
}
