package com.example.tareaint;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.EditText;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Spinner select;
    Button btnLogin, btnExit;
    EditText txtName;


    Funciones f = new Funciones();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnLogin = findViewById(R.id.btnLogin);
        btnExit = findViewById(R.id.btnExit);
        txtName = findViewById(R.id.txtName);
        select = findViewById(R.id.spinner);


        btnLogin.setOnClickListener(this);
        btnExit.setOnClickListener(this);

      String genero[] = {"Masculino", "Femenino"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, genero);

        select.setAdapter(adapter);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.btnLogin:

                if(txtName.length() <= 0){
                    AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setTitle("El Campo Nombre Está Vacio!")
                        .setMessage("El campo Nombre debe completarse")
                        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                txtName.requestFocus();

                            }
                        })
                        .create()
                        .show();

                }
                else{



                    Entrar();
                }

                break;
            case R.id.btnExit:

f.Salir(this);

                break;


        }

    }


    public void Entrar(){
        String name0, genre0;
        name0 = txtName.getText().toString();
        genre0 = select.getSelectedItem().toString();
        Intent Enter = new Intent(this, DentroActivity.class);
        Enter.putExtra("name", name0);
        Enter.putExtra("genre", genre0);
        startActivity(Enter);
    }
}