package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CheckoutActivity extends AppCompatActivity {
Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);





    }

    public void gotopage3(View V){


        Intent myIntent = new Intent(CheckoutActivity.this,MapsActivity.class);
        startActivity(myIntent);

    }
    public void payment (View V){


        Intent myIntent = new Intent(CheckoutActivity.this,PaymentconfimationAtivity.class);
        startActivity(myIntent);

    }
}