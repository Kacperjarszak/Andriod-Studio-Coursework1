package com.example.spaceinvaders;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javaproject.R;
import com.example.spaceinvaders.MainActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.javaproject.R.layout.splashscreen);

        Thread myThread = new Thread(){
            @Override
            public void run(){
                try{
                    sleep(4000);
                    Intent startgame = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(startgame);
                    finish();

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}