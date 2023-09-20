package com.example.differentcalculators;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button weightButton,tempButton,friendButton,currencyButton,lengthButton,ageCalculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weightButton=findViewById(R.id.weightButton);
        tempButton=findViewById(R.id.tempButton);
        friendButton=findViewById(R.id.friendButton);
        ageCalculator=findViewById(R.id.ageCalculator);
        currencyButton=findViewById(R.id.currencyButton);
        lengthButton=findViewById(R.id.lengthButton);



        allClickListeners();
    }

    private void allClickListeners() {
        weightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, weightmass.class);
                startActivity(intent);
            }
        });
        ageCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, agecalculator.class);
                startActivity(intent);
            }
        });
        tempButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, temperature.class);
                startActivity(intent);
            }
        });

        friendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, friendship.class);
                startActivity(intent);
            }
        });
        currencyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, currency.class);
                startActivity(intent);
            }
        });
        lengthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, length.class);
                startActivity(intent);
            }
        });

    }
}