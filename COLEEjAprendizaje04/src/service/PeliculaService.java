package service;

import models.Pelicula;

import java.time.LocalTime;
import java.util.*;
;

public class PeliculaService {
    private final Scanner scan = new Scanner(System.in);
    private final Set<Pelicula> peliculas = new TreeSet<>();

    public Pelicula crearPelicula() {
        Pelicula pelicula = new Pelicula();
        System.out.println("Ingrese el título de la película...");
        pelicula.setTituloPelicula(scan.nextLine().toUpperCase());
        System.out.println("Ingrese el nombre del director de la película...");
        pelicula.setDirectorPelicula(scan.nextLine().toUpperCase());
        System.out.println("Ingrese el tiempo de duracion de la pelicula en el formato HH:MM:SS");
        pelicula.setDuracionPelicula(LocalTime.of(scan.nextInt(), scan.nextInt(), scan.nextInt()));
        scan.nextLine();
        return pelicula;
    }
    public void agregarPelicula(){
        peliculas.add(crearPelicula());
    }

    public void mostrarPeliculas() {
        peliculas.forEach(System.out::println);
    }

    public void mostrarPeliculasMayorUnaHora() {
        LocalTime unaHora = LocalTime.of(1, 0, 0);
        int contadorPeliculas = 0;
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracionPelicula().isAfter(unaHora)) {
                System.out.println(pelicula);
            } else {
                contadorPeliculas++;
            }
        }
        if (contadorPeliculas == peliculas.size()) {
            System.out.println("Ninguna pelicula de la lista dura mas de una hora");
        }
    }

    public void ordenarPorDuracion() {
        Set<Pelicula> ordenDuracion = new TreeSet<>(Pelicula.compararDuracion);
        ordenDuracion.addAll(peliculas);
        ordenDuracion.forEach(System.out::println);
    }

    public void ordenarPorDuracionDescendente() {
        Set<Pelicula> ordenDuracionDescendente = new TreeSet<>(Pelicula.CompararDuracionDescendente);
        ordenDuracionDescendente.addAll(peliculas);
        ordenDuracionDescendente.forEach(System.out::println);
    }

    public void ordenarDirector() {
        Set<Pelicula> ordenDirector = new TreeSet<>(Pelicula.compararDirector);
        ordenDirector.addAll(peliculas);
        ordenDirector.forEach(System.out::println);
    }

}
