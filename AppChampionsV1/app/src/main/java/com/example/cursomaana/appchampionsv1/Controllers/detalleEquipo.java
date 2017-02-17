package com.example.cursomaana.appchampionsv1.Controllers;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cursomaana.appchampionsv1.Beans.Equipo;
import com.example.cursomaana.appchampionsv1.Beans.Jugador;
import com.example.cursomaana.appchampionsv1.Model.InstanciaRepo;
import com.example.cursomaana.appchampionsv1.R;

public class DetalleEquipo extends AppCompatActivity {
    private ImageView escudo;
    private ImageView entrenador;
    private TextView nombreEquipo;
    private TextView nombreEntrenador;
    private GridView regilla;
    private View layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_equipo);
        Intent intent = this.getIntent();

        final Equipo team= InstanciaRepo.getInstance().findTeam(intent.getStringExtra("equipo"));

        escudo = (ImageView) findViewById(R.id.imagenEscudo);
        entrenador = (ImageView) findViewById(R.id.perfilEntrenador);
        nombreEntrenador = (TextView) findViewById(R.id.nombreEntrenadorDetalle);
        nombreEquipo  = (TextView) findViewById(R.id.nombreEquipoDetalle);
        escudo.setImageResource(team.getEscudo());
        entrenador.setImageResource(team.getEntrenador().getImgPerfil());
        nombreEntrenador.setText(team.getEntrenador().getNombre());
        nombreEquipo.setText(team.getNombre());

        layout = findViewById(R.id.activity_detalle_equipo);
        layout.setBackgroundColor(intent.getIntExtra("tema", Color.BLACK));

        regilla = (GridView) findViewById(R.id.regillaJugadores);
        AdaptadorJugadores adapter =  new AdaptadorJugadores(this,team);
        regilla.setAdapter(adapter);
        regilla.setBackgroundColor(intent.getIntExtra("tema", Color.BLACK));

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
        escudo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(team.getPaginaWeb()));
                startActivity(i);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id= item.getItemId();
        switch (id){
            case R.id.settings1_1:
                layout.setBackgroundColor(ContextCompat.getColor(this,android.R.color.holo_blue_light));
                regilla.setBackgroundColor(ContextCompat.getColor(this,android.R.color.holo_blue_light));
                break;
            case R.id.settings1_2:
                layout.setBackgroundColor(Color.WHITE);
                regilla.setBackgroundColor(Color.WHITE);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
