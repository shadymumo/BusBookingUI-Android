package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JujaBookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juja_booking);



    }


    public void gotocheckout(View V){


        Intent myIntent = new Intent(JujaBookingActivity.this,CheckoutActivity.class);
        startActivity(myIntent);

    }
}