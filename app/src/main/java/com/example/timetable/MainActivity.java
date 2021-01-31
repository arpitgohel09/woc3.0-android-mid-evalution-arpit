package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Monday(View view){
        Intent intent = new Intent(this, MondayActivity.class);
        startActivity(intent);
    }
    public void Tuesday(View view){
        Intent intent = new Intent(this, TuesdayActivity.class);
        startActivity(intent);
    }
    public void Wednesday(View view){
        Intent intent = new Intent(this, WednesdayActivity.class);
        startActivity(intent);
    }
    public void Thursday(View view){
        Intent intent = new Intent(this, ThursdayActivity.class);
        startActivity(intent);
    }
    public void Friday(View view){
        Intent intent = new Intent(this, FridayActivity.class);
        startActivity(intent);
    }
    public void Saturday(View view) {
        Intent intent = new Intent(this, SaturdayActivity.class);
        startActivity(intent);
    }

}