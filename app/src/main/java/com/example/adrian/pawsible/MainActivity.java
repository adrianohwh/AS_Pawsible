package com.example.adrian.pawsible;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public CardView ownerList;
    public CardView dogList;
    public CardView calendView;
    public CardView invoiceView;

    public void Init(){
        ownerList = (CardView) findViewById(R.id.ownerList);
        ownerList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Test.class));
            }
        });

        dogList = (CardView) findViewById(R.id.dogList);
        dogList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, dogtest.class));
            }
        });

        calendView = (CardView)findViewById(R.id.calendView);
        calendView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Schedules.class));
            }
        });

        invoiceView = (CardView)findViewById(R.id.invoiceView);
        invoiceView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, dogtest.class));
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
    }
}
