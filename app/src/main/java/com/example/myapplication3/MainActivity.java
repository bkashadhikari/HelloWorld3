package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG,"Button Clicked!");
        Intent intent = new Intent(this, com.example.myapplication3.SecondActivity.class);
        startActivity(intent);
    }
}
