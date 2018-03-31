package com.example.adrian.pawsible;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.util.SortedList;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dogtest extends AppCompatActivity {
    public EditText dogName;
    public EditText age;
    public Spinner spinner;
    public EditText birthday;
    public Button addDog_btn;
    public TextView dogDetails;
    Dog dogTest;

    public void Init() {
        dogName = (EditText) findViewById(R.id.dogName);
        age = (EditText) findViewById(R.id.dogAge);
        spinner = (Spinner) findViewById(R.id.dogSpinner);
        birthday = (EditText) findViewById(R.id.dogBirthday);
        addDog_btn = (Button) findViewById(R.id.addDog_btn);
        dogDetails = (TextView) findViewById(R.id.dogDetails);

        final List<String> dogBreeds = new ArrayList<String>();
        for (int i = 0; i < Breed.values().length; i++){
            String name = Breed.values()[i].name();
            name = name.replace("_", " ");
            dogBreeds.add(name);
        }
        Collections.sort(dogBreeds);

        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, dogBreeds.toArray(new String[0])));//(new ArrayAdapter<Breed>(this, android.R.layout.simple_spinner_item, Breed.values()));

        dogName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dogName.setText("");
                dogName.setHint("Dog Name");
            }
        });

        age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                age.setText("");
                age.setHint("Dog Age");
            }
        });

        birthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                birthday.setText("");
                birthday.setHint("Dog Birthday");
            }
        });

        addDog_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Owner test = new Owner("test01", "001", "a1a1", 131313);
                dogTest = new Dog(test, dogName.getText().toString(), Breed.valueOf(spinner.getSelectedItem().toString()), birthday.getText().toString(), Integer.parseInt(age.getText().toString()));
                dogDetails.setText(dogTest.toString());
            }
        });
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogtest);
        Init();
    }
}