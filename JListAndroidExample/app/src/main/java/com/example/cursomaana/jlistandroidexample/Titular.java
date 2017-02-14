package com.example.cursomaana.jlistandroidexample;

/**
 * Created by curso mañana on 14/02/2017.
 */
public class Titular {
    private String titular;
    private String subtitulo;

    public Titular(String titular, String subtitulo) {
        this.titular = titular;
        this.subtitulo = subtitulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
