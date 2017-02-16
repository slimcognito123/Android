package com.example.cursomaana.appchampionsv1.Beans;

/**
 * Created by curso mañana on 16/02/2017.
 */

public class Estadio {
    private String nombreEstadio;
    private int imagenEstadio;
    private String paginaWeb;

    public Estadio() {
    }

    public Estadio(String nombreEstadio, int imagenEstadio, String paginaWeb) {
        this.nombreEstadio = nombreEstadio;
        this.imagenEstadio = imagenEstadio;
        this.paginaWeb = paginaWeb;
    }

    public String getNombreEstadio() {
        return nombreEstadio;
    }

    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

    public int getImagenEstadio() {
        return imagenEstadio;
    }

    public void setImagenEstadio(int imagenEstadio) {
        this.imagenEstadio = imagenEstadio;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }
}
