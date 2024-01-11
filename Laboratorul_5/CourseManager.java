import java.util.ArrayList;
import java.util.List;

public class CourseManager implements OperatiiManagerCursuri {
    private List<Curs> cursuri;

    public ManagerCursuri() {
        this.cursuri = new ArrayList<>();
    }

    public void AddCurs(Curs curs) {
        cursuri.add(curs);
    }

    public void UpdateCurs(Curs curs) {
        // Implementează actualizarea cursului în listă
    }

    @Override
    public void DeleteCurs(Curs curs) {
        cursuri.remove(curs);
    }

    public List<Curs> getCursuri() {
        return cursuri;
    }
}