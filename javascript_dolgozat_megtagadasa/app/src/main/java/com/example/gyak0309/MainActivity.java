package com.example.gyak0309;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText vn;
    private EditText kn;
    private Button button;
    private RadioButton igen;
    private RadioButton nem;
    private TextView valasz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, szavazas.class);

                i.putExtra("Vezetéknév", vn.getText().toString());
                i.putExtra("Keresztnév", kn.getText().toString());


                if (igen.isChecked()){
                    valasz.setText("igen");
                    i.putExtra("valasz", valasz.getText().toString());

                }
                else {
                    valasz.setText("nem");
                    i.putExtra("valasz", valasz.getText().toString());
                }

                startActivity(i);





            }
        });

    }

    private void findViews() {

        vn = findViewById(R.id.edittext_vnev);
        kn = findViewById(R.id. edittext_knev);
        button = findViewById(R.id. button);

        igen = findViewById(R.id.radiobutton_igen);
        nem = findViewById(R.id. radiobutton_nem);

        valasz = findViewById(R.id.textview_valasz);
    }
}