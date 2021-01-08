package com.example.temperaturecricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.getInteger;
import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    EditText etId;
    Button btnSubmit;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etId = findViewById(R.id.etId);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResult = findViewById(R.id.tvResult);

        tvResult.setVisibility(View.GONE);




        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String inputValue = etId.getText().toString();
                double celsius, fahrenheit;


                //Toast.makeText(MainActivity.this, fahrenheit, Toast.LENGTH_SHORT).show();
//                float finalValue;
//                float empty ;
//
                if(inputValue.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter in Fahrenheit", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    fahrenheit = Float.valueOf(inputValue);
                    celsius = (fahrenheit - 32) * (0.5556);
                    String finalVal = String.format("%.2f", celsius);
                    tvResult.setText("The approximate temperature outside is "+finalVal+"°C");
                    tvResult.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}