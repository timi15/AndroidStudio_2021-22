package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText tomeg;
    private EditText magassag;
    private Button gomb;
    private TextView uzenet;
    private TextView eredmeny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        gomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                double suly= Double.parseDouble(tomeg.getText().toString());

                double meter= Double.parseDouble(magassag.getText().toString());

                double bmi= suly/(meter*meter);

                uzenet.setText(String.valueOf(bmi));

                if(bmi<20){
                    eredmeny.setText("Sovány vagy");

                }
                else if(bmi<25){
                    eredmeny.setText("Normál");

                }
                else {
                    eredmeny.setText("Elhízott");
                }



            }
        });


    }

    private void findViews() {

        tomeg = findViewById(R.id.edittext_tomeg);
        magassag = findViewById(R.id. edittext_magassag);
        gomb = findViewById(R.id.button_szamolj);
        uzenet = findViewById(R.id. textview_uzenet);
        eredmeny = findViewById(R.id. textview_eredmeny);

    }
}