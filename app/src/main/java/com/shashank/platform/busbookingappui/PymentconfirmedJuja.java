package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PymentconfirmedJuja extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pymentconfirmed_juja);
    }

    public void gotoJujaMap(View V){


        Intent myIntent = new Intent(PymentconfirmedJuja.this,MapsActivityUtawala.class);
        startActivity(myIntent);

    }
}