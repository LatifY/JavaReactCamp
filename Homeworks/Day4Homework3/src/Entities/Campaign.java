package Entities;

import Abstract.Entity;

public class Campaign implements Entity {
    public int id;
    public String name;
    public byte discount;

    public Campaign(){}
    public Campaign(int id, String name, byte discount){
        this();
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    @Override
    public String toString(){
        String result = String.format("*CAMPAIGN* [Id: %s] [Name: %s] [Discount: %s]",id,name,discount);
        return result;
    }


}
