package com.example.differentcalculators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class agecalculator extends AppCompatActivity {
    DatePicker birthDatePicker;
    Button ageButton;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agecalculator);
        ageButton=findViewById(R.id.ageButton);
        birthDatePicker=findViewById(R.id.birthdatePicker);
        result=findViewById(R.id.result);


        Calendar calendar=Calendar.getInstance();
        int currentDay=calendar.get(Calendar.DAY_OF_MONTH);
        int currentMonth=calendar.get(Calendar.MONTH)+1;
        int currentYear=calendar.get(Calendar.YEAR);

        Log.d("Date", currentDay+":"+currentMonth+":"+currentYear);
        ageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int birthDay=birthDatePicker.getDayOfMonth();
                int birthMonth=birthDatePicker.getMonth()+1;
                int birthYear=birthDatePicker.getYear();
                Calendar birthdate=Calendar.getInstance();
                birthdate.set(birthYear,birthMonth,birthDay);

                if(calendar.get(Calendar.DAY_OF_YEAR) < birthdate.get(Calendar.DAY_OF_YEAR))
                {
                    int age=currentYear-birthdate.get(Calendar.YEAR);
                    Log.d("cal", currentYear+"-"+birthdate.get(Calendar.YEAR));
                    age--;
                    result.setText("Age:"+age);
                }
                else {
                    int age=currentYear-birthYear;
                    result.setText("Age:"+age);
                }
            }
        });

    }
}