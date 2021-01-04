package com.example.universityscholarshipmanagementsystem.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.universityscholarshipmanagementsystem.R;

public class SaveRegister extends AppCompatActivity {
    TextView Name,number,mail,passet;
    Button btn;
    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME="mypref";
    private static final String Key_NAME="Name";
    private static final String Key_number="Number";
    private static final String Key_mail="Email";
    private static final String Key_pass="Password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_register);

        Name = findViewById(R.id.text1);
        number = findViewById(R.id.text2);
        mail = findViewById(R.id.text3);
        passet = findViewById(R.id.text4);
        btn=findViewById(R.id.homepage);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);

        String name = sharedPreferences.getString(Key_NAME, null);
        String num = sharedPreferences.getString(Key_number, null);
        String email = sharedPreferences.getString(Key_mail, null);
        String pass = sharedPreferences.getString(Key_pass, null);

        if (name != null || num != null || email != null || pass != null) {
            Name.setText("Full Name- " + name);
            number.setText("CGPA- " + num);
            mail.setText("Semester- " + email);
            passet.setText("Credit- " + pass);
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.clear();
                editor.commit();
                finish();
                Toast.makeText(SaveRegister.this, "Login has been clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SaveRegister.this, Signin2.class);
                startActivity(intent);
            }

        });
    }
}