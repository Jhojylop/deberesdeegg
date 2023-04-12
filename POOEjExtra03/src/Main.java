import service.RaicesService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RaicesService raicesService = new RaicesService();
        int opcion;
        do {
            opcion = menu();
            switch (opcion){
                case 1:
                    raicesService.ingresarEcuacion();
                    System.out.println("estos son los resultados: ");
                    raicesService.calcularResultado();
                    break;
                case 2:
                    System.out.println("Adios...");
                    break;
                default:
                    System.out.println("Opcion incorrecta...");
            }
        }while(opcion != 2);
    }
    public static int menu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1.- Ingresar datos de la ecuacion y calcular soluciones...");
        System.out.println("2.- Salir...");
        System.out.println("Ingrese una opcion...");
        return scan.nextInt();
    }
}