public class User {
    public int id;
    public String firstName;
    public String lastName;
    public String profilePicture;
    public String email;
    public String password;

    public String getFullName(){
        return firstName + " " + lastName;
    }

    User(){}
    User(int id, String firstName, String lastName, String profilePicture, String email, String password){
        this();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.profilePicture = profilePicture;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString(){
        String result = String.format("[Id: %s] [First Name: %s] [Last Name: %s] [Profile Picture: %s] [Email: %s] [Password: %s]",id,firstName,lastName,profilePicture,email,password);
        return result;
    }


}
