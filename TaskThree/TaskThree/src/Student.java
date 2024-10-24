import java.util.ArrayList;

//Task 3
public class Student extends Person{

    private ArrayList<String>passedCourses;
    private ArrayList<String> currentCourses;
    
    public Student(String name,ArrayList<String>passedCourses){
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList<>();
        
    }

    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)) {
            return false; // Kurset er allerede bestået
        }
        currentCourses.add(course);
        return true; // Kurset tilføjet til currentCourses
    }

}
