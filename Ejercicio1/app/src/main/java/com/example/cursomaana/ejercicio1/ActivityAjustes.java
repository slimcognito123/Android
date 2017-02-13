package com.example.cursomaana.ejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.ToggleButton;

public class ActivityAjustes extends AppCompatActivity {

    private Switch privacidad;
    private ToggleButton ahorro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);
        Button ok = (Button) findViewById(R.id.ok);
        Button atras = (Button) findViewById(R.id.atras);
        ahorro = (ToggleButton) findViewById(R.id.ahorro);
        privacidad = (Switch) findViewById(R.id.privacidad);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean ahorrador = ahorro.isChecked();
                boolean perfilPrivado = privacidad.isChecked();
                Intent intent = new Intent(ActivityAjustes.this, ActivityResumen.class);
                intent.putExtra("ahorrador", ahorrador);
                intent.putExtra("privacidad",perfilPrivado);
                startActivity(intent);
            }
        });
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityAjustes.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
