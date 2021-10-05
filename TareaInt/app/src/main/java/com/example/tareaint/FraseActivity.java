package com.example.tareaint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FraseActivity extends AppCompatActivity implements View.OnClickListener {

    String name, genre;
    TextView dataName, txtFrase;
    Button btnExit, btnLogout;
    Funciones f = new Funciones();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frase);

        int min, max, rNum;
        max = 5;
        min = 1;
        rNum = (int) Math.floor(Math.random()*(max-min+1)+min);

        txtFrase = findViewById(R.id.txtFrase);
        dataName = findViewById(R.id.txtData2);
        btnExit = findViewById(R.id.btnExit4);
        btnLogout = findViewById(R.id.btnLogout3);

        btnExit.setOnClickListener(this);
        btnLogout.setOnClickListener(this);

        name = getIntent().getStringExtra("name");
        genre = getIntent().getStringExtra("genre");
        dataName.setText("Nombre: "+name+" - Genero: "+genre);
        String t = "Vacio";
        if(genre.equals("Masculino") ){

            switch (rNum){
                case 1:
                    t =  "No importa cuán capacitado que estés, tú solo no puedes cambiar el mundo. Pero eso es lo maravilloso del mundo.";
                    break;
                case 2:
t = "Eres un ser increíble, diste lo mejor de ti y por eso te admiro. Pasaste por varias transformaciones, fuiste tan poderoso que todos nosotros te odiamos.";
                    break;
                case 3:
                    t = "No vivas con falsedades ni miedos, porque terminarás odiándote a ti mismo. ";
                    break;
                case 4:
                    t = "A mí me da igual que los dioses existan o no, yo soy el amo de mi vida; paso de los temas religiosos, pero jamás menospreciaré a alguien que crea en ellos.";
                    break;
                case 5:
                    t = "Si no tienes recuerdos felices, nunca es tarde para comenzar a construirlos.";
                    break;

            }
            txtFrase.setText(t);

        }
        else {

            switch (rNum){
                case 1:
                    t = "La gente necesita el miedo para poder sobrevivir. Lo experimentamos, y así podemos hacernos más fuertes.";
                    break;
                case 2:
                    t = "Dicen que la gente puede cambiar, pero... ¿Eso será cierto? Si deciden que quieren volar, ¿les salen alas? No lo creo. No tienes que cambiar tú, sino como haces las cosas. Tienes que crear una manera de volar mientras sigues siendo igual.";
                    break;
                case 3:
                    t = "En el momento en que dejes de aceptar los desafíos, será el momento en que tu vida termine";
                    break;
                case 4:
                    t = "Mientras más peligroso y pronunciado sea el camino, más se necesita de ingenio e ignorancia para recorrerlo.";
                    break;
                case 5:
                    t = "Tienes que disfrutar de los pequeños desvíos al máximo. Porque es ahí donde encontrarás cosas mas importantes de las que quieres.";
                    break;
            }
            txtFrase.setText(t);
        }


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnExit4:
                f.Salir(this);
                break;
            case R.id.btnLogout3:
                f.Logout(this);
                break;


        }
    }
}