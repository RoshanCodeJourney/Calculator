package com.example.differentcalculators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class weightmass extends AppCompatActivity {
    EditText value;
    TextView result;
    Button intoMass,intoWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weightmass);
        value=findViewById(R.id.value);
        result=findViewById(R.id.result);
        intoMass=findViewById(R.id.intoMass);
        intoWeight=findViewById(R.id.intoWeight);


        processOfConversion();
    }

    private void processOfConversion() {
        intoMass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=value.getText().toString();
                if(val.isEmpty())
                {
                    Toast.makeText(weightmass.this, "Fill All the Fields.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Double valWeight=Double.parseDouble(val);
                    Double calculationMass=valWeight/9.8;
                    result.setText(calculationMass+"kg");
                    value.setText("");
                }
            }
        });
        intoWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=value.getText().toString();
                if(val.isEmpty())
                {
                    Toast.makeText(weightmass.this, "Fill All the Fields.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Double valMass=Double.parseDouble(val);
                    Double calculationWeight=valMass*9.8;
                    result.setText(calculationWeight+"N");
                    value.setText("");
                }
            }
        });
    }
}