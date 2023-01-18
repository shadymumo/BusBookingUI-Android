package com.shashank.platform.busbookingappui;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class DatePicker2Activity extends AppCompatActivity {
        EditText edt;
        DatePickerDialog datePickerDialog;




    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker2);
        edt = findViewById(R.id.edt);
        Calendar calendar = Calendar.getInstance();
        final int day = calendar.get(Calendar.DAY_OF_MONTH);
       final int year = calendar.get(Calendar.YEAR);
       final int month = calendar.get(Calendar.MONTH);
        edt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePickerDialog = new DatePickerDialog(DatePicker2Activity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int day, int year, int month) {
                         edt.setText((datePicker.getDayOfMonth())+"/"+(month+1)+"/"+year);
                            }
                        },year,month,day);
            }
        });
datePickerDialog.show();

    }
}