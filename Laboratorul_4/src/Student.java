public class Student {
    private String nume;
    private String prenume;
    private int id;

    public Student(String nume, String prenume, int id) {
        this.nume = nume;
        this.prenume = prenume;
        this.id = id;
    }

    // Getteri și setteri pentru a accesa și modifica atributele

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
