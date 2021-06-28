package com.example.musicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {


                try {
                    Thread.sleep(3000);
                    Intent intent=new Intent(SplashScreenActivity.this, CreateAccountActivity.class);
                    startActivity(intent);
                    finish();



                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        });
        thread.start();




    }
}