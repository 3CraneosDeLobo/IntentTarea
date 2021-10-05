package com.example.tareaint;

import static androidx.core.app.ActivityCompat.finishAffinity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;


import androidx.appcompat.app.AlertDialog;

public class Funciones {


    public void Salir(Activity activity){

        AlertDialog.Builder alert = new AlertDialog.Builder(activity);
        alert.setTitle("Salir de la App")
                .setMessage("Esta seguro que quiere salir?")
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                     finishAffinity(activity);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Nada xd
                    }
                })
                .create()
                .show();


    }

    public void Logout(Activity activity){
        Intent i = new Intent(activity, MainActivity.class);
        activity.startActivity(i);
    }


}
