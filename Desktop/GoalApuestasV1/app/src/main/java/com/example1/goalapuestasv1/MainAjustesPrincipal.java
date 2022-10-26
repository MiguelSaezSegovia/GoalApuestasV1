package com.example1.goalapuestasv1;

public class MainAjustesPrincipal  extends ClassAjustes {
    String Cuenta;

    public MainAjustesPrincipal(String idioma, String ayuda, String preguntasF) {
        super(idioma, ayuda, preguntasF);
    }

    public MainAjustesPrincipal(String idioma, String ayuda, String preguntasF, String cuenta) {
        super(idioma, ayuda, preguntasF);
        Cuenta = cuenta;
    }

    public String getCuenta() {
        return Cuenta;
    }

    public void setCuenta(String cuenta) {
        Cuenta = cuenta;
    }
}
