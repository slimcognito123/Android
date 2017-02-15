package com.example.cursomaana.appchampionsv1.Model;

import android.util.Log;

import com.example.cursomaana.appchampionsv1.Beans.Equipo;
import com.example.cursomaana.appchampionsv1.Beans.Jugador;
import com.example.cursomaana.appchampionsv1.Beans.Partido;
import com.example.cursomaana.appchampionsv1.R;

import java.util.ArrayList;

/**
 * Created by curso mañana on 14/02/2017.
 */

public class PartiHub {
    private ArrayList<Partido> listaPartido;
    private ArrayList<Equipo> listaEquipos;
    private ArrayList<Jugador> listaEntrenadores;

    public PartiHub() {
        listaPartido = new ArrayList<>();
        listaEquipos = new ArrayList<>();
        listaEntrenadores= new ArrayList<>();

        Jugador unaiEmeri = new Jugador("Unai Emeri", R.drawable.img_unai_emeri);
        unaiEmeri.setPosicion("Entrenador");
        Jugador luisEnrique = new Jugador("Luis Enrique", R.drawable.img_unai_emeri);
        luisEnrique.setPosicion("Entrenador");

        listaEntrenadores.add(unaiEmeri);
        listaEntrenadores.add(luisEnrique);

        Equipo paris = new Equipo("Paris", R.drawable.img_paris, unaiEmeri, "sdfhjfhjsnd an sidiosioafionsvd nlvjnlsa lknls dnjvasn", R.drawable.img_estadio_psg, "Parc de princes");
        Equipo barcelona = new Equipo("Barcelona", R.drawable.img_barcelona, luisEnrique, "despues de una victoria muy reñida contra el atletico de madrid, llegan a octavos con mas fuerzas que nunca", R.drawable.img_estadio_barcelona, "Camp Nou");

        introducirJugadores(paris);
        introducirJugadores(barcelona);


        listaPartido.add(new Partido(1, "14/02", "20:45", paris, barcelona));
        listaEquipos.add(paris);
        listaEquipos.add(barcelona);

        Jugador ruiVitoria = new Jugador("Rui Vitória", R.drawable.img_unai_emeri);
        ruiVitoria.setPosicion("Entrenador");
        Jugador thomasTuchel = new Jugador("Thomas Tuchel", R.drawable.img_unai_emeri);
        thomasTuchel.setPosicion("Entrenador");

        listaEntrenadores.add(ruiVitoria);
        listaEntrenadores.add(thomasTuchel);

        Equipo benfica = new Equipo("Benfica", R.drawable.img_benfica, ruiVitoria, "los portugueses quieren ganar y blablabla", R.drawable.img_estadio_benfica, "Estádio da Luz");
        Equipo dormunt = new Equipo("Dormunt", R.drawable.img_dormunt, thomasTuchel, "wqwertyuiop`wertyuaskdn aslnkankl asnldknsa (esta en aleman)", R.drawable.img_estadio_dormunt, "Signal Iduna Park");

        introducirJugadores(benfica);
        introducirJugadores(dormunt);

        listaPartido.add(new Partido(2, "14/02", "20:45", benfica, dormunt));
        listaEquipos.add(benfica);
        listaEquipos.add(dormunt);

        Jugador carloAnchelotti = new Jugador("Carlo Anchelotti", R.drawable.img_unai_emeri);
        carloAnchelotti.setPosicion("Entrenador");
        Jugador arseneWenger = new Jugador("Arsène Wenger", R.drawable.img_unai_emeri);
        arseneWenger.setPosicion("Entrenador");

        listaEntrenadores.add(carloAnchelotti);
        listaEntrenadores.add(arseneWenger);

        Equipo bayern = new Equipo("Bayern", R.drawable.img_bayern, carloAnchelotti, "acaban de salir de comprar aspirinas para estar en formma", R.drawable.img_estadio_bayern, "Allianz arena");
        Equipo arsenal = new Equipo("Arsenal", R.drawable.img_arsenal, arseneWenger, "eisteoe toeso saof eoa soeo as (totalmente claro verdad?)", R.drawable.img_estadio_arsenal, "Emirates stadium");

        introducirJugadores(bayern);
        introducirJugadores(arsenal);

        listaPartido.add(new Partido(3, "15/02", "20:45", bayern, arsenal));
        listaEquipos.add(bayern);
        listaEquipos.add(arsenal);

        Jugador zidane = new Jugador("Zinedine Zidane", R.drawable.img_unai_emeri);
        zidane.setPosicion("Entrenador");
        Jugador sarri = new Jugador("Maurizio Sarri", R.drawable.img_unai_emeri);
        sarri.setPosicion("Entrenador");
        listaEntrenadores.add(zidane);
        listaEntrenadores.add(sarri);
        Equipo madrid = new Equipo("Real Madrid", R.drawable.img_madrid, zidane, "poco que decir sobre el conjunto merengue", R.drawable.img_estadio_madrid, "Santiago Bernabeu");
        Equipo napoles = new Equipo("napoles", R.drawable.img_napoli, sarri, "qwertyuiopàsdfghjklzxcvbnm (del latin 'querer ganar a toda costa')", R.drawable.img_estadio_napoli, "Sao Paolo");

        introducirJugadores(madrid);
        introducirJugadores(napoles);

        listaPartido.add(new Partido(4, "15/02", "20:45", madrid, napoles));
        listaEquipos.add(madrid);
        listaEquipos.add(napoles);
    }

