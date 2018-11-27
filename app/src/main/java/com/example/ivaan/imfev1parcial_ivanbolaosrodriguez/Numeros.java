package com.example.ivaan.imfev1parcial_ivanbolaosrodriguez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Numeros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);
    }

    public void calcular (View v){
        EditText num1 = (EditText) findViewById(R.id.numero1);
        String num1text = num1.getText().toString();
        EditText num2 = (EditText) findViewById(R.id.numero2);
        String num2text = num2.getText().toString();

        Intent intent = new Intent(getApplicationContext(),Calcular.class);
        intent.putExtra("num1",num1text);
        intent.putExtra("num2", num2text);

        startActivity(intent);

    }
}
