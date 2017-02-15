package com.example.cursomaana.appchampionsv1.Model;

import android.util.Log;

import com.example.cursomaana.appchampionsv1.Beans.Equipo;
import com.example.cursomaana.appchampionsv1.Beans.Partido;
import com.example.cursomaana.appchampionsv1.R;

import java.util.ArrayList;

/**
 * Created by curso mañana on 14/02/2017.
 */

public class PartiHub {
    private ArrayList<Partido> listaPartido;

    public PartiHub() {
        listaPartido = new ArrayList<>();
        Equipo paris = new Equipo("Paris", R.drawable.img_paris, "Unai Emeri", "sdfhjfhjsnd an sidiosioafionsvd nlvjnlsa lknls dnjvasn", R.drawable.img_estadio_psg, "Parc de princes");
        Equipo barcelona = new Equipo("Barcelona", R.drawable.img_barcelona, "Luis Enrique", "despues de una victoria muy reñida contra el atletico de madrid, llegan a octavos con mas fuerzas que nunca", R.drawable.img_estadio_barcelona, "Camp Nou");
        listaPartido.add(new Partido(1,"14/02","20:45", paris, barcelona));

        Equipo benfica = new Equipo("Benfica", R.drawable.img_benfica, "Rui Vitória", "los portugueses quieren ganar y blablabla", R.drawable.img_estadio_benfica, "Estádio da Luz");
        Equipo dormunt = new Equipo("Dormunt", R.drawable.img_dormunt, "Thomas Tuchel", "wqwertyuiop`wertyuaskdn aslnkankl asnldknsa (esta en aleman)", R.drawable.img_estadio_dormunt, "Signal Iduna Park");
        listaPartido.add(new Partido(2,"14/02","20:45", benfica, dormunt));

        Equipo bayern = new Equipo("Bayern", R.drawable.img_bayern, "Carlo Anchelotti", "acaban de salir de comprar aspirinas para estar en formma", R.drawable.img_estadio_bayern, "Allianz arena");
        Equipo arsenal = new Equipo("Arsenal", R.drawable.img_arsenal, "Arsène Wenger", "eisteoe toeso saof eoa soeo as (totalmente claro verdad?)", R.drawable.img_estadio_arsenal, "Emirates stadium");
        listaPartido.add(new Partido(3,"15/02","20:45", bayern, arsenal));

        Equipo madrid = new Equipo("Madrid", R.drawable.img_madrid, "Zinedine Zidane", "poco que decir sobre el conjunto merengue", R.drawable.img_estadio_madrid, "Santiago Bernabeu");
        Equipo napoles = new Equipo("napoles", R.drawable.img_napoli, "Maurizio Sarri", "qwertyuiopàsdfghjklzxcvbnm (del latin 'querer ganar a toda costa')", R.drawable.img_estadio_napoli, "Sao Paolo");
        listaPartido.add(new Partido(4,"15/02","20:45", madrid, napoles));
    }

    public PartiHub(ArrayList<Partido> listaPartido) {
        this.listaPartido = listaPartido;
    }

    public  ArrayList<Partido> todosLosPartidos(){
        return listaPartido;
    }

    public Partido buscarPartido(String nombreLocal, String fecha, String hora){
        Partido partidoADevolver=null;
        for (Partido partido : listaPartido) {
            Log.i("pene", fecha);
            if(nombreLocal.equals(partido.getLocal().getNombre()) && fecha.equals(partido.getFecha()) && hora.equals(partido.getHora()) ){
                partidoADevolver=partido;
                Log.i("entraaaa",partidoADevolver.getLocal().getNombre());
                return partido;
            }
        }
        return partidoADevolver;
    }

    public Partido buscarPartido(int id) {
        for (Partido partido : listaPartido) {
            Log.i("pene", String.valueOf(id));
            if(id==partido.getId()) return partido;
        }
        return null;
    }
}
