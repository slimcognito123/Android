package com.example.cursomaana.ejercicio1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityResumen extends AppCompatActivity {

    private boolean privacidad;
    private boolean ahorro;
    private String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);
        Intent intento = this.getIntent();
        nombre = intento.getStringExtra("nombreUsuario");
        privacidad = intento.getBooleanExtra("privacidad", false);
        ahorro = intento.getBooleanExtra("ahorrador", false);
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText("Bienvenido " + nombre);
        TextView ahorrador = (TextView) findViewById(R.id.boolAhorro);
        TextView privado = (TextView) findViewById(R.id.boolPrivi);
        Button inicio = (Button) findViewById(R.id.back_ini);
        TextView tono = (TextView) findViewById(R.id.tono);
        TextView tema = (TextView) findViewById(R.id.tema);
        TextView red = (TextView) findViewById(R.id.redMovil);
        Intent intent= this.getIntent();
        tono.setText(intent.getStringExtra("musica"));
        tema.setText(intent.getStringExtra("tema"));
        red.setText(intent.getStringExtra("red"));
        if (ahorro) {
            ahorrador.setText("Activado");
            ahorrador.setTextColor(Color.GREEN);
        } else {
            ahorrador.setText("Desactivado");
            ahorrador.setTextColor(Color.RED);
        }
        if (privacidad) {
            privado.setText("Activado");
            privado.setTextColor(Color.GREEN);
        } else {
            privado.setText("Desactivado");
            privado.setTextColor(Color.RED);
        }
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityResumen.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
