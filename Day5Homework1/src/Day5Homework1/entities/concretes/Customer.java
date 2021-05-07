package Day5Homework1.entities.concretes;

import Day5Homework1.entities.abstracts.Entity;

public class Customer implements Entity {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean verified = false;

    public Customer(){}
    public Customer(int id, String firstName, String lastName, String email, String password){
        this();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getInfoText(){
        String result = String.format("%s [id : %s]", email, id);
        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getVerified(){
        return verified;
    }

    public void setVerified(boolean verified){
        this.verified = verified;
    }
}
