package com.example.cursomaana.appchampionsv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdaptadorPartidos adapter= new AdaptadorPartidos(this,new PartiHub().todosLosPartidos());
        ListView lista = (ListView) findViewById(R.id.lista);
        lista.setAdapter(adapter);
    }
}
