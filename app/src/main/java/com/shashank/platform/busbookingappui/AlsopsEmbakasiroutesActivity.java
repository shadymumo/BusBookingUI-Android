package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlsopsEmbakasiroutesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alsops_embakasiroutes);
    }


    public void gotoAlsopsPrices(View V){


        Intent myIntent = new Intent(AlsopsEmbakasiroutesActivity.this,AlsopspricesActivity.class);
        startActivity(myIntent);

    }


}