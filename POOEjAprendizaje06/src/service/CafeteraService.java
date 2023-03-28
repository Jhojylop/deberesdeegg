package service;

import models.Cafetera;

import java.sql.SQLOutput;

public class CafeteraService {
    private Cafetera cafetera;

    public void crearCafetera() {
        this.cafetera = new Cafetera();
    }

    public void llenarCafetera() {
        cafetera.setCapacidadActual(cafetera.getCapacidadMaxima());
        System.out.println("la cafetera ha sido llenada tiene una cpacidad actual de: " + cafetera.getCapacidadActual() + "cm3");
    }

    public void servirTaza(int cantidadTaza) {
        if (cantidadTaza < cafetera.getCapacidadActual()) {
            System.out.println("la taza ha sido llenada con el valor ingresado de: " + cantidadTaza);
            cafetera.setCapacidadActual(cafetera.getCapacidadActual() - cantidadTaza);
        } else {
            System.out.println("la cantidad ingresada de: " + cantidadTaza + " es superior a la cantidad actual disponible:");
            System.out.println("su taza ha sido llena con la cantidad de: " + cafetera.getCapacidadActual());
            cafetera.setCapacidadActual(0);
        }

    }

    public void vaciarCafe() {
        cafetera.setCapacidadActual(0);
        System.out.println("la cafetera ha sido vaciada...");
    }

    public void agregarCafe(int agregoCafe) {

        if (agregoCafe < (cafetera.getCapacidadMaxima() - cafetera.getCapacidadActual())) {
            System.out.println("Se agregado al cantidad indicada de: " + agregoCafe);
            System.out.println("Cantidad anterior: " + cafetera.getCapacidadActual());
            cafetera.setCapacidadActual(cafetera.getCapacidadActual() + agregoCafe);
            System.out.println("cantidad actual: " + cafetera.getCapacidadActual());

        } else {

            System.out.println("la cantidad ingresada supera el espacio restante que queda libre en la cafetera");
            System.out.println("Capacidad disponible para llenar:" + (cafetera.getCapacidadMaxima() - cafetera.getCapacidadActual()));
        }
    }
}
