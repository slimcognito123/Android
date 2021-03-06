package com.example.cursomaana.appchampionsv1.Controllers;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cursomaana.appchampionsv1.Beans.Estadio;
import com.example.cursomaana.appchampionsv1.Beans.Partido;
import com.example.cursomaana.appchampionsv1.Model.InstanciaRepo;
import com.example.cursomaana.appchampionsv1.R;

public class DetallePartido extends AppCompatActivity {
    private TextView estadio;
    private ImageView imgEstadio;
    private TextView nombreLocal;
    private TextView entrenadorLocal;
    private TextView estadoLocal;
    private TextView nombreVisitante;
    private TextView entrenadorVisitante;
    private TextView estadoVisitante;
    private ImageView escudoLocal;
    private ImageView escudoVisitante;
    private View layout;
    private int color;

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
        escudoLocal= (ImageView) findViewById(R.id.tagEscudoEquipoLocal);
        escudoVisitante= (ImageView) findViewById(R.id.tagEscudoEquipoVisitante);
        layout = findViewById(R.id.activity_detalle_partido);
        layout.setBackgroundColor(intent.getIntExtra("tema", Color.WHITE));

        //buscamos el partido
        int id = intent.getExtras().getInt("id");
        Partido partido = InstanciaRepo.getInstance().buscarPartido(id);

        final Estadio estadioPartido = partido.getLocal().getEstadio();
        this.estadio.setText(estadioPartido.getNombreEstadio());
        imgEstadio.setImageResource(estadioPartido.getImagenEstadio());

        escudoLocal.setImageResource(partido.getLocal().getEscudo());
        nombreLocal.setText(partido.getLocal().getNombre());
        entrenadorLocal.setText(partido.getLocal().getEntrenador().getNombre());
        estadoLocal.setText(partido.getLocal().getEstado());

        escudoVisitante.setImageResource(partido.getVisitante().getEscudo());
        nombreVisitante.setText(partido.getVisitante().getNombre());
        entrenadorVisitante.setText(partido.getVisitante().getEntrenador().getNombre());
        estadoVisitante.setText(partido.getVisitante().getEstado());

        escudoLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetallePartido.this, DetalleEquipoActivity.class);
                intent.putExtra("equipo",nombreLocal.getText());
                intent.putExtra("tema",color);
                startActivity(intent);
            }
        });
        escudoVisitante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetallePartido.this, DetalleEquipoActivity.class);
                intent.putExtra("equipo",nombreVisitante.getText());
                intent.putExtra("tema",color);
                startActivity(intent);
            }
        });
        imgEstadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(estadioPartido.getPaginaWeb()));
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
                color = ContextCompat.getColor(this, android.R.color.holo_blue_light);
                layout.setBackgroundColor(color);
                break;
            case R.id.settings1_2:
                color = Color.WHITE;
                layout.setBackgroundColor(color);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
