package com.example.prepzy_final;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Display splash screen for 3 seconds
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, com.example.prepzy_final.MainActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish(); // Close splash so user can’t go back to it
        }, 3000); // 3000 milliseconds = 3 seconds
    }
}
