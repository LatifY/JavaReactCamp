package Entities;

import Abstract.Entity;

public class Product implements Entity {
    public int id;
    public String name;
    public float price;
    public String description;

    public Product(){}
    public Product(int id, String name, float price, String description){
        this();
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString(){
        String result = String.format("*PRODUCT* [Id: %s] [Name: %s] [Price: %s] [Description: %s]",id,name,price,description);
        return result;
    }
}