    private void introducirJugadores(Equipo equipo) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador("Trapp kevin", R.drawable.img_jugadorpsg7, "" + 1, "portero"));
        jugadores.add(new Jugador("Kimpembe Presnel", R.drawable.img_jugadorpsg1, "" + 3, "defensa"));
        jugadores.add(new Jugador("Marquinhos", R.drawable.img_jugadorpsg2, "" + 5, "defensa"));
        jugadores.add(new Jugador("Meuniel Thomas", R.drawable.img_jugadorpsg3, "" + 12, "defensa"));
        jugadores.add(new Jugador("Kurzawa Layvin", R.drawable.img_jugadorpsg11, "" + 20, "defensa"));

        jugadores.add(new Jugador("Verratti Marco", R.drawable.img_jugadorpsg4, "" + 6, "centro"));
        jugadores.add(new Jugador("Lucas", R.drawable.img_jugadorpsg5, "" + 7 , "centro"));
        jugadores.add(new Jugador("Di Maria", R.drawable.img_jugadorpsg6, "" + 11, "centro"));
        jugadores.add(new Jugador("Motta Thiago", R.drawable.img_jugadorpsg8, "" + 8, "centro"));
        jugadores.add(new Jugador("Rabiot Adrien", R.drawable.img_jugadorpsg9, "" + 25, "centro"));

        jugadores.add(new Jugador("Cavani Edinson", R.drawable.img_jugadorpsg9, "" + 9, "delantero"));
        equipo.setJugadores(jugadores);
    }

    public PartiHub(ArrayList<Partido> listaPartido) {
        this.listaPartido = listaPartido;
    }

    public ArrayList<Partido> todosLosPartidos() {
        return listaPartido;
    }

//    public Partido buscarPartido(String nombreLocal, String fecha, String hora) {
//        Partido partidoADevolver;
//        for (Partido partido : listaPartido) {
//            Log.i("pene", fecha);
//            if (nombreLocal.equals(partido.getLocal().getNombre()) && fecha.equals(partido.getFecha()) && hora.equals(partido.getHora())) {
//                partidoADevolver = partido;
//                Log.i("entraaaa", partidoADevolver.getLocal().getNombre());
//                return partido;
//            }
//        }
//        return null;
//    }

    public Partido buscarPartido(int id) {
        for (Partido partido : listaPartido) {
            Log.i("pene", String.valueOf(id));
            if (id == partido.getId()) return partido;
        }
        return null;
    }

    public Equipo findTeam(String equipo) {
        for (Equipo equipaso : listaEquipos) {
            if (equipaso.getNombre().equals(equipo)) return equipaso;
        }
        return null;
    }
    public Jugador findPlayer(String equipo, String jugador){
        Equipo equipaso=findTeam(equipo);
        for (Jugador jugadorazo : equipaso.getJugadores()) {
            if (jugadorazo.getNombre().equals(jugador)) return jugadorazo;
        }
        return null;
    }

    public Jugador findCoach(String equipo) {
        Equipo team = findTeam(equipo);
        return team.getEntrenador();
    }
}
