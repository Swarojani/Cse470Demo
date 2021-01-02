package com.example.universityscholarshipmanagementsystem.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.view.View;
import android.widget.Button;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.universityscholarshipmanagementsystem.R;

public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText Name, CGPA, Semester, Credit, Birthdate;
    RadioGroup radioGroup;
    RadioButton radioButton;
    Spinner Department;
    Button Submit, btnapply;
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
        setContentView(R.layout.activity_main2);
        Spinner spinner=findViewById(R.id.departmentSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.department, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        Name=findViewById(R.id.PersonName);
        CGPA= findViewById(R.id.cgpa);
        Semester=findViewById(R.id.semester);
        Credit=findViewById(R.id.credit);
        Birthdate=findViewById(R.id.dob);
        radioGroup=findViewById(R.id.genderRadioGroup);
        Department=findViewById(R.id.departmentSpinner);
        Submit=findViewById(R.id.rgtrbtn);

        sharedPreferences= getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);

        String name= sharedPreferences.getString(Key_NAME,null);
        if(name !=null){
            Intent intent = new Intent(MainActivity2.this, datasave.class);
            startActivity(intent);
        }
        btnapply=findViewById(R.id.gndrbtn);
        btnapply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioID=radioGroup.getCheckedRadioButtonId();

                radioButton=findViewById(radioID);

            }
        });


        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               SharedPreferences.Editor editor=sharedPreferences.edit();
               editor.putString(Key_NAME,Name.getText().toString());
                editor.putString(Key_CGPA,CGPA.getText().toString());
                editor.putString(Key_SEMESTER,Semester.getText().toString());
                editor.putString(Key_CREDIT,Credit.getText().toString());
                editor.putString(Key_BIRTHDATE,Birthdate.getText().toString());
                editor.apply();
                Toast.makeText(MainActivity2.this, "Submit Successfully", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity2.this, datasave.class);
                startActivity(intent);




            }
        });

    }

    public void checkButton(View v){
        int radioID = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioID);
        Toast.makeText(MainActivity2.this, "Selected Button: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

}
