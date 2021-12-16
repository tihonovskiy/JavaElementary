package HW16;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        FileLogger fileLogger = new FileLogger(FileLoggerConfigurationLoader.load(new File("./config.txt")));

        fileLogger.info("info1");
        fileLogger.info("info2");
        fileLogger.info("info3");
        fileLogger.info("info4");
        fileLogger.debug("debug1");
        fileLogger.debug("debug2");
        fileLogger.debug("debug3");
        fileLogger.debug("debug4");
    }

}
