package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NairobiwestyrouteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nairobiwestyroute);
    }


    public void gotoNRBBOOKING(View V){


        Intent myIntent = new Intent(NairobiwestyrouteActivity.this,NairobiTownActivity.class);
        startActivity(myIntent);

    }

    public void gotowestyBOOKING(View V){


        Intent myIntent = new Intent(NairobiwestyrouteActivity.this,WestlandsBookingActivity.class);
        startActivity(myIntent);

    }
}