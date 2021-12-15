package HW16;

public class Main {

    public static void main(String[] args) throws Exception {
        FileLogger fileLogger = new FileLogger();
        fileLogger.debug("Debug1");
        fileLogger.debug("Debug2");
        fileLogger.debug("Debug3");
        //fileLogger.debug("Debug4");

        fileLogger.info("MyInfo1");
        fileLogger.info("MyInfo2");
        fileLogger.info("MyInfo3");
        //fileLogger.info("MyInfo4");

        FileLoggerConfigurationLoader flcl = new FileLoggerConfigurationLoader();
        flcl.load(fileLogger.getFileInfo());
    }

}
