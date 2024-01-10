package clase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class ClasaDemo {
    public static void main(String[] args) {
        System.out.println("test");
        introducre_date();
        System.out.println(citire_date());

    }

    public static void introducre_date() {
        File f = new File("C://Users/brawl/Desktop/JAVA 2021/lab6_inceput/test.csv");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
            bw.write("MESAJ DUTU.\n");
            bw.flush();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            //
        }
    }

    public static String citire_date() {
        File file = new File("C://Users/brawl/Desktop/JAVA 2021/lab6_inceput/test.csv");
        String aux = null; // aici initialiezi ca si lista si dai return la lista

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            // String st;
            // st = br.readLine();

            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {

                aux = (sc.nextLine());
                // System.out.println(sc.nextLine());

            }

        } catch (IOException e) {
            System.out.println(e);
        }

        return aux;

    }
}
