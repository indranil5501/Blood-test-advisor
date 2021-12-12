package com.example.bloodtestadvisor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class tNc extends AppCompatActivity {

    Button bot,noo;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tnc);
        noo = findViewById(R.id.no);
        bot = findViewById(R.id.subtnc);
        
        bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent;
                    intent = new Intent(tNc.this,listoftest.class);
                    startActivity(intent);
            }
        });

        noo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(tNc.this, "To use the app you have to accept all the terms and condition", Toast.LENGTH_SHORT).show();

            }
        });

    }
}