package com.example.universityscholarshipmanagementsystem.controller;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.universityscholarshipmanagementsystem.R;

public class Connected extends AppCompatActivity {
    Button connect,connect2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connected);
        connect=findViewById(R.id.click);
        connect2=findViewById(R.id.click2);

        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Connected.this, "Login has been clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Connected.this, MainActivity2.class);
                startActivity(intent);
            }

        });
        connect2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Connected.this, "successfully clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Connected.this, datasave.class);
                startActivity(intent);
            }

        });

    }
}