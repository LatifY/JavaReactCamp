public class Student extends User{
    public String country;
    public String city;

    Student(){}
    Student(int id, String firstName, String lastName, String profilePicture, String email, String password, String country, String city ){
        super(id, firstName ,lastName, profilePicture, email, password);
        this.country = country;
        this.city = city;
    }

    @Override
    public String toString(){
        String result = String.format("[Id: %s] [First Name: %s] [Last Name: %s] [Profile Picture: %s] [Email: %s] [Password: %s] [Country: %s] [City: %s]",id,firstName,lastName,profilePicture,email,password,country,city);
        return result;
    }

}
