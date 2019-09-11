package com.example.appmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    private ImageView imgSplash;
    private Timer timer = new Timer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        imgSplash = findViewById(R.id.img_music);

        imgSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jump();
            }
        });
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                jump();
            }
        },5000);
    }

    private void jump(){
        timer.cancel();
        startActivity(new Intent(Splash.this,HomeActivity.class));
    }
}
