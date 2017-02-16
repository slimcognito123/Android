package com.example.cursomaana.appchampionsv1.Model;

import android.util.Log;

import com.example.cursomaana.appchampionsv1.Beans.Equipo;
import com.example.cursomaana.appchampionsv1.Beans.Estadio;
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

        Estadio estadioParis=new Estadio("Parc de princes", R.drawable.img_estadio_psg,"https://es.wikipedia.org/wiki/Parc_des_Princes");
        Estadio estadioBarsa = new Estadio("Camp nou",R.drawable.img_estadio_barcelona,"https://es.wikipedia.org/wiki/Camp_Nou");

        Equipo paris = new Equipo("Paris", R.drawable.img_paris, unaiEmeri, "sdfhjfhjsnd an sidiosioafionsvd nlvjnlsa lknls dnjvasn",estadioParis,"http://www.psg.fr/");
        Equipo barcelona = new Equipo("Barcelona", R.drawable.img_barcelona, luisEnrique, "despues de una victoria muy reñida contra el atletico de madrid, llegan a octavos con mas fuerzas que nunca", estadioBarsa, "https://www.fcbarcelona.com/");

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

        Estadio estadioBenfica=new Estadio("Estádio da Luz", R.drawable.img_estadio_benfica,"https://es.wikipedia.org/wiki/Est%C3%A1dio_da_Luz");
        Estadio estadioDormunt = new Estadio("Signal Iduna Park",R.drawable.img_estadio_dormunt,"https://es.wikipedia.org/wiki/Signal_Iduna_Park");

        Equipo benfica = new Equipo("Benfica", R.drawable.img_benfica, ruiVitoria, "los portugueses quieren ganar y blablabla",estadioBenfica , "http://www.slbenfica.pt");
        Equipo dormunt = new Equipo("Dormunt", R.drawable.img_dormunt, thomasTuchel, "wqwertyuiop`wertyuaskdn aslnkankl asnldknsa (esta en aleman)",estadioDormunt , "http://www.bvb.de/");

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

        Estadio estadioBayern=new Estadio("Allianz arena", R.drawable.img_estadio_bayern,"https://es.wikipedia.org/wiki/Allianz_Arena");
        Estadio estadioArsenal = new Estadio("Emirates stadium", R.drawable.img_estadio_arsenal,"https://es.wikipedia.org/wiki/Emirates_Stadium");

        Equipo bayern = new Equipo("Bayern", R.drawable.img_bayern, carloAnchelotti, "acaban de salir de comprar aspirinas para estar en formma",estadioBayern, "https://fcbayern.com/");
        Equipo arsenal = new Equipo("Arsenal", R.drawable.img_arsenal, arseneWenger, "eisteoe toeso saof eoa soeo as (totalmente claro verdad?)",estadioArsenal, "http://www.arsenal.com/");

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

        Estadio estadioMadrid=new Estadio("Santiago Bernabeu", R.drawable.img_estadio_madrid,"https://es.wikipedia.org/wiki/Estadio_Santiago_Bernab%C3%A9u");
        Estadio estadioNapoles = new Estadio("Sao Paolo", R.drawable.img_estadio_napoli,"https://es.wikipedia.org/wiki/Estadio_San_Paolo");

        Equipo madrid = new Equipo("Real Madrid", R.drawable.img_madrid, zidane, "poco que decir sobre el conjunto merengue",estadioMadrid , "http://www.realmadrid.com/");
        Equipo napoles = new Equipo("napoles", R.drawable.img_napoli, sarri, "qwertyuiopàsdfghjklzxcvbnm (del latin 'querer ganar a toda costa')",estadioNapoles, "http://www.sscnapoli.it/");

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
