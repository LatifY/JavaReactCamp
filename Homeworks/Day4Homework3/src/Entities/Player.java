package Entities;

import Abstract.Entity;

import java.util.Date;

public class Player implements Entity {
    public int id;
    public String userName;
    public String firstName;
    public String lastName;
    public Date dateOfBirth;
    public String nationalityId;

    public Player(){}
    public Player(int id, String userName, String firstName, String lastName, Date dateOfBirth, String nationalityId){
        this();
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }

    @Override
    public String toString(){
        String result = String.format("*PLAYER* [Id: %s] [User Name: %s] [First Name: %s] [Last Name: %s] [Date Of Birth: %s] [Nationality Id: %s]",id,userName,firstName,lastName,dateOfBirth,nationalityId);
        return result;
    }
}
