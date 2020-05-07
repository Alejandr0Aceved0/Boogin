package com.example.boogin;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent splash_intent = new Intent(SplashScreen.this, Login.class);
        startActivity(splash_intent);
        finish();
    }
}
