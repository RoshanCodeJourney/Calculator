package com.example.differentcalculators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class temperature extends AppCompatActivity {

    EditText value;
    TextView result;
    Button intoCelcius,intoFarhenhiet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        value=findViewById(R.id.value);
        result=findViewById(R.id.result);
        intoCelcius=findViewById(R.id.intoCelcius);
        intoFarhenhiet=findViewById(R.id.intoFarhenHeit);


        processOfConversion();
    }
    private void processOfConversion() {
        intoFarhenhiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=value.getText().toString();
                if(val.isEmpty())
                {
                    Toast.makeText(temperature.this, "Fill All the Fields.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Float valCelcius=Float.parseFloat(val);
                    Float calculationFarhenheit=Float.valueOf((valCelcius * 9/5) + 32);
                    result.setText(calculationFarhenheit+"F");

                }
            }
        });
        intoCelcius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=value.getText().toString();
                if(val.isEmpty())
                {
                    Toast.makeText(temperature.this, "Fill All the Fields.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Float valFarhenheit=Float.parseFloat(val);
                    Float calculationCelcius=Float.valueOf((valFarhenheit-32)*5/9);
                    result.setText(calculationCelcius+"C");;

                }
            }
        });
    }
}