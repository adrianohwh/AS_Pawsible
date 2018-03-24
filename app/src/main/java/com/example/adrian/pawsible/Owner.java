package com.example.adrian.pawsible;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 24/3/2018.
 */

public class Owner {
    private String name;
    private String contact;
    private String address;
    private int postalCode;
    private ArrayList<Dog> dogs;

    public Owner(String name, String contact, String address, int postalCode) {
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.postalCode = postalCode;
        dogs = new ArrayList<Dog>();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getContact(){
        return contact;
    }

    public void setContact(String contact){
        this.contact = contact;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getPostalCode(){
        return postalCode;
    }

    public void setPostalCode(int postalCode){
        this.postalCode = postalCode;
    }

    public void addDog(){}
}
