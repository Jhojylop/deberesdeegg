package service;

import java.util.Scanner;

public class MenuService {
    private PaisService paisService = new PaisService();
    private Scanner scan = new Scanner(System.in);
    public void iniciar(){
        int opcion;
        do {
            opcion = menu();
            switch (opcion){
                case 1:
                    paisService.agregarPais();
                    break;
                case 2:
                    paisService.mostrarPaises();
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del pais que desea eliminar");
                    String pais = scan.next().toUpperCase();
                    paisService.eliminarPais(pais);
                    break;
                case 4:
                    System.out.println("gracias por usar nuestro sistema...");
                    break;
                default:
                    System.out.println("Opción incorrecta...");

            }

        }while ( opcion != 4);
    }
    public int menu(){
        System.out.println("1.Ingresar pais...");
        System.out.println("2.Mostrar paises");
        System.out.println("3.Eliminar pais");
        System.out.println("4.Salir");
        System.out.println("Ingrese una opción");
        return scan.nextInt();
    }
}
