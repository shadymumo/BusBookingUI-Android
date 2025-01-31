package com.shashank.platform.busbookingappui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button search_buses;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);





    }

    public void gotomainroutes(View V){


        Intent myIntent = new Intent(MainActivity.this,MainRoutesActivity.class);
        startActivity(myIntent);

    }


    public void gototHIKROUTE(View V){


        Intent myIntent = new Intent(MainActivity.this, ThikalocationsspecificActivity.class);
        startActivity(myIntent);

    }


    public void gotopage3(View V){


        Intent myIntent = new Intent(MainActivity.this, ThikabookingActivity.class);
        startActivity(myIntent);

    }





    public void gotokikuyu(View V){


        Intent myIntent = new Intent(MainActivity.this, KikuyupricingActvity.class);
        startActivity(myIntent);

    }





    public void gotoDriverLogin(View V){


        Intent myIntent = new Intent(MainActivity.this,DriverLoginactivity.class);
        startActivity(myIntent);

    }

    public void gotoRuai(View V){


        Intent myIntent = new Intent(MainActivity.this,RuiaActivity.class);
        startActivity(myIntent);

    }


    public void gotoWestlands(View V){


        Intent myIntent = new Intent(MainActivity.this,
                WestlandsActivity.class);
        startActivity(myIntent);

    }


    public void gotoLimuru(View V){


        Intent myIntent = new Intent(MainActivity.this,LimururdActivity.class);
        startActivity(myIntent);

    }
}







