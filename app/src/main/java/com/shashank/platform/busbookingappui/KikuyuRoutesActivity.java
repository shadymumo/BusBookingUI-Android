package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KikuyuRoutesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kikuyu_routes);
    }


    public void gotoKikuyuPrices(View V){


        Intent myIntent = new Intent(KikuyuRoutesActivity.this,KikuyupricingActvity.class);
        startActivity(myIntent);

    }

}