//Task 3
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        // Opret studerende
        ArrayList<String> passedCoursesStudent1 = new ArrayList<>();
        passedCoursesStudent1.add("Math 101");
        Student student1 = new Student("Victor", passedCoursesStudent1);

        ArrayList<String> passedCoursesStudent2 = new ArrayList<>();
        Student student2 = new Student("Sofus", passedCoursesStudent2);

        persons.add(student1);
        persons.add(student2);

        // Opret undervisere
        ArrayList<String> canTeachTeacher1 = new ArrayList<>();
        canTeachTeacher1.add("Java 1.0");
        Teacher teacher1 = new Teacher("Jesper", canTeachTeacher1);

        ArrayList<String> canTeachTeacher2 = new ArrayList<>();
        Teacher teacher2 = new Teacher("Tess", canTeachTeacher2);

        persons.add(teacher1);
        persons.add(teacher2);

        // Test addCourse for alle
        for (Person person : persons) {
            boolean result = person.addCourse("Java 1.0");
            if (!result) {
                if (person instanceof Student) {
                    System.out.println(person.getName() + " har allerede bestået dette kursus.");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan ikke undervise i dette fag.");
                }
            }
        }
    }
}
