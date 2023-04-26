package models;

public class Clave {
    private String claveIngresada;
    private String claveGenerada;

    public Clave() {
    }

    public Clave(String claveIngresada, String claveGenerada) {
        this.claveIngresada = claveIngresada;
        this.claveGenerada = claveGenerada;
    }

    public String getClaveIngresada() {
        return claveIngresada;
    }

    public void setClaveIngresada(String claveIngresada) {
        this.claveIngresada = claveIngresada;
    }

    public String getClaveGenerada() {
        return claveGenerada;
    }

    public void setClaveGenerada(String claveGenerada) {
        this.claveGenerada = claveGenerada;
    }

}
