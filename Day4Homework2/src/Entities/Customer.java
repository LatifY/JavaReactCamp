package Entities;

import Abstract.Entity;

import java.util.Date;

public class Customer implements Entity {
    public int id;
    public String firstName;
    public String lastName;
    public Date dateOfBirth;
    public String nationalityId;

    public Customer(){}
    public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId){
        this();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }
}
