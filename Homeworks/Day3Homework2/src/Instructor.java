public class Instructor extends User{
    public String biography;

    Instructor(){}
    Instructor(int id, String firstName, String lastName, String profilePicture, String email, String password, String biography){
        super(id, firstName, lastName, profilePicture, email, password);
        this.biography = biography;
    }

    @Override
    public String toString(){
        String result = String.format("[Id: %s] [First Name: %s] [Last Name: %s] [Profile Picture: %s] [Email: %s] [Password: %s] [Biograpy: %s]",id,firstName,lastName,profilePicture,email,password, biography);
        return result;
    }

}
