package com.example.dolgozat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioButton szam41;
    private RadioButton szam42;
    private RadioButton szam43;
    private RadioButton szam44;
    private RadioButton szam45;
    private Button gomb;
    private RadioButton feher;
    private RadioButton fekete;
    private RadioButton piros;
    private TextView meret;
    private TextView szin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        gomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, masodik.class);

                if(szam41.isChecked()){
                    i.putExtra("meret",szam41.getText().toString());
                }

                else if(szam42.isChecked()){
                    i.putExtra("meret",szam42.getText().toString());
                }

                else if(szam43.isChecked()){
                    i.putExtra("meret",szam43.getText().toString());
                }

                else if(szam44.isChecked()){
                    i.putExtra("meret",szam44.getText().toString());
                }

                else {
                    i.putExtra("meret",szam45.getText().toString());
                }

                if (feher.isChecked()){
                    i.putExtra("szin",feher.getText().toString());


                }

                else if (fekete.isChecked()){
                    i.putExtra("szin", fekete.getText().toString());


                }
                else {
                    i.putExtra("szin", piros.getText().toString());

                }

                startActivity(i);




            }
        });



    }

    private void findViews() {

        szam41 = findViewById(R.id.szam41);
        szam42 = findViewById(R.id.szam42);
        szam43 = findViewById(R.id.szam43);
        szam44 = findViewById(R.id.szam44);
        szam45 = findViewById(R.id.szam45);

        gomb = findViewById(R.id.gomb);


        feher = findViewById(R.id.feher);
        fekete = findViewById(R.id.fekete);
        piros = findViewById(R.id.piros);

        meret = findViewById(R.id.meret);
        szin = findViewById(R.id. szin);

    }
}