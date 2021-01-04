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

public class datasave extends AppCompatActivity {
    TextView nameet,cgpaet,semeset,creditet,dobet;
    Button backbtn,logout;
    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME="mypref";
    private static final String Key_NAME="Name";
    private static final String Key_CGPA="CGPA";
    private static final String Key_SEMESTER="Semester";
    private static final String Key_CREDIT="Credit";
    private static final String Key_BIRTHDATE="Birthdate";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datasave);

        nameet=findViewById(R.id.textView3);
        cgpaet=findViewById(R.id.textView4);
        semeset=findViewById(R.id.textView5);
        creditet=findViewById(R.id.textView8);
        dobet=findViewById(R.id.textView9);
        backbtn=findViewById(R.id.btn1);
        logout=findViewById(R.id.btn2);


        sharedPreferences= getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);

        String name= sharedPreferences.getString(Key_NAME,null);
        String cgpa= sharedPreferences.getString(Key_CGPA,null);
        String semester= sharedPreferences.getString(Key_SEMESTER,null);
        String credit= sharedPreferences.getString(Key_CREDIT,null);
        String birthdate= sharedPreferences.getString(Key_BIRTHDATE,null);


        if(name !=null || cgpa !=null || semester !=null || credit !=null || birthdate !=null){
           nameet.setText("Full Name- "+name);
           cgpaet.setText("CGPA- "+cgpa);
           semeset.setText("Semester- "+semester);
           creditet.setText("Credit- "+credit);
           dobet.setText("Birthdate- "+birthdate);


        }
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.clear();
                editor.commit();
                finish();
                Toast.makeText(datasave.this, "Back to the form Successfully", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(datasave.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(datasave.this, "Logout Successfully", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(datasave.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}