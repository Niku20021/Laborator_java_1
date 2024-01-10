import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface DBManager {
    Connection getConnection() throws SQLException;
}

public class MySQLDBManager implements DBManager {
    private static final String URL = "jdbc:mysql://localhost:3306/nume_baza_de_date";
    private static final String USER = "utilizator";
    private static final String PASSWORD = "parola";

    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

public interface OperatiiManagerCursuri {
    void AddCurs(Curs curs);
    void UpdateCurs(Curs curs);
    void DeleteCurs(Curs curs);
}

public class ManagerCursuri implements OperatiiManagerCursuri {
    private DBManager dbManager;

    public ManagerCursuri(DBManager dbManager) {
        this.dbManager = dbManager;
    }

    @Override
    public void AddCurs(Curs curs) {
        // Implementează adăugarea cursului în baza de date
        try (Connection connection = dbManager.getConnection()) {
            // ... restul codului pentru adăugarea în baza de date
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void UpdateCurs(Curs curs) {
        // Implementează actualizarea cursului în baza de date
        try (Connection connection = dbManager.getConnection()) {
            // ... restul codului pentru actualizare în baza de date
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void DeleteCurs(Curs curs) {
        // Implementează ștergerea cursului din baza de date
        try (Connection connection = dbManager.getConnection()) {
            // ... restul codului pentru ștergere din baza de date
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

public class Persoana {
    // implementarea clasei Persoana
}

public class Curs {
    // implementarea  clasei Curs
}

public class Main {
    public static void main(String[] args) {
        // Exemplu de utilizare a claselor
        DBManager dbManager = new MySQLDBManager();
        OperatiiManagerCursuri managerCursuri = new ManagerCursuri(dbManager);

        // Creează un curs și îl adaugă în baza de date
        Curs curs = new Curs();
        curs.setNume("Java Programming");
        curs.setDescriere("Learn Java programming language");
        managerCursuri.AddCurs(curs);

        // Alte operații similare pentru Persoana și altele pot fi implementate aici
    }
}
