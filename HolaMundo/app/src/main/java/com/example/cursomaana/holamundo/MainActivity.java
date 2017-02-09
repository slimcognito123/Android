package com.example.cursomaana.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.botonaaacoooooooooooo);
        editText = (EditText) findViewById(R.id.texto1delMainActivity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreUsuario = editText.getText().toString();
                Log.i("El nombre del usuario ", nombreUsuario);
                System.out.println("el nombre de usuario es "+ nombreUsuario);
            }
        });
    }

    @Override
    protected void onPause() {
        Bundle bundle = new Bundle();
        bundle.putString("NombreUsuario", "pene");
        onSaveInstanceState(bundle);
    }
}
