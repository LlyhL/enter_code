package com.example.my_first_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ProgressBar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class Activity_waiting2 extends AppCompatActivity {

    private  ProgressBar bar1;
    private  ProgressBar bar2;
    private  TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting2);
        Timer timer1 = new Timer();
        Random r = new Random();
        int i2 = 5+r.nextInt(20);
        Intent intent5=new Intent(Activity_waiting2.this,entry.class);
        timer1.schedule(new TimerTask(){
            public void run(){
                startActivity(intent5);
                finish();
            }
        }, i2*100);
    }
}