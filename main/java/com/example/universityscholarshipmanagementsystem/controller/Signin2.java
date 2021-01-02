package com.example.universityscholarshipmanagementsystem.controller;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.universityscholarshipmanagementsystem.R;

public class Signin2 extends AppCompatActivity {
    Button Login;
    EditText Email;
    EditText Password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin2);
        Login=findViewById(R.id.login);
        Email = findViewById(R.id.mail);
        Password = findViewById(R.id.pass);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = Email.getText().toString();
                String password = Password.getText().toString();
                if(email.equals("swarojani@gmail.com") && password.equals("12345")) {

                Toast.makeText(Signin2.this, "Login has been clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Signin2.this, Connected.class);
                startActivity(intent);
            }

                else{

                    Toast.makeText(Signin2.this, "Wrong information", Toast.LENGTH_SHORT).show();
                }
            }
            });

    }
}