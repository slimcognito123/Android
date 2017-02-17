package com.example.cursomaana.appchampionsv1.Controllers;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.cursomaana.appchampionsv1.Beans.Partido;
import com.example.cursomaana.appchampionsv1.Model.PartiHub;
import com.example.cursomaana.appchampionsv1.R;

public class MainActivity extends AppCompatActivity {

    private View layout;
    private ListView lista;
    private int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent lastIntent = getIntent();
        layout = findViewById(R.id.activity_main);
        layout.setBackgroundColor(lastIntent.getIntExtra("tema", Color.WHITE));
        AdaptadorPartidos adapter= new AdaptadorPartidos(this,new PartiHub().todosLosPartidos());
        lista = (ListView) findViewById(R.id.lista);
        lista.setAdapter(adapter);
        lista.setBackgroundColor(lastIntent.getIntExtra("tema", Color.WHITE));
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int posicion, long id) {
                Intent intent = new Intent (MainActivity.this,DetallePartido.class);
                intent.putExtra("id",((Partido) lista.getItemAtPosition(posicion)).getId());
                intent.putExtra("tema",color);
                startActivity(intent);
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
                lista.setBackgroundColor(color);
                break;
            case R.id.settings1_2:
                color = Color.WHITE;
                layout.setBackgroundColor(color);
                lista.setBackgroundColor(color);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
