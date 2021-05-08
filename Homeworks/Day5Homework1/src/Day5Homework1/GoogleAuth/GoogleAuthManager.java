package Day5Homework1.GoogleAuth;

public class GoogleAuthManager {
    public void register(int id, String firstName, String lastName, String email, String password){
        System.out.println(String.format("Google Registration Successful: %s [%s]",email ,id ));
    }
    public void login(String email, String password){
        System.out.println(String.format("Google Login Successful: %s",email));
    }
}
