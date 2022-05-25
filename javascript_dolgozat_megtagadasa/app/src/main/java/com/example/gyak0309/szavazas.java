package com.example.gyak0309;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class szavazas extends AppCompatActivity {

    private TextView nev;
    private TextView valasz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_szavazas);

        nev = findViewById(R.id.nev);
        valasz = findViewById(R.id. valasz);

        nev.setText(getIntent().getStringExtra("Vezetéknév")+" "+ getIntent().getStringExtra("Keresztnév"));
        valasz.setText(getIntent().getStringExtra("valasz"));

    }
}