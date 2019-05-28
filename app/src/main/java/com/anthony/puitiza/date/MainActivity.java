package com.anthony.puitiza.date;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String date = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(new Date());

        DateFormat df = new SimpleDateFormat("mm-dd-yy HH:MM",Locale.FRANCE);
        String strDate = df.format(new Date());

        String yourstringdate =  new SimpleDateFormat("MM-dd-yy HH:mm",Locale.ENGLISH).format(Calendar.getInstance().getTime());


        Toast.makeText(this, date,Toast.LENGTH_SHORT).show();
        Toast.makeText(this, strDate,Toast.LENGTH_SHORT).show();
        Log.i("TAG",date);
        Log.i("TAG",strDate);
        Log.i("TAG",yourstringdate);
    }
}
