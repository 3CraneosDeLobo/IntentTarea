package com.example.tareaint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import  android.widget.Button;

public class DentroActivity extends AppCompatActivity implements View.OnClickListener {

    TextView dataName;
   String name, genre;
   Button btnExit, btnLogout, btnImg, btnFrase;
 Funciones f = new Funciones();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dentro);


        dataName = findViewById(R.id.txtData0);
        btnExit = findViewById(R.id.btnExit2);
        btnLogout = findViewById(R.id.btnLogout);
        btnImg = findViewById(R.id.btnImg);
        btnFrase = findViewById(R.id.btnFrase);

        btnExit.setOnClickListener(this);
        btnLogout.setOnClickListener(this);
        btnImg.setOnClickListener(this);
        btnFrase.setOnClickListener(this);


        name = getIntent().getStringExtra("name");
        genre = getIntent().getStringExtra("genre");
        dataName.setText("Nombre: "+name+" - Genero: "+genre);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnExit2:
                f.Salir(this);
                break;
            case R.id.btnLogout:
                f.Logout(this);
                break;
            case R.id.btnImg:
                Intent i = new Intent(this, ImagenActivity.class);
                i.putExtra("name", name);
                i.putExtra("genre", genre);
                startActivity(i);
                break;
            case R.id.btnFrase:
                Intent in = new Intent(this, FraseActivity.class);
                in.putExtra("name", name);
                in.putExtra("genre", genre);
                startActivity(in);
                break;


        }


    }
}