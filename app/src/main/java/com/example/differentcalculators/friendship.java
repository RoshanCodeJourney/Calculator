package com.example.differentcalculators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class friendship extends AppCompatActivity {
     Button ResultButton;
     TextView  result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendship);
        ResultButton=findViewById(R.id.ResultButton);
        result=findViewById(R.id.result);
        ResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();
                int randomNumber=random.nextInt(101);
                result.setText(randomNumber+"%");
            }
        });
    }
}