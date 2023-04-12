import service.PersonaService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PersonaService personaService = new PersonaService();
        int opcion;
        do {
            opcion = menu();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del usuario: ");
                    String nombre = scan.nextLine();
                    System.out.println("Ingrese la edad del usuario: ");
                    int edad = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Ingrese el sexo del usuario: ");
                    String sexo = scan.nextLine();
                    System.out.println("Ingrese el peso del usuario en Kg: ");
                    double peso = scan.nextDouble();
                    System.out.println("Ingrese la altura del usuario en m: ");
                    double altura = scan.nextDouble();
                    personaService.crearPersona(nombre.toUpperCase(),edad,sexo,peso,altura);
                    scan.nextLine();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la persona para hacerle el calculo de IMC: ");
                    String nombreVerificar = scan.nextLine();
                    personaService.calcularImc(nombreVerificar.toUpperCase());
                    break;
                case 3:
                    System.out.println("Ingrese el nombre de la persona que desea saber el estado de la edad: ");
                    nombreVerificar = scan.nextLine();
                    personaService.medidorEdad(nombreVerificar.toUpperCase());
                    break;
                case 4:
                    personaService.mostrarEstadistica();
                    break;
                case 5:
                    System.out.println("Adios guapo...");
                    break;
                default:
                    System.out.println("OPCION INCORRECTA...");
            }

        }while(opcion != 5);

    }

    public static int menu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1.- Crear un usuario...");
        System.out.println("2.- Calcular IMC...");
        System.out.println("3.- Calcular en que rango de edad está...");
        System.out.println("4.- Ver una estadisitica general  de los datos de  todos los usuarios creados...");
        System.out.println("5.- Salir...");
        System.out.println("Ingrese una opción...");
        return scan.nextInt();
    }
}