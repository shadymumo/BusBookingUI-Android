package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlsopsbookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alsopsbooking);



    }



    public void gotocheckout(View V){


        Intent myIntent = new Intent(AlsopsbookingActivity.this,CheckoutActivity.class);
        startActivity(myIntent);

    }
}