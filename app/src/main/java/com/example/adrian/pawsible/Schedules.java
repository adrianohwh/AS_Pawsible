package com.example.adrian.pawsible;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

import org.w3c.dom.Text;

import java.util.Calendar;

public class Schedules extends AppCompatActivity {

    public Button schedule_Back;
    public Button test_Btn;
    public MaterialCalendarView mcv;

    public void Init(){
        schedule_Back = (Button)findViewById(R.id.schedule_Back);
        mcv = (MaterialCalendarView)findViewById(R.id.calendarView);
        mcv.setCurrentDate(CalendarDay.from(2018, 0, 21));
        mcv.setSelectedDate(CalendarDay.today());
        test_Btn = (Button)findViewById(R.id.button);
        schedule_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Schedules.this, MainActivity.class));
            }
        });

        test_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean sameDay =  mcv.getSelectedDate().getYear() == CalendarDay.today().getYear() &&
                                    mcv.getSelectedDate().getMonth() == CalendarDay.today().getMonth() &&
                                    mcv.getSelectedDate().getDay() == CalendarDay.today().getDay();

                if (sameDay)
                    test_Btn.setText("Same day");

                else
                    test_Btn.setText("Diff day");
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedules);
        Init();
    }
}