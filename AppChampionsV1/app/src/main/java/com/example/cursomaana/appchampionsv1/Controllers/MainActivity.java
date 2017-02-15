package com.example.cursomaana.appchampionsv1.Controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.cursomaana.appchampionsv1.Beans.Partido;
import com.example.cursomaana.appchampionsv1.Model.PartiHub;
import com.example.cursomaana.appchampionsv1.R;

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
                Intent intent = new Intent (MainActivity.this,DetallePartido.class);
                intent.putExtra("id",((Partido)lista.getItemAtPosition(posicion)).getId());
                startActivity(intent);
            }
        });
    }
}
