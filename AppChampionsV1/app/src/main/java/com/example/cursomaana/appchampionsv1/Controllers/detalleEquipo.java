package com.example.cursomaana.appchampionsv1.Controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cursomaana.appchampionsv1.Beans.Equipo;
import com.example.cursomaana.appchampionsv1.Beans.Jugador;
import com.example.cursomaana.appchampionsv1.Model.PartiHub;
import com.example.cursomaana.appchampionsv1.R;

public class DetalleEquipo extends AppCompatActivity {
    private ImageView escudo;
    private ImageView entrenador;
    private TextView nombreEquipo;
    private TextView nombreEntrenador;
    private GridView regilla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_equipo);
        Intent intent = this.getIntent();
        final Equipo team= new PartiHub().findTeam(intent.getStringExtra("equipo"));
        escudo = (ImageView) findViewById(R.id.imagenEscudo);
        entrenador = (ImageView) findViewById(R.id.perfilEntrenador);
        nombreEntrenador = (TextView) findViewById(R.id.nombreEntrenadorDetalle);
        nombreEquipo  = (TextView) findViewById(R.id.nombreEquipoDetalle);
        escudo.setImageResource(team.getEscudo());
        entrenador.setImageResource(team.getEntrenador().getImgPerfil());
        nombreEntrenador.setText(team.getEntrenador().getNombre());
        nombreEquipo.setText(team.getNombre());

        regilla = (GridView) findViewById(R.id.regillaJugadores);
        AdaptadorJugadores adapter =  new AdaptadorJugadores(this,team);
        regilla.setAdapter(adapter);
        regilla.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int posicion, long id) {
                Intent intent = new Intent (DetalleEquipo.this,DetallesJugador.class);
                intent.putExtra("equipo",team.getNombre());
                intent.putExtra("nombreJugador",((Jugador)regilla.getItemAtPosition(posicion)).getNombre());
                startActivity(intent);
            }
        });
        entrenador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (DetalleEquipo.this,DetallesJugador.class);
                intent.putExtra("equipo",team.getNombre());
                intent.putExtra("isCoach",true);
                startActivity(intent);
            }
        });
    }
}
