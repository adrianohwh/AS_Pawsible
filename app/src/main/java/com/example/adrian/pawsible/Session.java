package com.example.adrian.pawsible;

import com.prolificinteractive.materialcalendarview.CalendarDay;

import java.util.Date;

/**
 * Created by Adrian on 24/3/2018.
 */

public class Session {
    public enum SESSIONSTATUS{
        PAID,
        INVOICED,
        UNPAID
    }

    private Dog dog;
    private Owner owner;
    private Date date;
    private SESSIONSTATUS status;

    public Session(Dog dog, int year, int month, int day){
        this.dog = dog;
        this.owner = dog.GetOwner();
        date = new Date(year, month, day);
        status = SESSIONSTATUS.UNPAID;
    }

    public void StartSession(){

    }

    public void EndSession(){

    }

    public Dog getDog(){
        return dog;
    }

    public Date getDate(){
        return date;
    }

    public SESSIONSTATUS getStatus() {
        return status;
    }

    public void InvoiceSent(){
        status = SESSIONSTATUS.INVOICED;
    }

    public void Paid(){
        status = SESSIONSTATUS.PAID;
    }
}

