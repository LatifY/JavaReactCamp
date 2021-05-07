import java.util.List;

public class InstructorManager {

    public void Add(Instructor instructor){
        System.out.println("Instructor added: " + instructor.toString());
    }

    public void Update(Instructor instructor){
        System.out.println("Instructor updated: " + instructor.toString());
    }

    public void Delete(Instructor instructor){
        System.out.println("Instructor deleted: " + instructor.toString());
    }
}