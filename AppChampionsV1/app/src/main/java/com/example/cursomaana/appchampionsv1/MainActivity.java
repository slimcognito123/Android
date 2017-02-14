package com.example.cursomaana.appchampionsv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdaptadorPartidos adapter= new AdaptadorPartidos(this,new PartiHub().todosLosPartidos());
        final ListView lista = (ListView) findViewById(R.id.lista);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int posicion, long id) {
                Intent intent = new Intent (MainActivity.this,detallePartido.class);
                intent.putExtra("nombreLocal",((Partido)lista.getItemAtPosition(posicion)).getLocal().getNombre());
                intent.putExtra("dia",((Partido)lista.getItemAtPosition(posicion)).getFecha());
                intent.putExtra("hora",((Partido)lista.getItemAtPosition(posicion)).getHora());
                startActivity(intent);
            }
        });
    }
}
