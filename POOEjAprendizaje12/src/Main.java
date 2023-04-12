import models.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Persona persona = new Persona();
        int opcion;
        do {
            opcion = menu();
            switch (opcion){
                case 1:
                  persona.crearPersona();
                  break;
                case 2:
                    System.out.println("Ingrese el nombre de la persona de la  que desea saber la edad:");
                    String nombre = scan.nextLine().toUpperCase();
                    persona.calcularEdad(nombre);
                    break;
                case 3:
                    System.out.println("Ingrese el nomre de la persona con la que quiere comparar la edad a comparar:");
                    nombre = scan.nextLine().toUpperCase();
                    persona.menorQua(nombre);
                    break;
                case 4:
                    System.out.println("Ingrese el nomre de la persona con la que quiere comparar la edad a comparar:");
                    nombre = scan.nextLine().toUpperCase();
                    persona.imprimirPersona(nombre);
                    break;
                case 5:
                    System.out.println("Adios...");
                default:
                    System.out.println("opcion incorrecto...");


            }
        }while (opcion != 5);

    }
    public static int menu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1.- Crear usuario...");
        System.out.println("2.- Calcular edad...");
        System.out.println("3.- Ingresar una edad para comparar...");
        System.out.println("4.- Mostrar datos de persona...");
        System.out.println("5.- Salir...");
        System.out.println("Ingrese una opción...");
        return scan.nextInt();
    }

}