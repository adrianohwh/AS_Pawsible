package com.example.adrian.pawsible;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button dogs_Btn;
    public Button schedule_Btn;
    public Button test_Btn;
    public Button dogtest_Btn;

    public void Init(){
        dogs_Btn = (Button)findViewById(R.id.dogs_Btn);
        dogs_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, dogs.class));
            }
        });

        schedule_Btn = (Button)findViewById(R.id.schedule_Btn);
        schedule_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Schedules.class));
            }
        });

        test_Btn = (Button)findViewById(R.id.test_Btn);
        test_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Test.class));
            }
        });

        dogtest_Btn = (Button)findViewById(R.id.dogtest_btn);
        dogtest_Btn.setOnClickListener(new View.OnClickListener() {
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
