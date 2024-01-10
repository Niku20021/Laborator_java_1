import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Clasa care reprezintă o înregistrare în fișierul CSV
class MyData implements Comparable<MyData> {
    //2 camputir private field1 si field2
    private String field1;
    private int field2;

    // Constructor pt ininitializarea campurilor
    public MyData(String field1, int field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    // Getteri pentru câmpuri pentru a obtine valorile campurilor field 1 si field 2
    public String getField1() {
        return field1;
    }

    public int getField2() {
        return field2;
    }

    // Metoda compareTo pentru interfața Comparable
    @Override
    public int compareTo(MyData other) {
        // Aici am definit logica mea  de comparare între obiecte
        // În acest exemplu, vom compara după field1
        return this.field1.compareTo(other.field1);
    }
}

// Clasa Comparator pentru a ordona obiectele MyData după field2
class MyDataComparator implements Comparator<MyData> {
    @Override
    public int compare(MyData obj1, MyData obj2) {
        // Aici poți defini logica de comparare între obiecte
        // În acest exemplu, vom compara după field2
        return Integer.compare(obj1.getField2(), obj2.getField2());
    }
}

public class Main {
    private static Object ugleanicolae;
    private static Object Users;
    private static Object Desktop;
    private static Object etti;
    private static Object JAVA;
    private static Object LAB;
    private static Object tema_java_1;

    public static void main(String[] args) {
        // Citirea datelor din CSV și crearea obiectelor MyData
        List<MyData> dataList;
        dataList = Collections.unmodifiableList(readDataFromCSV(Users / ugleanicolae / Desktop / etti / JAVA tema_java_1 / LAB);

        // Sortarea folosind Comparable
        Collections.sort(dataList);

        // Afișarea rezultatului sortării
        System.out.println("Sortare folosind Comparable:");
        for (MyData data : dataList) {
            System.out.println(data.getField1() + ", " + data.getField2());
        }

        // Sortarea folosind Comparator
        Collections.sort(dataList, new MyDataComparator());

        // Afișarea rezultatului sortării
        System.out.println("\nSortare folosind Comparator:");
        for (MyData data : dataList) {
            System.out.println(data.getField1() + ", " + data.getField2());
        }
    }

    // Metodă pentru citirea datelor din fișierul CSV și crearea obiectelor MyData
    private static List<MyData> readDataFromCSV(String filePath) {
        List<MyData> dataList = new ArrayList<>();
//folosesc bufferedreader pt a citi elementele din fiserul csv
        //pt fiecare linie se separa valorile folosind split adica virgula pt a obtine un array de siruri
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Separarea datelor în funcție de separatorul CSV
                String[] parts = line.split(",");

                // Verificare dacă avem suficiente coloane în linie
                if (parts.length >= 2) {
                    // Verificare dacă șirul poate fi transformat într-un număr
                    try {
                        int field2Value = Integer.parseInt(parts[1].trim());
                        // Crearea unui obiect MyData și adăugarea lui în listă
                        dataList.add(new MyData(parts[0], field2Value));
                    } catch (NumberFormatException e) {
                        System.err.println("Avertisment: Ignorând linia cu date incorecte: " + line);

                    }
                } else {
                    System.err.println("Avertisment: Ignorând linia cu date incorecte: " + line);

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataList;
    }
}
