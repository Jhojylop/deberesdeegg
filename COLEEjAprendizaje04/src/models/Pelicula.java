package models;

import java.time.LocalTime;
import java.util.Comparator;


public class Pelicula implements Comparable<Pelicula> {

    private String tituloPelicula;
    private String directorPelicula;
    private LocalTime duracionPelicula;

    public Pelicula() {
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public void setDirectorPelicula(String directorPelicula) {
        this.directorPelicula = directorPelicula;
    }

    public LocalTime getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(LocalTime duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

    @Override
    public String toString() {
        return "|Título| = " + tituloPelicula + '\'' +
                "| Director | = " + directorPelicula + '\'' +
                "| Duración | = " + duracionPelicula;
    }

    @Override
    public int compareTo(Pelicula pelicula) {
        return this.tituloPelicula.compareTo(pelicula.tituloPelicula);
    }

    public static Comparator<Pelicula> compararDuracion = (pelicula, t1) -> {
        if(pelicula.duracionPelicula.equals(t1.duracionPelicula)) {
            return pelicula.tituloPelicula.compareTo(t1.tituloPelicula);
        } else {
            return pelicula.duracionPelicula.compareTo(t1.duracionPelicula);
        }
    };

    public static Comparator<Pelicula> compararDirector = (pelicula, t1) -> {
        if( pelicula.directorPelicula.equals(t1.directorPelicula)) {
            return pelicula.tituloPelicula.compareTo(t1.tituloPelicula);
        } else {
            return pelicula.directorPelicula.compareTo(t1.directorPelicula);
        }
    };

    public static Comparator<Pelicula> CompararDuracionDescendente = (pelicula, t1) -> {
        if( pelicula.duracionPelicula.equals(t1.duracionPelicula)) {
            return t1.tituloPelicula.compareTo(pelicula.tituloPelicula);
        } else {
            return t1.duracionPelicula.compareTo(pelicula.duracionPelicula);
        }
    };

}