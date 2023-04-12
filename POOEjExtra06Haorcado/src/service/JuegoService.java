package service;

import models.Juego;

import java.util.Arrays;
import java.util.Scanner;

public class JuegoService {
    private Scanner scan = new Scanner(System.in);
    Juego juego = new Juego();

    private void cargarDatosJuego() {
        System.out.println("Ingrese la palabra que se usará para jugar...");
        juego.setPalabraIngresada(scan.next().toLowerCase());
        juego.rellenarPalabra();
        juego.vectorPantalla();
        System.out.println("Ingrese las vidas que desea para jugar...");
        juego.setVidas(scan.nextInt());
        juego.mostrarLongitudPalabra();
        System.out.println("El JUEGO SE HA INICIALIZADO CON: " + juego.getVidas() + " vidas...");
    }

    private void buscarLetra(String letra) {
        String letra2 = letra.substring(0, 1);
        int contadorRepetidas = 0;
        for (int i = 0; i < juego.getPalabraLlenada().length; i++) {
            if (juego.getPalabraLlenada()[i].equals(letra2)) {
                juego.getPalabraLlenada()[i] = "_";
                juego.getVectorPantalla()[i] = letra2;
                contadorRepetidas++;
            }
        }
        if (contadorRepetidas > 0) {
            System.out.println("La letra ingresada si pertenece a la palabra y se encuentra: " + contadorRepetidas + " veces repetida en la palabra escondida...");
            System.out.println("A continuacion vera como va la palabra...");
            System.out.println(Arrays.toString(juego.getVectorPantalla()));
        } else {
            System.out.println("La letra ingresada no pertenece a la palabra...");
            System.out.println("Usted ha perdido un vida...");
            System.out.println("A continuacion vera como va la palabra...");
            System.out.println(Arrays.toString(juego.getVectorPantalla()));
            juego.restarVidas();
        }
        //pilas con el uso del get.encontradas es diferente a las veces q se repite la letra cuando se la lee.
        juego.contadorEncontradas(contadorRepetidas);
    }

    public void mostrarIntentos() {

        System.out.println("Usted tiene encontradas actualmente : " + juego.getEncontradas() + " letras de las: " + juego.getPalabraIngresada().length() + " que tiene la palabra...");
        if (juego.getEncontradas() == juego.getPalabraIngresada().length()) {
            System.out.println("ha llenado todas las letras de la palabra FELICIDADES...");
            juego.setEncontradas(0);
            juego.setVidas(0);
        } else if (juego.getEncontradas() >= 0 || juego.getEncontradas() < juego.getPalabraIngresada().length()) {
            System.out.println("Aun quedan " + (juego.getPalabraIngresada().length() - juego.getEncontradas()) + " letras por encontrar...");
            System.out.println("le quedan aun: " + juego.getVidas() + " vidas...");
        }

    }

    public void jugar() {
        cargarDatosJuego();
        do {
            System.out.println("=================================================");
            System.out.println("Ingrese una letra para buscar");
            String letra = scan.next();
            buscarLetra(letra);
            mostrarIntentos();
        } while (juego.getVidas() != 0);
    }

}
