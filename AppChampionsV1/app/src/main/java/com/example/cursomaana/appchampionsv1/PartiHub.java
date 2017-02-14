package com.example.cursomaana.appchampionsv1;

import java.util.ArrayList;

/**
 * Created by curso mañana on 14/02/2017.
 */

public class PartiHub {
    private ArrayList<Partido> listaPartido;

    public PartiHub() {
        listaPartido = new ArrayList<>();
        listaPartido.add(new Partido("14/02","20:45",new Equipo("Paris",R.drawable.img_paris,"Unai Emeri","sdfhjfhjsnd an sidiosioafionsvd nlvjnlsa lknls dnjvasn",R.drawable.img_estadio_psg,"Parc de princes"),new Equipo("Barcelona",R.drawable.img_barcelona,"Luis Enrique","despues de una victoria muy reñida contra el atletico de madrid, llegan a octavos con mas fuerzas que nunca",R.drawable.img_estadio_barcelona,"Camp Nou")));
    }

    public PartiHub(ArrayList<Partido> listaPartido) {
        this.listaPartido = listaPartido;
    }

    public  ArrayList<Partido> todosLosPartidos(){
        return listaPartido;
    }
}
