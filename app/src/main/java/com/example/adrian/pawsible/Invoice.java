package com.example.adrian.pawsible;

import java.util.ArrayList;

/**
 * Created by Adrian on 24/3/2018.
 */

public class Invoice {
    public ArrayList<Session> invoicedSessions;

    public Invoice(ArrayList<Session> invoicedSessions){
        this.invoicedSessions = invoicedSessions;
    }

    public void Paid(){
        for (int i = 0; i < invoicedSessions.size(); i++){
            invoicedSessions.get(i).Paid();
        }
    }
}
