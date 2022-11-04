package com.example.my_first_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.provider.MediaStore;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends father {
    //声明控件
    private ImageView myImageview;
    private ImageView imageViewPull;
    private EditText edtit_text_un;
    //public static String user_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent1=new Intent(MainActivity.this,entry.class);
        Intent intent2=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        Intent intent3=new Intent(MainActivity.this,Activity_waiting.class);
        Timer timer = new Timer();
        myImageview=findViewById(R.id.imageView_more);
        imageViewPull=findViewById(R.id.pulldown);
        edtit_text_un=findViewById(R.id.editView_typename);
        myImageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(imageViewPull.getVisibility()==View.VISIBLE)
                    imageViewPull.setVisibility(View.INVISIBLE);
                else
                    imageViewPull.setVisibility(View.VISIBLE);
            }
        });
        imageViewPull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total= edtit_text_un.getText().toString();
                if(imageViewPull.getVisibility()==View.VISIBLE)
                    imageViewPull.setVisibility(View.INVISIBLE);
                else
                    imageViewPull.setVisibility(View.VISIBLE);

                startActivityForResult(intent2,22);
                timer.schedule(new TimerTask(){
                    public void run(){
                        finishActivity(22);
                        startActivity(intent3);
                    }
                }, 1500);
            }
        });
    }
}