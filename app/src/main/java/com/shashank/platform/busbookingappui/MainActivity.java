package com.shashank.platform.busbookingappui;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

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


    public void gototHIKROUTE(View V){


        Intent myIntent = new Intent(MainActivity.this,locationspecactivity.class);
        startActivity(myIntent);

    }


    public void gotopage3(View V){


        Intent myIntent = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(myIntent);

    }

    public void gotoJuja(View V){


        Intent myIntent = new Intent(MainActivity.this,JujaActivity.class);
        startActivity(myIntent);

    }



    public void gotokikuyu(View V){


        Intent myIntent = new Intent(MainActivity.this,KikuyuActvity.class);
        startActivity(myIntent);

    }



    public void gotoNairobi(View V){


        Intent myIntent = new Intent(MainActivity.this,NairobiTownCbdActivity.class);
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







