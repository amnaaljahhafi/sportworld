package com.example.sportworld;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class exercisesActivity2 extends AppCompatActivity {
    Button button40150;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises2);

        button40150=findViewById(R.id.button40150);
        button40150.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(exercisesActivity2.this,HomeActivity2.class);
                startActivity(intent);
            }
        });
    }
}