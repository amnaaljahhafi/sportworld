package com.example.sportworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class caloriesActivity2 extends AppCompatActivity {

    Button button1114;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories2);
        button1114=findViewById(R.id.button1114);
        button1114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(caloriesActivity2.this,HomeActivity2.class);
                startActivity(intent);
            }
        });

    }
}