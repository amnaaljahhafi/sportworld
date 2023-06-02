package com.example.sportworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SginupActivity2 extends AppCompatActivity {




    Button button15;
    Button button16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sginup2);

        button15=findViewById(R.id.button15);
        button16=findViewById(R.id.button16);

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SginupActivity2.this,OneActivity2.class);
                startActivity(intent);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SginupActivity2.this,OneActivity2.class);
                startActivity(intent);
            }
        });
    }
}