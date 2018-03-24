package com.example.adrian.pawsible;

import com.prolificinteractive.materialcalendarview.CalendarDay;

import java.util.ArrayList;
import java.util.Date;
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
    private ArrayList<Session> sessionTracker;

    public Owner(String name, String contact, String address, int postalCode) {
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.postalCode = postalCode;
        sessionTracker = new ArrayList<Session>();
        dogs = new ArrayList<Dog>();
    }

    public void AddSession(Session session){
        sessionTracker.add(session);
    }

    public List<Session> GetSessionsByDog(Dog dog){
        List<Session> tempSessions = new ArrayList<Session>();
        for (int i = 0; i < sessionTracker.size(); i++){
            if (sessionTracker.get(i).getDog() == dog) {
                tempSessions.add(sessionTracker.get(i)); //add specific session to temp session shown under owner > dog
        }
        return tempSessions;
    }

    public List<Session> GetSessionsByDate(int fromYear, int fromMonth, int toYear, int toMonth){
        Date fromDay = new Date(fromYear, fromMonth,  0);
        Date toDay = new Date(toYear, toMonth, 31);
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

    public void addDog(Dog dog){
        if (dogs.contains(dog)) {
            System.out.println("Dog already exists");   //Need to show on UI next time
            return;
        }

        dogs.add(dog);

    }

    public void removeDog(Dog dog){
        if (!dogs.contains(dog)) {
            System.out.println("Dog does not exist");
            return;
        }
        dogs.remove(dog);
    }
}
