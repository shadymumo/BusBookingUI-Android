package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RuakaPricesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruaka_prices);
    }


    public void gotoruakabooking(View V){


        Intent myIntent = new Intent(RuakaPricesActivity.this,RuakaBookingActivity.class);
        startActivity(myIntent);

    }
}