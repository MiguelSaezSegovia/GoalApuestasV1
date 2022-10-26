package com.example1.goalapuestasv1;



public class ClassAjustes {

  String  idioma="SP";
  String Ayuda="HP";
String preguntasF="PF";

    public ClassAjustes(String idioma, String ayuda, String preguntasF) {
        this.idioma = idioma;
        Ayuda = ayuda;
        this.preguntasF = preguntasF;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getAyuda() {
        return Ayuda;
    }

    public void setAyuda(String ayuda) {
        Ayuda = ayuda;
    }

    public String getPreguntasF() {
        return preguntasF;
    }

    public void setPreguntasF(String preguntasF) {
        this.preguntasF = preguntasF;
    }
}

