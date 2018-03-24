package com.example.adrian.pawsible;

/**
 * Created by Adrian on 24/3/2018.
 */

public class Session {
    private Dog dog;
    private Owner owner;

    public Session(Dog dog){
        this.dog = dog;
        this.owner = dog.GetOwner();
    }

    public void StartSession(){

    }

    public void EndSession(){

    }
}
