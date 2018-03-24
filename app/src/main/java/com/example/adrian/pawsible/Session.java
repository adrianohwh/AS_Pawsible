package com.example.adrian.pawsible;

import com.prolificinteractive.materialcalendarview.CalendarDay;

import java.util.Date;

/**
 * Created by Adrian on 24/3/2018.
 */

public class Session {
    private Dog dog;
    private Owner owner;
    private Date date;

    public Session(Dog dog, int year, int month, int day){
        this.dog = dog;
        this.owner = dog.GetOwner();
        date = new Date(year, month, day);
    }

    public void StartSession(){

    }

    public void EndSession(){

    }

    public Dog getDog(){
        return dog;
    }
}

