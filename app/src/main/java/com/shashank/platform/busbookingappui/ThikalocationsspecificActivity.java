package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThikalocationsspecificActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thikalocationsspecific);







    }

    public void gotoHome(View V){


        Intent myIntent = new Intent(ThikalocationsspecificActivity.this,MainActivity.class);
        startActivity(myIntent);

    }

    public void gotothikdirect(View V){


        Intent myIntent = new Intent(ThikalocationsspecificActivity.this, ThikabookingActivity.class);
        startActivity(myIntent);

    }




    }

