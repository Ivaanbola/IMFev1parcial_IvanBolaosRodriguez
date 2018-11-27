package com.example.ivaan.imfev1parcial_ivanbolaosrodriguez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void entrar (View v){
        Intent numeros = new Intent(getApplicationContext(),Numeros.class);
        startActivity(numeros);

    }



}
