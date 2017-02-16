package com.example.cursomaana.appchampionsv1.Beans;

import java.util.ArrayList;

/**
 * Created by curso mañana on 14/02/2017.
 */

public class Equipo {
    private String nombre;
    private Integer escudo;
    private Jugador entrenador;
    private String estado;
    private Estadio estadio;
    private String paginaWeb;
    private ArrayList<Jugador> jugadores;

    public Equipo() {

    }

    public Equipo(String nombre, Integer escudo, Jugador entrenador, String estado, Estadio estadio, String paginaWeb) {
        this.nombre = nombre;
        this.escudo = escudo;
        this.entrenador = entrenador;
        this.estado = estado;
        this.estadio = estadio;
        this.paginaWeb = paginaWeb;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEscudo() {
        return escudo;
    }

    public void setEscudo(Integer escudo) {
        this.escudo = escudo;
    }

    public Jugador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Jugador entrenador) {
        this.entrenador = entrenador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
