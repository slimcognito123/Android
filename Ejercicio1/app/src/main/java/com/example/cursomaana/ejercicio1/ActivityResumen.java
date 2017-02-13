package com.example.cursomaana.ejercicio1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ActivityResumen extends AppCompatActivity {

    private boolean privacidad;
    private boolean ahorro;
    private String nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);
        privacidad = (boolean) savedInstanceState.get("privacidad");
        ahorro = (boolean) savedInstanceState.get("ahorrador");
        nombre = (String) savedInstanceState.get("nombreUsuario");
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText("Bienvenido "+nombre);
        TextView ahorrador  = (TextView) findViewById(R.id.boolAhorro);
        TextView privado = (TextView) findViewById(R.id.boolPrivi);
        if(ahorro){
            ahorrador.setText("Activado");
        }

    }
}
