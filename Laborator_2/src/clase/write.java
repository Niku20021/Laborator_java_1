package clase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class write {
    public static void introducre_date() {
        File f = new File("C://Users/brawl/Desktop/JAVA 2021/lab6_inceput/test.csv");

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write("Test12345");
            bw.flush();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
