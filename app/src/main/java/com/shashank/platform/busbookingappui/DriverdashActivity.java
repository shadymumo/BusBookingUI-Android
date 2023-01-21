package com.shashank.platform.busbookingappui;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class DriverdashActivity extends AppCompatActivity {


    public View logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driverdash);

        logout= findViewById(R.id.logout);







}public void gotoOfficeLocation(View V){


        Intent myIntent = new Intent(DriverdashActivity.this,MapsActivity.class);
        startActivity(myIntent);

    }}