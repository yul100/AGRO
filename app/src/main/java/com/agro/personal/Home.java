package com.agro.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button  btnRegistro;
    Button  btnInicio_sesion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnRegistro = findViewById(R.id.btnRegistro);
        btnInicio_sesion = findViewById(R.id.btnInicio_sesion);

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Registro();
            }
        });
        btnInicio_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Inicio_sesion();
            }
        });

    }

    public  void Registro(){
        Intent intent = new Intent(this, Registro.class);
        startActivity(intent);
    }

    public  void Inicio_sesion() {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }
}