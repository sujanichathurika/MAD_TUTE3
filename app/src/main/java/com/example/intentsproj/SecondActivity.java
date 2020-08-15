package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText ipnum1;
    EditText ipnum2;
     //create global values
    String number1;
    String number2;
    int n1,n2;
    TextView lab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
          //this refer text view on the second activity
          //define text views
        ipnum1 = findViewById(R.id.ipnum1);
        ipnum2 = findViewById(R.id.ipnum2);
        lab = findViewById(R.id.lab);
          //get the intent from the first act
        Intent intent = getIntent();
          //retrieve first act intent values
        number1 = intent.getStringExtra("e1");
        number2 = intent.getStringExtra("e2");
          //set those intents to SA views
        ipnum1.setText(number1);
        ipnum2.setText(number2);
            //convert string values to int values
        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);
    }
            //doing simple arithmetic operations using functions
            //you have to pass this view inorder to access the function,can access xml in also
            // number1&2 is the string values
            //n1 & n2 is the integers converted from strings
        public void add(View view){
            lab.setText(number1 +  " + "  + number2 +  " = "  + (n1+n2));
        }

        public void subtract(View view){
             lab.setText(number1 +  " - "  + number2 +  " = "  + (n1-n2));
         }

        public void multiply(View view){
            lab.setText(number1 +  " * "  + number2 +  " = "  + (n1*n2));
        }

        public void divition(View view){
            lab.setText(number1 +  " / "  + number2 +  " = "  + (n1/n2));
        }

}