public class MockClassesManager {
    public static void main(String[] args) {
        ManagerCursuri managerCursuri = new ManagerCursuri();

        // Adăugăm un curs
        Curs curs1 = new Curs("Java Programming", "Learn Java programming language");
        managerCursuri.AddCurs(curs1);

        // Adăugăm studenți la curs
        Student student1 = new Student("John", "Doe", "Group1");
        Student student2 = new Student("Alice", "Smith", "Group1");
        curs1.adaugaStudent(student1);
        curs1.adaugaStudent(student2);

        // Obținem lista de cursuri și afișăm informații
        List<Curs> cursuri = managerCursuri.getCursuri();
        for (Curs curs : cursuri) {
            System.out.println("Nume curs: " + curs.getNume());
            System.out.println("Descriere: " + curs.getDescriere());
            System.out.println("Studenti:");
            for (Student student : curs.getStudenti()) {
                System.out.println("  " + student.getNume() + " " + student.getPrenume() + " " + student.getGrupa());
            }
        }
    }
}