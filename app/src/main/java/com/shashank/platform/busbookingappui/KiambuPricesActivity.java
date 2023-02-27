package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KiambuPricesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiambu_prices);
    }


    public void gotokiambubooking(View V){


        Intent myIntent = new Intent(KiambuPricesActivity.this,KiambuBookingActivity.class);
        startActivity(myIntent);

    }
}