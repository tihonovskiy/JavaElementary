package HW16;

import java.io.*;

public class FileLoggerConfigurationLoader {

    public static FileLoggerConfiguration load(File file) throws IOException {
        FileLoggerConfiguration loadFlc = new FileLoggerConfiguration();
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        while ((line = br.readLine()) != null) {
            if (line.contains(ConfigParams.FILE.name())) {
                loadFlc.setFile(new File(line.split(": ")[1]));
            } else if (line.contains(ConfigParams.MAX_SIZE.name())) {
                loadFlc.setMaxSizeFile(Byte.valueOf(line.split(": ")[1]));
            } else if (line.contains(ConfigParams.LEVEL.name())) {
                loadFlc.setLevel(LoggingLevel.valueOf(line.split(": ")[1]));
            } else if (line.contains(ConfigParams.FORMAT.name())) {
                loadFlc.setWriteFormat(line.split(": ")[1]);
            }
        }

        return loadFlc;
    }
}
