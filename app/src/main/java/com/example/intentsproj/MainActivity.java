package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ipnum1;
    EditText ipnum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize the text objects
        ipnum1 = findViewById(R.id.ipnum1);
        ipnum2 = findViewById(R.id.ipnum2);

    }

    public void openSecond(View view){
        //pass the values
        //open the activity using Intents

        //create the object from the Intent
        Intent intent = new Intent(this,SecondActivity.class);

        //put the values that we are going to sent the next activity
        intent.putExtra("e1",ipnum1.getText().toString());
        intent.putExtra("e2",ipnum2.getText().toString());

        //toast msg
        //Toast.makeText(this, "opening calculator.....", Toast.LENGTH_SHORT).show();

        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
        //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));
        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();


        //open the activity
        startActivity(intent);


    }
}