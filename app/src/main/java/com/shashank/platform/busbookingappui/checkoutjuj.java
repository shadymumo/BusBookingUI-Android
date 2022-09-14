package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class checkoutjuj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkoutjuj);
    }

    public void gotoconfirmedpay(View V){


        Intent myIntent = new Intent(checkoutjuj.this,PymentconfirmedJuja.class);
        startActivity(myIntent);

    }
}