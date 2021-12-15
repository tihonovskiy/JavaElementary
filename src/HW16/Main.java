package HW16;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        myTest();
    }

    public static void myTest() throws IOException {
        File file = new File("./test.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write("my string");
        bw.newLine();
        bw.flush();
        System.out.println(file.length());
    }
}
