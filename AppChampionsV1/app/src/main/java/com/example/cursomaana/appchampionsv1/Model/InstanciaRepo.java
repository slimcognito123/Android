package com.example.cursomaana.appchampionsv1.Model;

/**
 * Created by curso mañana on 16/02/2017.
 */

public class InstanciaRepo {
    private static PartiHub repo;
    public InstanciaRepo() {
        getInstance();
    }

    public static PartiHub getInstance(){
        if (repo==null){
            repo=new PartiHub();
        }
        return repo;
    }
}
