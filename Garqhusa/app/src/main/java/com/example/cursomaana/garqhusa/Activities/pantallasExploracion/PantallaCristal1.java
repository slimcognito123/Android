package com.example.cursomaana.garqhusa.Activities.pantallasExploracion;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cursomaana.garqhusa.PartidaGuardada;
import com.example.cursomaana.garqhusa.R;
import com.google.gson.Gson;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class PantallaCristal1 extends AppCompatActivity {
    /**
     * Whether or not the system UI should be auto-hidden after
     * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
     */
    private static final boolean AUTO_HIDE = true;

    /**
     * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
     * user interaction before hiding the system UI.
     */
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

    /**
     * Some older devices needs a small delay between UI widget updates
     * and a change of the status and navigation bar.
     */
    private static final int UI_ANIMATION_DELAY = 300;
    private final Handler mHideHandler = new Handler();
    private View mContentView;
    private final Runnable mHidePart2Runnable = new Runnable() {
        @SuppressLint("InlinedApi")
        @Override
        public void run() {
            // Delayed removal of status and navigation bar

            // Note that some of these constants are new as of API 16 (Jelly Bean)
            // and API 19 (KitKat). It is safe to use them, as they are inlined
            // at compile-time and do nothing on earlier devices.
            mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        }
    };
    private View mControlsView;
    private final Runnable mShowPart2Runnable = new Runnable() {
        @Override
        public void run() {
            // Delayed display of UI elements
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.show();
            }
            mControlsView.setVisibility(View.VISIBLE);
        }
    };
    private boolean mVisible;
    private final Runnable mHideRunnable = new Runnable() {
        @Override
        public void run() {
            hide();
        }
    };
    /**
     * Touch listener to use for in-layout UI controls to delay hiding the
     * system UI. This is to prevent the jarring behavior of controls going away
     * while interacting with activity UI.
     */
    private final View.OnTouchListener mDelayHideTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (AUTO_HIDE) {
                delayedHide(AUTO_HIDE_DELAY_MILLIS);
            }
            return false;
        }
    };
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pantalla_cristal1);

        mVisible = true;
        mControlsView = findViewById(R.id.fullscreen_content_controls);
        mContentView = findViewById(R.id.fullscreen_content);


        // Set up the user interaction to manually show or hide the system UI.

        // Upon interacting with UI controls, delay any scheduled hide()
        // operations to prevent the jarring behavior of controls going away
        // while interacting with the UI.
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        // Trigger the initial hide() shortly after the activity has been
        // created, to briefly hint to the user that UI controls
        // are available.
        mediaPlayer = MediaPlayer.create(this,R.raw.ffxii_land_of_memories);
        mediaPlayer.setVolume(100,100);
        mediaPlayer.start();
        delayedHide(0);
        incialize();
    }

    private void incialize() {
        final Button opcion1 = (Button) findViewById(R.id.opcion1);
        final Button opcion2 = (Button) findViewById(R.id.opcion2);
        final TextView texto = (TextView) findViewById(R.id.TextoPantalla);
        opcion1.setText("Guardar");
        opcion2.setText("No guardar");
        texto.setText("Hay un cristal de de vitalidad, has curado tus heridas.\n Deseas guardar la partida?");
        final Intent lastIntent;
        lastIntent = getIntent();
        lastIntent.putExtra("bienvenida", false);
        opcion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AsyncTask asyncTask =new AsyncTask() {
                    @Override
                    protected Boolean doInBackground(Object[] params) {
                        SharedPreferences archivoGuardado = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                        SharedPreferences.Editor editor = archivoGuardado.edit();
                        Gson gson = new Gson();
                        Intent intentoGuardarPartida= new Intent(PantallaCristal1.this,PantallaCristal1.this.getClass());
                       /*Bundle bundle = lastIntent.getExtras();
                        intentoGuardarPartida.putExtras(bundle);*/
//                        intentoGuardarPartida.putExtras(lastIntent.getExtras());
//                        PartidaGuardada partidaGuardada = new PartidaGuardada(PantallaCristal1.this, lastIntent.getExtras());
//                        PartidaGuardada partidaGuardada = new PartidaGuardada(intentoGuardarPartida);
//                        Log.i("partida guardada", String.valueOf(partidaGuardada));
                        String partida = gson.toJson(intentoGuardarPartida);
                        editor.putString("guardarPartida", partida);
                        return editor.commit();
                    }
                };
                asyncTask.execute();

                Toast toast1 =Toast.makeText(getApplicationContext(),"Partida guardada", Toast.LENGTH_SHORT);
                toast1.show();
                cambiarUso(opcion1,opcion2,texto, lastIntent);
            }
        });
        opcion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarUso(opcion1,opcion2,texto,lastIntent);
            }
        });

    }


    private void cambiarUso(Button opcion1, Button opcion2, TextView texto, final Intent lastIntent) {
        opcion1.setText("hacia la cueva");
        opcion2.setText("direccion contraria a la cueva");
        texto.setText("Una vez sanadas tus heridas, debes proseguir tu camino");
        opcion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent haciaPuertaCiudad = new Intent(PantallaCristal1.this, PuertaTemploCeleste.class);
                haciaPuertaCiudad.putExtras(lastIntent);
                startActivity(haciaPuertaCiudad);
                finish();
            }
        });
        opcion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent haciaCueva = new Intent(PantallaCristal1.this, PrimeraPantalla.class);
                haciaCueva.putExtras(lastIntent);
                startActivity(haciaCueva);
                finish();
            }
        });
    }


    private void hide() {
        // Hide UI first
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        mControlsView.setVisibility(View.GONE);
        mVisible = false;

        // Schedule a runnable to remove the status and navigation bar after a delay
        mHideHandler.removeCallbacks(mShowPart2Runnable);
        mHideHandler.postDelayed(mHidePart2Runnable, UI_ANIMATION_DELAY);
    }

    @SuppressLint("InlinedApi")
    private void show() {
        // Show the system bar
        mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        mVisible = true;

        // Schedule a runnable to display UI elements after a delay
        mHideHandler.removeCallbacks(mHidePart2Runnable);
        mHideHandler.postDelayed(mShowPart2Runnable, UI_ANIMATION_DELAY);
    }

    /**
     * Schedules a call to hide() in [delay] milliseconds, canceling any
     * previously scheduled calls.
     */
    private void delayedHide(int delayMillis) {
        mHideHandler.removeCallbacks(mHideRunnable);
        mHideHandler.postDelayed(mHideRunnable, delayMillis);
    }

    @Override
    protected void onPause() {
        mediaPlayer.pause();
        super.onPause();
    }

    @Override
    protected void onResume() {
        mediaPlayer.start();
        super.onResume();
    }
}
