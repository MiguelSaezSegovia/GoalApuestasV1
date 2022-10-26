package com.example1.goalapuestasv1;

import android.widget.ImageView;

public class Partido_directo {
    ImageView local;
    ImageView vistante;
    int fecha_incio;
    int partes;
    int aniadio;
    int gol;
    public Partido_directo(ImageView local,ImageView visitante,int fecha_incio){
        this.local=local;
        this.vistante=visitante;
        this.fecha_incio=fecha_incio;
    }

    public Partido_directo(ImageView local,ImageView visitante, int partes,int aniadido, int gol){
        this.local=local;
        this.vistante=visitante;
        this.partes=partes;
        this.aniadio=aniadido;
        this.gol=gol;
    }

    public ImageView getLocal() {
        return local;
    }

    public void setLocal(ImageView local) {
        this.local = local;
    }

    public int getFecha_incio() {
        return fecha_incio;
    }

    public void setFecha_incio(int fecha_incio) {
        this.fecha_incio = fecha_incio;
    }

    public int getPartes() {
        return partes;
    }

    public void setPartes(int partes) {
        this.partes = partes;
    }

    public int getAniadio() {
        return aniadio;
    }

    public void setAniadio(int aniadio) {
        this.aniadio = aniadio;
    }

    public int getGol() {
        return gol;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }
}
