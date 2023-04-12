package models;

public class Raices {
    private int a;
    private int b;
    private int c;

    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public double discrminante(){
        double resultado = Math.pow(b,2) - 4 * a * c;
        return resultado;
    }
    public boolean tieneRaices(){
        if (discrminante() > 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean tieneRaiz(){
        if(discrminante() == 0){
            return true;
        }else{
            return false;
        }
    }
    public void obtenerRaices(){
        if(tieneRaices() == false){
            return;
        }
        double solucion1 = (-b + Math.sqrt((Math.pow(b, 2)) - (4 * a * c)))/(2 * a);
        double solucion2 = (-b - Math.sqrt((Math.pow(b, 2)) - (4 * a * c)))/(2 * a);
        System.out.println("la primera solucion es: "+solucion1);
        System.out.println("la segunda solucion es: "+solucion2);
    }
    public void obtenerRaiz(){
        if (tieneRaiz() == false){
            return;
        }
        double solucion1 = (-b + Math.sqrt((Math.pow(b, 2)) - (4 * a * c)))/(2 * a);
        System.out.println("la unica solucion es: " + solucion1);
    }
}
