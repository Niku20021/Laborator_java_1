import java.util.HashSet;
import java.util.Set;

public class Curs {
    private String nume;
    private String descriere;
    private Set<Student> studenti;

    public Curs(String nume, String descriere) {
        this.nume = nume;
        this.descriere = descriere;
        this.studenti = new HashSet<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public Set<Student> getStudenti() {
        return studenti;
    }

    public void adaugaStudent(Student student) {
        studenti.add(student);
    }

    public void stergeStudent(Student student) {
        studenti.remove(student);
    }
}