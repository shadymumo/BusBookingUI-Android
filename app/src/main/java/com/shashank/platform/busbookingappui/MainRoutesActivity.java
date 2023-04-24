package com.shashank.platform.busbookingappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainRoutesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainroutes);
    }





    public void gotoHomepage(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this,MainActivity.class);
        startActivity(myIntent);

    }
    public void gototHIKROUTE(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this, ThikalocationsspecificActivity.class);
        startActivity(myIntent);

    }

    public void gotoNairobiwestyTown(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this,NairobiWestlandsActivity.class);
        startActivity(myIntent);

    }

    public void gotopage3(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this, ThikabookingActivity.class);
        startActivity(myIntent);

    }


    public void gotoAlsops(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this, AlsopsEmbakasiroutesActivity.class);
        startActivity(myIntent);

    }


    public void gotokikuyu(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this,KikuyuRoutesActivity.class);
        startActivity(myIntent);

    }



    public void gotoNairobi(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this, NairobiTownPricesActivity.class);
        startActivity(myIntent);

    }


    public void gotoDriverLogin(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this,DriverLoginactivity.class);
        startActivity(myIntent);

    }

    public void gotoKiamburuaka(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this,KiambuRuakaRoutesActivity.class);
        startActivity(myIntent);

    }


    public void gotoWestlands(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this,
                WestlandsActivity.class);
        startActivity(myIntent);

    }


    public void gotoKikuyu(View V){


        Intent myIntent = new Intent(MainRoutesActivity.this,KikuyuRoutesActivity.class);
        startActivity(myIntent);

    }
}