package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class locationspecactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locationspecactivity);







    }
    public void gotothikdirect(View V){


        Intent myIntent = new Intent(locationspecactivity.this,Main2Activity.class);
        startActivity(myIntent);

    }

    public void gotojujbooking(View V){


        Intent myIntent = new Intent(locationspecactivity.this,JujaBookingActivity.class);
        startActivity(myIntent);

    }


    }
