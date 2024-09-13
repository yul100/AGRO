package com.agro.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

      Button btn_Volver_home = findViewById(R.id.btn_Volver_home);

      btn_Volver_home.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              btn_Volver_home();
          }
      });
    }

    public  void  btn_Volver_home (){
        Intent intent = new Intent(this, MainActivity.class);
       startActivity(intent);
    }
}