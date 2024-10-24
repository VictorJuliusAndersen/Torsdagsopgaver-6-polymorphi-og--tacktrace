import java.util.ArrayList;

//Task 3
public class Teacher extends Person {
    
    private ArrayList<String>canTeach;
    private ArrayList<String> currentCourses;

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = new ArrayList<>();
    }

    @Override
    public boolean addCourse(String course) {
        if (!canTeach.contains(course)) {
            return false; // Underviseren kan ikke undervise i dette fag
        }
        currentCourses.add(course);
        return true; // Kurset tilføjet til currentCourses
    }
    
}
