package service;

import models.Fraccion;

import java.util.Scanner;

public class MenuService {
    FraccionService fraccionService = new FraccionService();
    private Scanner scan = new Scanner(System.in);
    public void operar (){
        fraccionService.ingresarDatos();
        int opcion;
        do {
            opcion = menu();
            switch (opcion){
                case 1:
                    fraccionService.sumarFracion();
                    break;
                case 2:
                    fraccionService.restarFracion();
                    break;
                case 3:
                    fraccionService.multiplicarFraccion();
                    break;
                case 4:
                    fraccionService.dividirFraccion();
                    break;
                case 5:
                    System.out.println("Adios guap@...");
                    break;
                default:
                    System.out.println("Opción incorrecta...");
                    break;
            }

        }while (opcion != 5);

    }
    public int menu(){
        System.out.println("1. SUMAR...");
        System.out.println("2. RESTAR...");
        System.out.println("3. MULTIPLICAR...");
        System.out.println("4. DIVIDIR...");
        System.out.println("5. SALIR...");
        System.out.println("INGRESE UNA OPCIÓN...");
        return scan.nextInt();
    }
}
