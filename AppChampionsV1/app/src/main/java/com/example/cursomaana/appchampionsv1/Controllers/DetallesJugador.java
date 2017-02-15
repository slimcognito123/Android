package com.example.cursomaana.appchampionsv1.Controllers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cursomaana.appchampionsv1.Beans.Jugador;
import com.example.cursomaana.appchampionsv1.Model.PartiHub;
import com.example.cursomaana.appchampionsv1.R;

public class DetallesJugador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_jugador);
        Intent intento = getIntent();
        Jugador jugador;
        if (intento.getBooleanExtra("isCoach", false))
            jugador = new PartiHub().findCoach(intento.getStringExtra("equipo"));
        else
            jugador = new PartiHub().findPlayer(intento.getStringExtra("equipo"), intento.getStringExtra("nombreJugador"));

        TextView nombre = (TextView) findViewById(R.id.PlayerName);
        ImageView image = (ImageView) findViewById(R.id.PlayerImage);
        TextView posicion = (TextView) findViewById(R.id.PlayerPosition);
        nombre.setText(jugador.getNombre());
        image.setImageResource(jugador.getImgPerfil());
        posicion.setText(jugador.getPosicion());
    }
}
