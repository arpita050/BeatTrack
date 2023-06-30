package com.example.beattrack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void onSignupClicked(View view) {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }

    public void onLoginClicked(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
