package com.example.adrian.pawsible;

import java.util.List;

/**
 * Created by Adrian on 24/3/2018.
 */

public class Owner {
    private String name;
    private String number;
    private List<Dog> dogs;

    public Owner(String name, String number) {
        this.name = name;
        this.number = number;
    }
}
