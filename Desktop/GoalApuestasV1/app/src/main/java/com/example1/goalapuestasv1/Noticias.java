package com.example1.goalapuestasv1;

public class Noticias {
    String título;
    String contenido;
    String fecha;
    String medio;
public Noticias(){}
    public Noticias(String título, String contenido, String fecha, String medio) {
        this.título = título;
        this.contenido = contenido;
        this.fecha = fecha;
        this.medio = medio;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }
}
