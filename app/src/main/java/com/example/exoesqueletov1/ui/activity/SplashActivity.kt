package com.example.exoesqueletov1.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.exoesqueletov1.R;
import com.example.exoesqueletov1.ui.activity.sing_in.SingInActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        arranque();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(SplashActivity.this,
                            SingInActivity.class));
                    finish();
                }
            }
        };
        timer.start();
    }

    private void arranque() {
        ImageView titulo = findViewById(R.id.titulo_image);
        ImageView logo = findViewById(R.id.logo_image);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.transition);
        titulo.startAnimation(animation);
        logo.startAnimation(animation);
    }
}