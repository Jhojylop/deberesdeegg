package service;

import java.util.Scanner;

public class MenuService {
    private Scanner scan = new Scanner(System.in);
    JuegoService juegoService = new JuegoService();

    public void iniciarJuego() {

        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    juegoService.jugar();
                    break;
                case 2:
                    System.out.println("Adios gracias por jugar...");
                    break;
                default:
                    System.out.println("opcion incorrecta...");
                    break;
            }
        } while (opcion != 2);
    }

    public int menu() {
        System.out.println("1.-...JUGAR...");
        System.out.println("2.-...SALIR...");
        System.out.println("Ingrese una opcíon...");
        return scan.nextInt();
    }
}

