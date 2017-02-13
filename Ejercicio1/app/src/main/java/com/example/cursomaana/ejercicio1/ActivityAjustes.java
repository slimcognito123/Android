package com.example.cursomaana.ejercicio1;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.ToggleButton;

public class ActivityAjustes extends AppCompatActivity {

    private Switch privacidad;
    private ToggleButton ahorro;
    private RadioGroup Gbotones;
    private Spinner spinarack;
    private Spinner spinaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);
        Button ok = (Button) findViewById(R.id.ok);
        Button atras = (Button) findViewById(R.id.atras);
        ahorro = (ToggleButton) findViewById(R.id.ahorro);
        privacidad = (Switch) findViewById(R.id.privacidad);
        Gbotones = (RadioGroup) findViewById(R.id.radioGroup);
        Gbotones.check(R.id.radioAutoG);

        FloatingActionButton button = (FloatingActionButton) findViewById(R.id.button);
        spinarack = (Spinner) findViewById(R.id.spinTheme);
        spinaca = (Spinner) findViewById(R.id.spinTono);
        String[] datos = new String[]{"Claro", "Oscuro", "Azul"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, datos);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinarack.setAdapter(adaptador);
        ArrayAdapter<CharSequence> adapterUSB = ArrayAdapter.createFromResource(this, R.array.valores_array, android.R.layout.simple_spinner_item);
        adapterUSB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinaca.setAdapter(adapterUSB);
        listenerDeBotones(ok, atras, button);
    }

    private void listenerDeBotones(Button ok, Button atras, FloatingActionButton valoresPorDefecto) {
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean ahorrador = ahorro.isChecked();
                boolean perfilPrivado = privacidad.isChecked();
                Intent intent = new Intent(ActivityAjustes.this, ActivityResumen.class);
                intent.putExtra("nombreUsuario", ActivityAjustes.this.getIntent().getStringExtra("nombreUsuario"));
                intent.putExtra("ahorrador", ahorrador);
                intent.putExtra("privacidad", perfilPrivado);
                String seleccionTema = (String) spinarack.getSelectedItem();
                String seleccionMusica = (String) spinaca.getSelectedItem();
                intent.putExtra("red", getCheckedRadioButtonId());
                intent.putExtra("tema", seleccionTema);
                intent.putExtra("musica", seleccionMusica);
                startActivity(intent);
            }
        });
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityAjustes.this, MainActivity.class);
                startActivity(intent);
            }
        });
        valoresPorDefecto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ahorro.setChecked(false);
                privacidad.setChecked(false);
            }
        });
    }

    private String getCheckedRadioButtonId() {
        int boton=Gbotones.getCheckedRadioButtonId();
        if(boton==R.id.radio3G) return "3G";
        else if(boton==R.id.radio4G) return "4G";
        else return "auto";
    }
}
