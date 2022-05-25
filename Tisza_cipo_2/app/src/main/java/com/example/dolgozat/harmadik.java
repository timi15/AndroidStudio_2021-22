package com.example.dolgozat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class harmadik extends AppCompatActivity {

    private TextView megrendelo;
    private TextView cipoadat;
    private TextView textViewnev;
    private TextView textViewvaros;
    private TextView textViewcim;
    private TextView textViewtelefon;
    private TextView textViewemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harmadik);

        findViews();

        textViewnev.setText(getIntent().getStringExtra("név"));
        textViewvaros.setText(getIntent().getStringExtra("város"));
        textViewcim.setText(getIntent().getStringExtra("cim"));
        textViewtelefon.setText(getIntent().getStringExtra("telefon"));
        textViewemail.setText(getIntent().getStringExtra("email"));


        cipoadat.setText(getIntent().getStringExtra("cipoadat"));






    }

    private void findViews() {

        megrendelo = findViewById(R.id. megrendelo);
        cipoadat = findViewById(R.id.cipoadat);

        textViewnev = findViewById(R.id.textviewnev);
        textViewvaros = findViewById(R.id.textviewvaros);
        textViewcim = findViewById(R.id.textviewcim);
        textViewtelefon = findViewById(R.id.textviewtelefon);
        textViewemail = findViewById(R.id.textviewemail);

    }
}