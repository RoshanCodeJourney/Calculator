package com.example.differentcalculators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class length extends AppCompatActivity {

    EditText value;
    TextView result;
    Button intoKilometers,intoMeters,intoMiles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        value=findViewById(R.id.value);
        result=findViewById(R.id.result);
        intoKilometers=findViewById(R.id.intoKilometers);
        intoMeters=findViewById(R.id.intoMeters);
        intoMiles=findViewById(R.id.intoMiles);


        processOfConversion();
    }

    private void processOfConversion() {
        intoKilometers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=value.getText().toString();
                if(val.isEmpty())
                {
                    Toast.makeText(length.this, "Fill All the Fields.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Float valMeter=Float.parseFloat(val);
                    Float calculationKiloMeters=Float.valueOf(valMeter/1000);
                    result.setText(calculationKiloMeters+" Km");

                }
            }
        });
        intoMeters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=value.getText().toString();
                if(val.isEmpty())
                {
                    Toast.makeText(length.this, "Fill All the Fields.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Float valKiloMetres=Float.parseFloat(val);
                    Float calculationMeter=Float.valueOf(valKiloMetres*1000);
                    result.setText(calculationMeter+" m");
                }
            }
        });
        intoMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=value.getText().toString();
                if(val.isEmpty())
                {
                    Toast.makeText(length.this, "Fill All the Fields.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Double valKiloMetres=Double.parseDouble(val);
                    Double calculationMiles=valKiloMetres/1.5;
                    result.setText(calculationMiles+" miles");
                }
            }
        });
    }
}