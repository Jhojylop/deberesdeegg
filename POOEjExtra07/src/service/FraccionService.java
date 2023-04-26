package service;

import models.Fraccion;

import java.util.Scanner;

public class FraccionService {
    Fraccion fraccion = new Fraccion();
    private Scanner scan = new Scanner(System.in);
    int resultadoDenominador;
    int resultadoNumerador;
    public void sumarFracion(){
        if (fraccion.getDenominador() == fraccion.getDenominador2()){
            resultadoDenominador = fraccion.getDenominador();
            resultadoNumerador = fraccion.getNumerador() + fraccion.getNumerador2();
        }else {
            resultadoDenominador = fraccion.getDenominador() * fraccion.getDenominador2();
            resultadoNumerador = ((resultadoDenominador / fraccion.getDenominador()) * fraccion.getNumerador())
                                + (resultadoDenominador / fraccion.getDenominador2() * fraccion. getNumerador2());
        }

        System.out.println("El resultado de la suma es: "+ resultadoNumerador+ "/" +resultadoDenominador);
    }

    public void restarFracion(){
        if (fraccion.getDenominador() == fraccion.getDenominador2()){
            resultadoDenominador = fraccion.getDenominador();
            resultadoNumerador = fraccion.getNumerador() - fraccion.getNumerador2();
        }else {
            resultadoDenominador = fraccion.getDenominador() * fraccion.getDenominador2();
            resultadoNumerador = ((resultadoDenominador / fraccion.getDenominador()) * fraccion.getNumerador())
                                - (resultadoDenominador / fraccion.getDenominador2() * fraccion. getNumerador2());
        }

        System.out.println("El resultado de la resta es: "+resultadoNumerador+ "/" +resultadoDenominador);
    }
    public void multiplicarFraccion(){
        resultadoNumerador = fraccion.getNumerador() * fraccion.getNumerador2();
        resultadoDenominador = fraccion.getDenominador() * fraccion.getDenominador2();
        System.out.println("El resultado de la multiplicación es: "+resultadoNumerador+ "/" +resultadoDenominador);
    }
    public void dividirFraccion(){
        resultadoNumerador = fraccion.getDenominador() * fraccion.getNumerador2();
        resultadoDenominador = fraccion.getNumerador() * fraccion.getDenominador2();
        System.out.println("El resultado de la división es: "+resultadoNumerador+ "/" +resultadoDenominador);
    }
    public void ingresarDatos(){
        System.out.println("Ingrese el numerador 1: ");
        fraccion.setNumerador(scan.nextInt());
        System.out.println("Ingrese el denominador 1: ");
        fraccion.setDenominador(scan.nextInt());
        System.out.println("Ingrese el numerador 2: ");
        fraccion.setNumerador2(scan.nextInt());
        System.out.println("Ingrese el denominador 2: ");
        fraccion.setDenominador2(scan.nextInt());
    }

}
