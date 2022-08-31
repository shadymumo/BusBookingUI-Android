package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RuiaiBooking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruiai_booking);
    }



    public void gotocheckout(View V){


        Intent myIntent = new Intent(RuiaiBooking.this,CheckoutActivity.class);
        startActivity(myIntent);

    }
}