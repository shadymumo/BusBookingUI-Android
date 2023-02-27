package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlsopspricesActivity extends AppCompatActivity {


    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alsopsprices);




    }

    public void gotoalsopsbooking(View V){


        Intent myIntent = new Intent(AlsopspricesActivity.this,AlsopsbookingActivity.class);
        startActivity(myIntent);

    }
}