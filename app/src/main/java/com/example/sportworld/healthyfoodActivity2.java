package com.example.sportworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class healthyfoodActivity2 extends AppCompatActivity {
    Button button111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthyfood2);

        button111=findViewById(R.id.button111);
        button111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(healthyfoodActivity2.this,HomeActivity2.class);
                startActivity(intent);

            }
        });
    }
}