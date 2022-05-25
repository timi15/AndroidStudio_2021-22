package com.example.dolgozat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class masodik extends AppCompatActivity {

    private EditText nev;
    private EditText varos;
    private EditText cim;
    private EditText telefon;
    private EditText email;
    private Button gomb;
    private TextView adatok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masodik);

        findViews();

        gomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                adatok.setText("Szin: "+getIntent().getStringExtra("szin")+" "+"Méret: "+getIntent().getStringExtra("meret"));

                Intent m = new Intent(masodik.this,harmadik.class);

                m.putExtra("név",nev.getText().toString());
                m.putExtra("város",varos.getText().toString());
                m.putExtra("cim",cim.getText().toString());
                m.putExtra("telefon",telefon.getText().toString());
                m.putExtra("email",email.getText().toString());
                m.putExtra("cipoadat",adatok.getText().toString());

                startActivity(m);





            }
        });





    }

    private void findViews() {
        nev = findViewById(R.id.nev);
        varos = findViewById(R.id.varos);
        cim = findViewById(R.id.cim);
        telefon = findViewById(R.id.telefonszam);
        email = findViewById(R.id.email);
        gomb = findViewById(R.id.button);
        adatok = findViewById(R.id.adatok);




    }
}