package com.example.adrian.pawsible;

/**
 * Created by Admin on 26/3/2018.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Test extends AppCompatActivity {

    public EditText ownername;
    public EditText contact;
    public EditText address;
    public EditText photo;
    public Button addOwner_btn;
    public Owner testowner;
    public TextView viewOwner;

    public void Init(){
        ownername = (EditText) findViewById(R.id.dogName);
        contact = (EditText) findViewById(R.id.Contact);
        address = (EditText) findViewById(R.id.Address);
        photo = (EditText) findViewById(R.id.photo);
        addOwner_btn = (Button)findViewById(R.id.addOwner_btn);
        viewOwner = (TextView) findViewById(R.id.allDetails) ;

        ownername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ownername.setText(null);
                ownername.setHint("Name");
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contact.setText(null);
                contact.setHint("Contact");
            }
        });

        address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                address.setText(null);
                address.setHint("Address");
            }
        });

        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photo.setText(null);
                photo.setHint("photo");
            }
        });

        addOwner_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testowner = new Owner(ownername.getText().toString(), contact.getText().toString(), address.getText().toString(), Integer.parseInt(photo.getText().toString()));
                viewOwner.setText(testowner.toString());
            }
        });
    }

    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_test);
            Init();
    }
}
