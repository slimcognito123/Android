package com.example.cursomaana.garqhusa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by curso mañana on 17/02/2017.
 */

public class PartidaGuardada {
    AppCompatActivity activity;
    Bundle extras;

    public PartidaGuardada() {
    }

    public PartidaGuardada(AppCompatActivity activity, Bundle extras) {
        this.activity = activity;
        this.extras = extras;
    }

    public AppCompatActivity getActivity() {
        return activity;
    }

    public void setActivity(AppCompatActivity activity) {
        this.activity = activity;
    }

    public Bundle getExtras() {
        return extras;
    }

    public void setExtras(Bundle extras) {
        this.extras = extras;
    }
}
