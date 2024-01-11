package classes;

public class Classes {
    public static void main(String[] args) {
        classes.Student[] students = new classes.Student[]{new classes.Student("Andrei","Negoita",
                2231), new classes.Student("Ion","Matescu",4221)};
        classes.Student student = new classes.Student("Matei","Popescu",2331);
        classes.Professor prof = new classes.Professor("Anton", "Panaitescu");

        classes.Course course = new classes.Course("Material Resistance","Calculations of reactions , \n"
                + "effort diagrams, calculations of geometric characteristics of \n" +
                "flat surfaces and calculations of resistance elements to simple stresses",prof,students);

        classes.CourseManager courseManager = new classes.CourseManager();
        courseManager.AddCourse(course);

        courseManager.DisplayCoursesToConsole();
        courseManager.listStudentsInCourse("Material Resistance");
        courseManager.UpdateCourse(course);
    }
}