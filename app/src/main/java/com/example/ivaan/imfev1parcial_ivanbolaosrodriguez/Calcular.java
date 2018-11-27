package com.example.ivaan.imfev1parcial_ivanbolaosrodriguez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Calcular extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular);
        String minumero1 = getIntent().getStringExtra("num1");
        String minumero2 = getIntent().getStringExtra("num2");

        Integer num1 = Integer.parseInt(minumero1);
        Integer num2 = Integer.parseInt(minumero2);

        TextView suma = (TextView) findViewById(R.id.suma);
        int calcsuma = num1 + num2 ;
        String result= "Su suma es: "+ calcsuma;
        suma.setText(result);

        TextView resta = (TextView) findViewById(R.id.resta);
        int calcrest = num1 - num2;
         result= "Su resta es: "+ calcrest;
        resta.setText(result);

        TextView mult = (TextView) findViewById(R.id.multiplicacion);
        int calcmult = num1 * num2;
        result= "Su multiplicacion es: "+ calcmult;
        mult.setText(result);

    }
}
