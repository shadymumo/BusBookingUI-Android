package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainRoutesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_routes);
    }




    public void gotoDatepicker2(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this,DatePicker2Activity.class);
        startActivity(myIntent);

    }
    public void gotoHomepage(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this,MainActivity.class);
        startActivity(myIntent);

    }
    public void gototHIKROUTE(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this,locationspecactivity.class);
        startActivity(myIntent);

    }


    public void gotopage3(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this, ThikabookingActivity.class);
        startActivity(myIntent);

    }

    public void gotoJuja(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this,JujaActivity.class);
        startActivity(myIntent);

    }



    public void gotokikuyu(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this,KikuyuActvity.class);
        startActivity(myIntent);

    }



    public void gotoNairobi(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this,NairobiTownCbdActivity.class);
        startActivity(myIntent);

    }


    public void gotoDriverLogin(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this,DriverLoginactivity.class);
        startActivity(myIntent);

    }

    public void gotoRuai(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this,RuiaActivity.class);
        startActivity(myIntent);

    }


    public void gotoWestlands(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this,
                WestlandsActivity.class);
        startActivity(myIntent);

    }


    public void gotoLimuru(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this,LimururdActivity.class);
        startActivity(myIntent);

    }
}