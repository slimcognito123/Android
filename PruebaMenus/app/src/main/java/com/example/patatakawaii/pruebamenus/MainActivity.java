package com.example.patatakawaii.pruebamenus;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    private LayoutInflater inflador;
    private View layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MenuItem itemColorAzul = (MenuItem) findViewById(R.id.settings1_1);
        inflador = LayoutInflater.from(this.getApplicationContext());
        layout = findViewById(R.id.activity_main);
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
                layout.setBackgroundColor(Color.BLUE);
                break;
            case R.id.settings1_2:
                layout.setBackgroundColor(Color.WHITE);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
