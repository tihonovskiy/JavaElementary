package HW16;

import java.io.*;

public class FileLoggerConfigurationLoader {

    public FileLoggerConfiguration load(File file) throws IOException {
        FileLoggerConfiguration loadFlc = new FileLoggerConfiguration();
        BufferedReader br = new BufferedReader(new FileReader(file));

        loadFlc.setFile(file);
        loadFlc.setWriteFormat(br.readLine());

        return loadFlc;
    }
}
