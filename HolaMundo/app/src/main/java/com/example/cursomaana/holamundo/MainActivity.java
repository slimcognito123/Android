package com.example.cursomaana.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prueba_frame);
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ToggleButton toggleButton1 = (ToggleButton) v;
                if (toggleButton1.isChecked()) Log.i("prueba toggle1","true");
                else Log.i("prueba toggle1","false");
            }
        });
        /*Button button = (Button) findViewById(R.id.botonaco);
        editText = (EditText) findViewById(R.id.texto1delMainActivity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreUsuario = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this,segundaActivity.class);
//                Bundle humbleBundle = new Bundle();
//                humbleBundle.putString("nombreUsuario", nombreUsuario);
//                intent.putExtra("extra",humbleBundle);
                intent.putExtra("nombreUsuario",nombreUsuario);
                startActivity(intent);
            }
        });*/
    }
}
