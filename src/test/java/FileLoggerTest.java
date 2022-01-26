import Logger.FileLogger;
import Logger.FileLoggerConfigurationLoader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLoggerTest {
    FileLogger fileLogger;

    @Test
    public void testDebugMethod() throws IOException {
        fileLogger = new FileLogger(FileLoggerConfigurationLoader.load(new File("./config.txt")));
        fileLogger.debug("debug1");
        BufferedReader reader = new BufferedReader(new FileReader(new File("NewLog.txt")));
        Assertions.assertEquals("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "][DEBUG] Message:[debug1]",
                reader.readLine());
    }

    @Test
    public void testInfoMethod() throws IOException {
        fileLogger = new FileLogger(FileLoggerConfigurationLoader.load(new File("./config.txt")));
        fileLogger.info("info1");
        BufferedReader reader = new BufferedReader(new FileReader(new File("NewLog.txt")));
        Assertions.assertEquals("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "][INFO] Message:[info1]",
                reader.readLine());
    }

    @Test
    public void testDebugMethodWithFileLoggerIsNull() throws IOException {
        fileLogger = new FileLogger();
        Assertions.assertThrows(
                NullPointerException.class,
                new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        fileLogger.debug("debug1");
                    }
                });
    }

    @Test
    public void testInfoMethodWithFileLoggerIsNull() throws IOException {
        fileLogger = new FileLogger();
        Assertions.assertThrows(
                NullPointerException.class,
                new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        fileLogger.debug("info1");
                    }
                });
    }

}
