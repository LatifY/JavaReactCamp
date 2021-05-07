import java.util.ArrayList;
import java.util.List;

public class CourseManager{
    List<Course> courses = new ArrayList<>();

    public void Add(Course course){
        courses.add(course);
        System.out.println("Course added: "+ course.title);
    }

    public void Delete(int index){
        System.out.println("Course removed: "+ courses.get(index).title);
        courses.remove(index);
    }
}