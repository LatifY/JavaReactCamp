import java.util.List;

public class StudentManager {

    public void Add(Student student){
        System.out.println("Student added: " + student.toString());
    }

    public void Update(Student student){
        System.out.println("Student updated: " + student.toString());
    }

    public void Delete(Student student){
        System.out.println("Student deleted: " + student.toString());
    }
}