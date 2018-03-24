package com.example.adrian.pawsible;

/**
 * Created by Adrian on 24/3/2018.
 */
public class Dog {
    private String name;
    private Breed breed;
    private Owner owner;
    private Session session;

    public Dog(Owner owner, String name, Breed breed){
        this.owner = owner;
        this.name = name;
        this.breed = breed;
    }

    public Owner GetOwner(){
        return owner;
    }

    public void SetOwner(Owner owner){
        this.owner = owner;
    }

    public String GetName(){
        return name;
    }

    public void SetName(String name){
        this.name = name;
    }

    public Breed GetBreed(){
        return breed;
    }

    public void SetBreed(Breed breed){
        this.breed = breed;
    }

    public void StartSession(int year, int month, int day){
        session = new Session(this, year, month, day);
        session.StartSession();
    }

    public void EndSession(){
        session.EndSession();
        session = null;
    }
}
