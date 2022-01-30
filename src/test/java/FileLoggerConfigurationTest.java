import Logger.FileLoggerConfiguration;
import Logger.LoggedLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

public class FileLoggerConfigurationTest {
    FileLoggerConfiguration fileLoggerConfiguration =
            new FileLoggerConfiguration(new File("myFile.txt"),
                    LoggedLevel.INFO,
                    (byte) 100,
                    "[%s][%s] Message:[%s]");

    @Test
    public void testFile() {
        Assertions.assertEquals(new File("myFile.txt"), fileLoggerConfiguration.getFile());
    }

    @Test
    public void testLoggedLevelValue() {
        Assertions.assertEquals(LoggedLevel.INFO, fileLoggerConfiguration.getLevel());
    }

    @Test
    public void testMaxSizeValue() {
        Assertions.assertEquals((byte) 100, fileLoggerConfiguration.getMaxSizeFile());
    }

    @Test
    public void testWriteFormatValue() {
        Assertions.assertEquals("[%s][%s] Message:[%s]", fileLoggerConfiguration.getWriteFormat());
    }
}
