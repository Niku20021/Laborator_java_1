package classes;

public class Student {

    String firstName;
    String lastName;
    int groupNumber;

    public Student(String firstName, String lastName, int groupNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {

        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName
                + ", groupNumber="  + groupNumber + '}';
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public int getGroupNumber() {

        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {

        this.groupNumber = groupNumber;
    }

    public String getFullname(){

        return firstName + " " + lastName;
    }
}