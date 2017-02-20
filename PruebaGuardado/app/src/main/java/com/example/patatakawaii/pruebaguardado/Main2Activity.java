package com.example.patatakawaii.pruebaguardado;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SharedPreferences archivoGuardado = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        TextView texto = (TextView) findViewById(R.id.textView2);
        texto.setText(String.valueOf(archivoGuardado.getString("texto",null)));
    }
}
