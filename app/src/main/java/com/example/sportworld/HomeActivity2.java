package com.example.sportworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaCodec;
import android.nfc.cardemulation.CardEmulation;
import android.os.Bundle;
import android.telephony.ClosedSubscriberGroupInfo;
import android.view.View;
import android.widget.Button;

import javax.security.auth.login.LoginException;

public class HomeActivity2 extends AppCompatActivity {

    Button buttonlo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        buttonlo = findViewById(R.id.buttonlo);

        buttonlo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity2.this, MainActivity.class);
                startActivity(intent);

            }
        });

        CardView card1=findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity2.this,benfetofsportActivity2.class));
            }
        });

        CardView card2=findViewById(R.id.card2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity2.this,healthyfoodActivity2.class));
            }
        });

        CardView card4=findViewById(R.id.card4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity2.this,waterActivity2.class));

            }
        });

        CardView card3=findViewById(R.id.card3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity2.this,exercisesActivity2.class));


            }
        });

        CardView card5=findViewById(R.id.card5);
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity2.this,caloriesActivity2.class));


            }
        });


    }
}

