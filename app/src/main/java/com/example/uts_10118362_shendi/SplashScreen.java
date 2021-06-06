package com.example.uts_10118362_shendi;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
/* Tanggal pengerjaan : Jumat 4 Juni 2021
        NIM : 10118362
        NAMA : Shendi Rakhma Diansyah
        Kelas : IF-9*/

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run () {

                Intent MainIntent =new Intent(com.example.uts_10118362_shendi.SplashScreen.this, com.example.uts_10118362_shendi.MainView.class);

                startActivity(MainIntent);
                finish();
            }

        }, 4000);

    }
}