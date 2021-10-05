package com.example.tareaint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;

public class ImagenActivity extends AppCompatActivity implements View.OnClickListener {

    String name, genre;
    TextView dataName;
    Button btnExit, btnLogout;
    ImageView img;
    Funciones f = new Funciones();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen);


dataName = findViewById(R.id.txtData1);
img = findViewById(R.id.img);


btnExit = findViewById(R.id.btnExit3);
btnLogout = findViewById(R.id.btnLogout2);

btnExit.setOnClickListener(this);
btnLogout.setOnClickListener(this);

int min, max, rNum;
max = 5;
min = 1;
rNum = (int) Math.floor(Math.random()*(max-min+1)+min);
        name = getIntent().getStringExtra("name");
        genre = getIntent().getStringExtra("genre");
        dataName.setText("Nombre: "+name+" - Genero: "+genre);


        if(genre.equals("Masculino") ){
            img.setImageResource(R.drawable.m1);
            switch (rNum){
                case 1:
                    img.setImageResource(R.drawable.m1);
                    break;
                case 2:
                    img.setImageResource(R.drawable.m2);
                    break;
                case 3:
                    img.setImageResource(R.drawable.m3);
                    break;
                case 4:
                    img.setImageResource(R.drawable.m4);
                    break;
                case 5:
                    img.setImageResource(R.drawable.m5);
                    break;
            }

        }
        else {
            img.setImageResource(R.drawable.w1);
            switch (rNum){
                case 1:
                    img.setImageResource(R.drawable.w1);
                    break;
                case 2:
                    img.setImageResource(R.drawable.w2);
                    break;
                case 3:
                    img.setImageResource(R.drawable.w3);
                    break;
                case 4:
                    img.setImageResource(R.drawable.w4);
                    break;
                case 5:
                    img.setImageResource(R.drawable.w5);
                    break;
            }
        }

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnExit3:
                f.Salir(this);
                break;
            case R.id.btnLogout2:
                f.Logout(this);
                break;


        }
    }
}