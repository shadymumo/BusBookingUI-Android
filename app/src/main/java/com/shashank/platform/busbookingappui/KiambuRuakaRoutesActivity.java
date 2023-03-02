package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KiambuRuakaRoutesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiambu_ruaka_routes);

    }




    public void gotoKiambuPrices(View V){


        Intent myIntent = new Intent(KiambuRuakaRoutesActivity.this,KiambuPricesActivity.class);
        startActivity(myIntent);

    }
    public void gotoRuakaPrices(View V){


        Intent myIntent = new Intent(KiambuRuakaRoutesActivity.this,RuakaPricesActivity.class);
        startActivity(myIntent);

    }

}