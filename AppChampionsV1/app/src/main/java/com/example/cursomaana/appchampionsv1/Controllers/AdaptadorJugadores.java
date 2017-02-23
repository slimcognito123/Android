package com.example.cursomaana.appchampionsv1.Controllers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.example.cursomaana.appchampionsv1.Beans.Equipo;
import com.example.cursomaana.appchampionsv1.Beans.Jugador;
import com.example.cursomaana.appchampionsv1.R;

import java.util.ArrayList;

/**
 * Created by curso mañana on 15/02/2017.
 */
class AdaptadorJugadores extends ArrayAdapter<Jugador> {
    AdaptadorJugadores(Context context, Equipo datos) {
        super(context, R.layout.elemento_jugadores, datos.getJugadores());
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View itenViu = convertView;
        if (itenViu == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            itenViu = inflater.inflate(R.layout.elemento_jugadores, null);
        }

        //aqui habian cosas
        TextView nombreJugadoryDorsal = (TextView) itenViu.findViewById(R.id.nombreJugador);
        ImageView imgJugador = (ImageView) itenViu.findViewById(R.id.imgJugador);

        nombreJugadoryDorsal.setText(getItem(position).getNombre() + "  nº" + getItem(position).getNumeroDorsal());
        imgJugador.setImageResource(getItem(position).getImgPerfil());

        return (itenViu);
    }

}
