package com.example.my_first_test;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class entry extends father {

    private TextView uname;
    private TextView time_show;
    private ImageView popup;
    Timer timer1 = new Timer();
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        Intent intent=this.getIntent();
        String u_name=total ;
        if(u_name.length()<2)u_name="路人甲";
        uname=findViewById(R.id.textView_username);
        time_show=findViewById(R.id.textView_timer);
        popup=findViewById(R.id.imageView_pop);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// HH:mm:ss
        //获取当前时间
        Date date = new Date(System.currentTimeMillis());
        time_show.setText(simpleDateFormat.format(date));
        time_show.setMovementMethod(LinkMovementMethod.getInstance());
        time_show.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        time_show.setSingleLine(true);
        time_show.setSelected(true);
        time_show.setFocusable(true);
        time_show.setFocusableInTouchMode(true);
        uname.setText(u_name);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                popup.setVisibility(View.GONE);
            }
        }, 1500);
       /* popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    popup.setVisibility(View.GONE);
            }
        });*/
    }
}