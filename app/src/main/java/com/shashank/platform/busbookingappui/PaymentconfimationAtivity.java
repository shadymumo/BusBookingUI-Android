package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PaymentconfimationAtivity extends AppCompatActivity {
TextView textView16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentconfimation_ativity);



        textView16 = findViewById(R.id.textView16);
        textView16.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MapsActivitybet.class);
            startActivity(intent);

        }); }





}