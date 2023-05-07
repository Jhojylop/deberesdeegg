package models;

import java.util.Collections;
import java.util.Comparator;

public class Perro  implements Comparable<Perro>{
    private String nombre;
    private int edad;

    public Perro() {
    }

    public Perro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
    public static Comparator<Perro> compararEdad = new Comparator<Perro>(){

        @Override
        public int compare(Perro perro, Perro t1) {
            return Integer.compare(perro.getEdad(), t1.getEdad());
        }
    };
    public static Comparator<Perro> compararNombre = new Comparator<Perro>() {
        @Override
        public int compare(Perro perro, Perro t1) {
            return perro.getNombre().compareTo(t1.getNombre());
        }
    };
    public static Comparator<Perro> compararEdadDescendente = Collections.reverseOrder(compararEdad);

    @Override
    public int compareTo(Perro perro) {
        return Integer.compare(this.edad, perro.edad);
    }

}
