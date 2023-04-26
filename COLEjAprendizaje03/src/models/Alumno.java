package models;
import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List <Double> notas = new ArrayList<>();

    public Alumno() {
    }

    public Alumno(String nombre, List<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno: " +
                "nombre='" + nombre + '\'' +
                " sus notas=" + notas ;
    }
}
