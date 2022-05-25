package com.example.gyakorlas0322;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;


public class adatok extends AppCompatActivity {

    private TextView nev;
    private TextView telefonszam;
    private TextView magassag;
    private TextView suly;
    private TextView nem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adatok);

        findViews();

        nev.setText(getIntent().getStringExtra("név"));
        telefonszam.setText(getIntent().getStringExtra("telefonszám"));
        magassag.setText(getIntent().getStringExtra("magasság"));
        suly.setText(getIntent().getStringExtra("súly"));
        nem.setText(getIntent().getStringExtra("nem"));


    }

    private void findViews() {

        nev = findViewById(R.id. textviewnev);
        telefonszam = findViewById(R.id.textviewtel);
        magassag = findViewById(R.id.textviewmagassag);
        suly = findViewById(R.id.textviewsuly);
        nem = findViewById(R.id.nem);

    }
}