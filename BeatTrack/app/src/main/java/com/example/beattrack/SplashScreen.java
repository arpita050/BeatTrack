package com.example.beattrack;

import static com.example.beattrack.R.id.progressbar;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity {

    private static final long SPLASH_DELAY = 2000; // 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        ProgressBar progressBar = findViewById(progressbar);
        progressBar.setMax(100); // Set the maximum progress value
        progressBar.setProgress(0); // Set the initial progress value

        ObjectAnimator progressAnimator = ObjectAnimator.ofInt(progressBar, "progress", 0, 100);
        progressAnimator.setDuration(2000); // Adjust the duration as needed (in milliseconds)
        progressAnimator.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the Start activity after the delay
                Intent intent = new Intent(SplashScreen.this, Start.class);
                startActivity(intent);
                finish(); // Optional: close the splash screen activity
            }
        }, SPLASH_DELAY);
    }
}