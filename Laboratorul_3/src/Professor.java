package classes;

public class Professor extends Person {


    public String toString() {
        return "Professor{" + "name=" + name + ", surame=" +
                surname + '}';
    }

    public Professor(String firstName, String lastName) {
        this.name = firstName;
        this.surname = lastName;

    }

}