package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NairobiWestlandsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nairobi_westlandsroutes);
    }




    public void gotoNairobiPrices(View V){


        Intent myIntent = new Intent(NairobiWestlandsActivity.this,NairobiTownPricesActivity.class);
        startActivity(myIntent);

    }
    public void gotowestyPrices(View V){


        Intent myIntent = new Intent(NairobiWestlandsActivity.this,WestlandsPricesActivity.class);
        startActivity(myIntent);

    }

}