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
    private Integer imagenEstadio;
    private String nombreEstadio;
    private ArrayList<Jugador> jugadores;

    public Equipo() {

    }

    public Equipo(String nombre, Integer escudo, Jugador entrenador, String estado, Integer imagenEstadio, String nombreEstadio) {
        this.nombre = nombre;
        this.escudo = escudo;
        this.entrenador = entrenador;
        this.estado = estado;
        this.imagenEstadio = imagenEstadio;
        this.nombreEstadio = nombreEstadio;
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

    public Integer getImagenEstadio() {
        return imagenEstadio;
    }

    public void setImagenEstadio(Integer imagenEstadio) {
        this.imagenEstadio = imagenEstadio;
    }

    public String getNombreEstadio() {
        return nombreEstadio;
    }

    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
