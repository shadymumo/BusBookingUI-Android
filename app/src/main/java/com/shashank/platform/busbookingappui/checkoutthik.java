package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class checkoutthik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkoutthik);
    }
    public void gotoHome(View V){


        Intent myIntent = new Intent(checkoutthik.this,locationspecactivity.class);
        startActivity(myIntent);

    }
}