package service;

import models.Raices;

import java.util.Scanner;

public class RaicesService {
    private Scanner scan = new Scanner(System.in);
    Raices raices = new Raices();
    public void ingresarEcuacion(){
        System.out.println("Ingrese el valor de a: ");
        raices.setA(scan.nextInt());
        System.out.println("Ingrese el valor de b: ");
        raices.setB(scan.nextInt());
        System.out.println("Ingrese el valor de c: ");
        raices.setC(scan.nextInt());
    }
    public void calcularResultado(){
        if(raices.tieneRaices() == true || raices.tieneRaiz() == true){
            if (raices.tieneRaices()){
                System.out.println("La ecuacion tiene dos soluciones...");
                System.out.println(" Estas son sus dos soluciones: ");
                raices.obtenerRaices();
            }else if(raices.tieneRaiz()){
                System.out.println("la ecuacion tiene una solucion...");
                System.out.println("Esta es la solucion: ");
                raices.obtenerRaiz();
            }

        }else{
            System.out.println("no hay soluciones en los reales para la ecuacion ingresada...");
        }
    }
}
