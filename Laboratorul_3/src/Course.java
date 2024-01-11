package classes;
import java.util.ArrayList;
import java.util.List;
public class Course implements CourseOperations {
    String name;
    String description;
    Professor teacher;
    List<Student> students;


    public Course(String name, String description,
                  Professor teacher, List<Student> students) {
        this.name = name;
        this.description = description;
        this.teacher = teacher;
        this.students = students;
    }


    public void addStudent(Student student) {
        students.add(student);
    }


    public void UpdateProfessor(Professor teacher){

        this.teacher = teacher;
    }
    public void UpdateStudent(Student studentToUpdate) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals(studentToUpdate)) {
                students.set(i, studentToUpdate);
                break;
            }
        }
    }
    public void UpdateCourse(String name,String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Professor getTeacher() {
        return teacher;
    }

    public void setTeacher(Professor teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String toString() {
        StringBuilder str = new StringBuilder("Course: " + "name=" + name + ", description=" + description + ",\nTeacher=" + teacher + ",\nStudents:\n");
        for (Student s : students) {
            str.append(s).append("\n");
        }
        return str.toString();
    }
