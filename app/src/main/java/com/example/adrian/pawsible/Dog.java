package com.example.adrian.pawsible;

/**
 * Created by Adrian on 24/3/2018.
 */
public class Dog {
    private String name;
    private Breed breed;
    private String birthday;
    private int age;
    private Owner owner;
    private Session session;

    public Dog(Owner owner, String name, Breed breed, String birthday, int age){
        this.owner = owner;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.birthday = birthday;
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

    public void setAge(int age){this.age = age;}

    public int getAge(){return age;}

    public Breed GetBreed(){
        return breed;
    }

    public void SetBreed(Breed breed){
        this.breed = breed;
    }

    public void setBirthday(String birthday) {this.birthday = birthday;}

    public String getBirthday(){return birthday;}

    public void StartSession(int year, int month, int day){
        session = new Session(this, year, month, day);
        session.StartSession();
        owner.AddSession(session);
    }

    public void EndSession(){
        session.EndSession();
        session = null;
    }

    public String toString()
    {
        return name + " " + breed + " " + age + " " + birthday;
    }
}
