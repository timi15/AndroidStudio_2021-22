package com.example.funkcioadas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewHello;
    private Button buttonudvozol;
    private EditText editirj;
    private  TextView textViewHello2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1.feladta: textviewhello példányt csinálunk,átir  a text tulajdonságot
        // textViewHello.setText("szia Dani!");

        findViews();
        textViewHello.setText("Akármi");
        textViewHello2.setText("Béla");

    }
    //új metódus kezdete:
    // privát-->más osztályból nem lehet meghivni csak ebből
    //public-->más osztályból is meglehet hívni
    private void findViews() {
        TextView textViewHello =findViewById(R.id.textview_hello);
        //találd meg id alapján a textviewt,Ezt el kell tárolni egy változóban. (cammelcase)
        // beimportál --> alt enter
        Button buttonudvozol = findViewById(R.id.udvozol_button);
        EditText editirj =findViewById(R.id.edittext);
        TextView textViewHello2 =findViewById(R.id.textview_hello2);


    }

}