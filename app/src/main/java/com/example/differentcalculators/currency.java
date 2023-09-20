package com.example.differentcalculators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class currency extends AppCompatActivity {

    EditText value;
    TextView result;
    Button intoRupee,intoDollar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        value=findViewById(R.id.value);
        result=findViewById(R.id.result);
        intoRupee=findViewById(R.id.intoRupee);
        intoDollar=findViewById(R.id.intoDollar);


        processOfConversion();
    }
    private void processOfConversion() {
        intoRupee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=value.getText().toString();
                if(val.isEmpty())
                {
                    Toast.makeText(currency.this, "Fill All the Fields.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Double valDollar=Double.parseDouble(val);
                    Double calculationRupee=valDollar*306;
                    result.setText(calculationRupee+"Rs");

                }
            }
        });
        intoDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=value.getText().toString();
                if(val.isEmpty())
                {
                    Toast.makeText(currency.this, "Fill All the Fields.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Double valRupee=Double.parseDouble(val);
                    Double calculationDollar=valRupee/308;
                    result.setText(calculationDollar+"$");

                }
            }
        });
    }
}