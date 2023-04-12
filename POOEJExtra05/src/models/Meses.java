package models;

import java.util.Scanner;

public class Meses {
    private String [] mesesAnio = new String[]{"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesEscondido = mesesAnio[(int) (Math.random() * 12)];

    public Meses() {
    }

    public Meses(String[] mesesAnio, String mesEscondido) {
        this.mesesAnio = mesesAnio;
        this.mesEscondido = mesEscondido;
    }

    public String[] getMesesAnio() {
        return mesesAnio;
    }

    public void setMesesAnio(String[] mesesAnio) {
        this.mesesAnio = mesesAnio;
    }

    public String getMesEscondido() {
        return mesEscondido;
    }

    public void setMesEscondido(String mesEscondido) {
        this.mesEscondido = mesEscondido;
    }
    public boolean reesultado(String mesBuscado){
        boolean resultado = false;
        if(this.mesEscondido.equals(mesBuscado)){
            return !resultado;
        }
        return resultado;
    }
}
