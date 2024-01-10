public class Curs {
    private String nume;
    private String descriere;
    private Profesor profesor;
    private Student[] studenti;

    public Curs(String nume, String descriere, Profesor profesor, Student[] studenti) {
        this.nume = nume;
        this.descriere = descriere;
        this.profesor = profesor;
        this.studenti = studenti;
    }

    // Getteri și setteri pentru a accesa și modifica atributele

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

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Student[] getStudenti() {
        return studenti;
    }

    public void setStudenti(Student[] studenti) {
        this.studenti = studenti;
    }
}

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
