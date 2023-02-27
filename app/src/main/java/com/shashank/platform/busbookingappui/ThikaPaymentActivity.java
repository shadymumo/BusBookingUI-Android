package com.shashank.platform.busbookingappui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class ThikaPaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_thikapayment);
    }
    public void gotoHome(View V){


        Intent myIntent = new Intent(ThikaPaymentActivity.this, ThikalocationsspecificActivity.class);
        startActivity(myIntent);

    }

    public void gotocheckout(View V){


        Intent myIntent = new Intent(ThikaPaymentActivity.this,CheckoutActivity.class);
        startActivity(myIntent);

    }
}
