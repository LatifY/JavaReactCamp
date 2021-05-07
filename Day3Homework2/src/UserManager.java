import java.util.List;

public class UserManager {

    public void Add(User user){
        System.out.println("User added: " + user.toString());
    }

    public void Update(User user){
        System.out.println("User updated: " + user.toString());
    }

    public void Delete(User user){
        System.out.println("User deleted: " + user.toString());
    }
}