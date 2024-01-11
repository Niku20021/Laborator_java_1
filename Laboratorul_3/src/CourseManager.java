package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class CourseManager implements ManagerCourseOperations {
    Course[] courses;

    public CourseManager() {
        Connection conn = null;
        courses = new Course[0];
    }
    double grades[] = {7.6, 8.7, 9.3, 6.4, 8.1};
    double gradesProfessor[] = {7, 7.1, 7.2, 7.3, 7.8, 5.4};
    public void AddCourse(Course course) {
        int newLength = courses.length + 1;
        Course[] aux = new Course[newLength];
        int index = 0;
        for(Course c : courses) {
            aux[index++] = c;
        }
        aux[index] = course;
        this.courses = new Course[newLength];
        System.arraycopy(aux,0,courses, 0,newLength);

    }

    @Override
    public void UpdateCourse(Course courseToUpdate) {

        for (int i = 0; i < courses.length; i++) {
            if (courses[i].name.equals(courseToUpdate.name)) {
                courses[i].description = courseToUpdate.description;
                courses[i].teacher = courseToUpdate.teacher;
                courses[i].students = courseToUpdate.students;
                break;
            }
        }
    }

    @Override
    public void DeleteCourse(Course courseToDelete) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].name.equals(courseToDelete.name)) {
                Course[] updatedCourses = new Course[courses.length - 1];
                for (int j = 0, k = 0; j < courses.length; j++) {
                    if (j != i) {
                        updatedCourses[k++] = courses[j];
                    }
                }
                this.courses = updatedCourses;
                break;
            }
        }
    }


    public void enrollStudent(String courseName,Student student)
    {
        Course targetCourse = null;
        for(Course course : courses){
            if(course.name.equals(courseName)) {
                targetCourse = course;
                break;
            }
        }
        if(targetCourse != null){
            targetCourse.addStudent(student);
            System.out.println(student + "a fost inscris la" + courseName);
        }
        else System.out.println("Cursul cu numele" + courseName + "nu exista");

    }

    public Student[] listStudentsInCourse(String courseName)
    {
        Course targetCourse = null;
        for(Course course : courses) {
            if(course.name.equals(courseName)){
                targetCourse = course;
                break;
            }
        }
        if (targetCourse != null) {
            return targetCourse.getEnrolledStudents();
        } else {
            return new Student[0];
        }
    }
    public double calculateAverageGradeForCourse(String courseName, double[] grades) {
        Course targetCourse = null;
        for (Course course : courses) {
            if (course.name.equals(courseName)) {
                targetCourse = course;
                break;
            }
        }

        if (targetCourse != null) {
            if (grades.length > 0) {
                double sum = 0.0;
                for (double grade : grades) {
                    sum += grade;
                }
                return sum / grades.length;
            } else {
                System.out.println("Nu exista note pentru " + courseName);
                return 0.0;
            }
        } else {
            System.out.println("Cursul " + courseName + " nu exista.");
            return 0.0;
        }
    }

    public double calculateAverageProfessorGrade(double[] gradesProfessor) {
        if (gradesProfessor.length == 0) {
            return 0.0; // Return 0 for an empty array or handle as needed
        }

        double sum = 0.0;
        for (double gradeProfessor : gradesProfessor) {
            sum += gradeProfessor;
        }

        return sum / gradesProfessor.length;
    }

    public void DisplayCoursesToConsole() {
        for (Course c : courses) {
            System.out.println(c);
        }
    }

}