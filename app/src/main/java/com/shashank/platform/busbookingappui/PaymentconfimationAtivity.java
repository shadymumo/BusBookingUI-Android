package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PaymentconfimationAtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentconfimation_ativity);





        }




    public void gototHIKaMap(View V){


        Intent myIntent = new Intent(PaymentconfimationAtivity.this,MapsActivitybet.class);
        startActivity(myIntent);

    }

}