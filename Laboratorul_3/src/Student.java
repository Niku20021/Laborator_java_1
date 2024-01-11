package classes;

public class Student extends Person {


    int groupNumber;

    public Student(String firstName, String lastName, int groupNumber) {
        this.name = firstName;
        this.surname = lastName;
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {

        return "Student{" + "name=" + name + ", surname=" + surname
                + ", groupNumber="  + groupNumber + '}';
    }



    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }


}