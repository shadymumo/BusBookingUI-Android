package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LimuruRDBookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limuru_rdbooking);
    }



    public void gotocheckout(View V){


        Intent myIntent = new Intent(LimuruRDBookingActivity.this,CheckoutActivity.class);
        startActivity(myIntent);

    }
}