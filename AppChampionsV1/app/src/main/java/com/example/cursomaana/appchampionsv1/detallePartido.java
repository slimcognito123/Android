package com.example.cursomaana.appchampionsv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detallePartido extends AppCompatActivity {
    private TextView estadio;
    private ImageView imgEstadio;
    private TextView nombreLocal;
    private TextView entrenadorLocal;
    private TextView estadoLocal;
    private TextView nombreVisitante;
    private TextView entrenadorVisitante;
    private TextView estadoVisitante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_partido);
        Intent intent = getIntent();
        estadio= (TextView) findViewById(R.id.tagEstadio);
        imgEstadio= (ImageView) findViewById(R.id.imageView);
        nombreLocal= (TextView) findViewById(R.id.tagEquipoLocal);
        entrenadorLocal= (TextView) findViewById(R.id.TagEntrenadorLocal);
        estadoLocal= (TextView) findViewById(R.id.tagEstadoLocal);
        nombreVisitante= (TextView) findViewById(R.id.tagEquipoVisitante);
        entrenadorVisitante= (TextView) findViewById(R.id.tagEntrenadorVisitante);
        estadoVisitante= (TextView) findViewById(R.id.tagEstadoVisitante);

        //buscamos el partido
        String equipo = intent.getExtras().getString("nombreLocal");
        String fecha = intent.getExtras().getString("dia");
        String hora = intent.getExtras().getString("hora");
        Partido partido = new PartiHub().buscarPartido(equipo,fecha,hora);

        estadio.setText(partido.getLocal().getNombreEstadio());
        imgEstadio.setImageResource(partido.getLocal().getImagenEstadio());

        nombreLocal.setText(partido.getLocal().getNombre());
        entrenadorLocal.setText(partido.getLocal().getEntrenador());
        estadoLocal.setText(partido.getLocal().getEstado());

        nombreVisitante.setText(partido.getVisitante().getNombre());
        entrenadorVisitante.setText(partido.getVisitante().getEntrenador());
        estadoVisitante.setText(partido.getVisitante().getEstado());

    }
}
