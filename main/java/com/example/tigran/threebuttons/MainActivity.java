package com.example.tigran.threebuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but_1 = (Button) findViewById(R.id.But1);
        but_1.setOnClickListener(new View.OnClickListener(){

            public void onClick (View v){



            }


    }