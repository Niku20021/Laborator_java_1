import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader implements Runnable {
    private String filePath;

    public CsvReader(String filePath) {
        this.filePath = filePath;
    }


    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                //citeste linie cu linie
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Calea către fișierul CSV
        String filePath = "/Users/ugleanicolae/Desktop/etti/JAVA LAB/tema_java_2/src";

        // Creează un obiect CsvReader
        CsvReader csvReader = new CsvReader(filePath);

        // Creează un obiect Thread și îl pornește
        Thread thread = new Thread(csvReader);
        thread.start();

        try {
            // Așteaptă ca thread-ul să se termine
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
