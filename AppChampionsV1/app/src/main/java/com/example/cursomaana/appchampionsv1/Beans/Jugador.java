package com.example.cursomaana.appchampionsv1.Beans;

/**
 * Created by curso mañana on 15/02/2017.
 */

public class Jugador {
    private String nombre;
    private int imgPerfil;
    private String posicion;

    public Jugador(String nombre, int imgPerfil, String posicion) {
        this.nombre = nombre;
        this.imgPerfil = imgPerfil;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(int imgPerfil) {
        this.imgPerfil = imgPerfil;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
