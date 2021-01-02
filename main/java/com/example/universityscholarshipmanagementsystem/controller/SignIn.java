package com.example.universityscholarshipmanagementsystem.controller;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.universityscholarshipmanagementsystem.R;

public class SignIn extends AppCompatActivity {
    EditText rname,rnumber,remail,rpass;
    Button signin, register2;
    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME="mypref";
    private static final String Key_NAME="Name";
    private static final String Key_number="Number";
    private static final String Key_mail="Email";
    private static final String Key_pass="Password";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        rname=findViewById(R.id.editTextTextPersonName);
        rnumber=findViewById(R.id.num1);
        remail=findViewById(R.id.mail);
        rpass=findViewById(R.id.pass);
        signin=findViewById(R.id.homepage);
        register2=findViewById(R.id.rgtrbtn);


        sharedPreferences= getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);

        String name= sharedPreferences.getString(Key_NAME,null);
        if(name !=null) {
            Intent intent = new Intent(SignIn.this, SaveRegister.class);
            startActivity(intent);
        }


        register2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString(Key_NAME,rname.getText().toString());
                editor.putString(Key_number,rnumber.getText().toString());
                editor.putString(Key_mail,remail.getText().toString());
                editor.putString(Key_pass,rpass.getText().toString());
                editor.apply();
                Toast.makeText(SignIn.this, "Successfully registered", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SignIn.this, SaveRegister.class);
                startActivity(intent);

            }

        });



    }
}