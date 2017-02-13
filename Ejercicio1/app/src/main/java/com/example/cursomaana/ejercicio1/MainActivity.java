package com.example.cursomaana.ejercicio1;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private EditText nombre;
    private EditText emilio;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button aceptar = (Button) findViewById(R.id.aceptar);
        Button salir = (Button) findViewById(R.id.cancelar);
        nombre = (EditText) findViewById(R.id.nombre);
        emilio = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreUsuario = nombre.getText().toString();
                if(comprobar()){
                    Intent intent = new Intent(MainActivity.this, ActivityAjustes.class);
                    intent.putExtra("nombreUsuario", nombreUsuario);
                    startActivity(intent);
                }
            }
        });
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }

    private boolean comprobar() {
        boolean comprobando = true;
        Pattern sPattern = Pattern.compile("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,3})$");
        if (Pattern.matches(sPattern.pattern(),emilio.getText())){
            emilio.setError(null);
        }else{
            emilio.setError("la direccion de correo no es correcta");
            comprobando=false;
        }
        if(password.getText().length()<6){
            password.setError("contraseña demasiado pequeña minimo de 6");
            comprobando=false;
        }else if(password.getText().length()>12){
            password.setError("contraseña demasiado grande, maximo de 12");
            comprobando=false;
        }else{
            password.setError(null);
        }
        Log.i("tamaño de mi P..asword", String.valueOf(password.getTextSize()));
        return comprobando;
    }
}
