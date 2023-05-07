/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ServicePelicula {

    Pelicula peli = new Pelicula();
    Scanner read = new Scanner(System.in);
    ArrayList<Pelicula> movie = new ArrayList();

    public void cargarPeliculas() {
        String ask = "s";
        while (ask.equalsIgnoreCase("s")) {

            System.out.println("Ingrese el nombre de la película");
            peli.setTitulo(read.nextLine());
            System.out.println("Ingrese el nombre del director");
            peli.setDirector(read.nextLine());
            System.out.println("Ingrese la duración de la película en minutos");
            peli.setDuracion(read.nextInt());
            Pelicula cinema = new Pelicula(peli.getTitulo(), peli.getDirector(), peli.getDuracion());
            movie.add(cinema);
            System.out.println("¿Desea añadir otra película?(S/N)");
            ask = read.next();
            read.nextLine();
        }

    }

    public void mostrarPeliculas() {
        for (Pelicula cinepolis : movie) {
            System.out.println(cinepolis.toString());
        }
    }

    public void mostrarHora() {
        for (Pelicula cinepolis : movie) {
            if (cinepolis.getDuracion() > 60) {
                System.out.println(cinepolis.toString());
            }
        }
    }

    public void ordDesc() {
        movie.sort(Pelicula.ordenar);
        mostrarPeliculas();
    }

    public void ordAsc() {
        movie.sort(Pelicula.ord);
        mostrarPeliculas();
    }

    public void ordTit() {
        movie.sort(Pelicula.title);
        mostrarPeliculas();
    }

    public void ordDir() {
        movie.sort(Pelicula.direc);
        mostrarPeliculas();
    }

}
