package com.example.gyakorlas0322;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nev;
    private EditText telefonszam;
    private EditText magassag;
    private EditText suly;
    private RadioButton ferfi;
    private RadioButton no;
    private RadioButton egyeb;
    private RadioGroup radio;
    private Button gomb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        gomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, adatok.class);

                i.putExtra("név", nev.getText().toString());
                i.putExtra("telefonszám",telefonszam.getText().toString());
                i.putExtra("magasság", magassag.getText().toString());
                i.putExtra("súly", suly.getText().toString());


                if(ferfi.isChecked()){
                    i.putExtra("nem",ferfi.getText().toString());
                }
                else if(no.isChecked()){
                    i.putExtra("nem", no.getText().toString());
                }
                else {
                    i.putExtra("nem",egyeb.getText().toString());
                }

                startActivity(i);

            }
        });




    }

    private void findViews() {

        nev = findViewById(R.id. nev);
        telefonszam = findViewById(R.id.telefonszam);
        magassag = findViewById(R.id.testmagassag);
        suly = findViewById(R.id. suly);
        ferfi = findViewById(R.id. ferfi);
        no = findViewById(R.id.no);
        egyeb = findViewById(R.id.egyeb);
        radio = findViewById(R.id.radio);
        gomb = findViewById(R.id.gomb);
    }
}