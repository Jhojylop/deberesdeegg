package models;

public class Juego {
    private String palabraIngresada;
    private int vidas;
    private int encontradas = 0;
    private String[] palabraLlenada;
    private String[] vectorPantalla;

    public Juego() {
    }

    public Juego(String palabraIngresada, int vidas, int encontradas, String[] palabraLlenada, String[] vectorPantalla) {
        this.palabraIngresada = palabraIngresada;
        this.vidas = vidas;
        this.encontradas = encontradas;
        this.palabraLlenada = palabraLlenada;
        this.vectorPantalla = vectorPantalla;
    }

    public String getPalabraIngresada() {
        return palabraIngresada;
    }

    public void setPalabraIngresada(String palabraIngresada) {
        this.palabraIngresada = palabraIngresada;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public String[] getPalabraLlenada() {
        return palabraLlenada;
    }

    public void setPalabraLlenada(String[] palabraLlenada) {
        this.palabraLlenada = palabraLlenada;
    }

    public String[] getVectorPantalla() {
        return vectorPantalla;
    }

    public void setVectorPantalla(String[] vectorPantalla) {
        this.vectorPantalla = vectorPantalla;
    }

    public void rellenarPalabra() {
        this.palabraLlenada = new String[palabraIngresada.length()];
        for (int i = 0; i < this.palabraIngresada.length(); i++) {
            this.palabraLlenada[i] = this.palabraIngresada.substring(i, i + 1);
        }
    }

    public void mostrarLongitudPalabra() {
        System.out.println("la palabra escondida tiene : " + palabraIngresada.length() + " letras...");
    }

    public int restarVidas() {
        return vidas--;
    }

    public void vectorPantalla() {
        this.vectorPantalla = new String[this.palabraIngresada.length()];
        for (int i = 0; i < this.palabraIngresada.length(); i++) {
            this.vectorPantalla[i] = "_";
        }
    }

    public void contadorEncontradas(int contadorRepetidas) {
        this.encontradas = this.encontradas + contadorRepetidas;
    }
}
