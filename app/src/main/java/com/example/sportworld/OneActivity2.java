package com.example.sportworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OneActivity2 extends AppCompatActivity {

    Button button6;
    Button button4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one2);

        button6=findViewById(R.id.button6);
        button4=findViewById(R.id.button4);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OneActivity2.this,SginupActivity2.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OneActivity2.this,HomeActivity2.class);
                startActivity(intent);
            }
        });
    }
}