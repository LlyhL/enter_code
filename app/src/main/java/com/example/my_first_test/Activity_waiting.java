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

public class Activity_waiting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting);
        Timer timer1 = new Timer();
        Timer timer2 = new Timer();
        Random r = new Random();
        int i1 = 10+r.nextInt(20);
        Intent intent4=new Intent(Activity_waiting.this,Activity_waiting2.class);
        timer1.schedule(new TimerTask(){
            public void run(){
                startActivity(intent4);
                finish();
            }
        }, i1*100);

    }
}