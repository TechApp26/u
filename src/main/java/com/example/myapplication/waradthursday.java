package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class waradthursday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waradthursday);

    }
    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed(){
        Intent back=new Intent(getApplicationContext(),Warad .class);
        startActivity(back);
        finish();


    }
}