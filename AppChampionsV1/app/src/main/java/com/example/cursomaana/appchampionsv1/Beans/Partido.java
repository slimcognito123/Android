package com.example.cursomaana.appchampionsv1.Beans;

import com.example.cursomaana.appchampionsv1.Beans.Equipo;

/**
 * Created by curso mañana on 14/02/2017.
 */

public class Partido {
    private int id;
    private String fecha;
    private String hora;
    private Equipo local;
    private Equipo visitante;

    public Partido() {

    }

    public Partido(int id, String fecha, String hora, Equipo local, Equipo visitante) {
        this.id=id;
        this.fecha = fecha;
        this.hora = hora;
        this.local = local;
        this.visitante = visitante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }
}
