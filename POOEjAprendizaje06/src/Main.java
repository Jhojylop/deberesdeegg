import service.CafeteraService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;
        CafeteraService cafeteraService = new CafeteraService();
        cafeteraService.crearCafetera();
        do {

            opcion = menu();
            switch (opcion) {
                case 1:
                    System.out.println("la cafetera ha sido llenada al maximo de su capacidad");
                    cafeteraService.llenarCafetera();
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de cafe en cm3 que desea en la taza: ");
                    int cantidadTaza = scan.nextInt();
                    cafeteraService.servirTaza(cantidadTaza);
                    break;
                case 3:
                    cafeteraService.vaciarCafe();
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de cafe en cm3 que desea agregar ");
                    int agregoCafe = scan.nextInt();
                    cafeteraService.agregarCafe(agregoCafe);
                    break;
                case 5:
                    System.out.println("adios guapo...");
                    break;
                default:
                    System.out.println("opcion incorrecta...");
                    break;

            }
        } while (opcion != 5);
    }

    public static int menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.- Llenar café...");
        System.out.println("2.- Servir taza...");
        System.out.println("3.- Vaciar cafetera...");
        System.out.println("4.- Agregar Café...");
        System.out.println("5.- SALIR...");
        System.out.println("Ingrese una opción...");
        return scan.nextInt();
    }
}
