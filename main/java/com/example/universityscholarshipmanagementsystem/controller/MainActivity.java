package com.example.universityscholarshipmanagementsystem.controller;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.universityscholarshipmanagementsystem.R;


public class MainActivity extends AppCompatActivity {
    Button login;
    Button Register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=findViewById(R.id.button5);
        Register=findViewById(R.id.button6);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Login has been clicked", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(MainActivity.this , Signin2.class);
                startActivity(intent);

            }
        });
        Register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "Register has been clicked", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, SignIn.class);
                    startActivity(intent);
                }

                });



    }
}