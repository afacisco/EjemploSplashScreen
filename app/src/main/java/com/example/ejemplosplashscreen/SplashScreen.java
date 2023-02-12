package com.example.ejemplosplashscreen;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/*
Autor: Juan Francisco Sánchez González
Fecha: 10/02/2023
Clase: Actividad para el Splash Screen.
*/

public class SplashScreen extends AppCompatActivity {

    // Constante de tiempo de duración para el Splash Screen
    final static int TIEMPO = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, TIEMPO);
    }
}
