package service;

import java.util.Scanner;

public class MenuService {
    AlumnoService alumnoService = new AlumnoService();
    private final Scanner scan = new Scanner(System.in);

    public void iniciarPrograma() {
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    alumnoService.crearAlumno();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del alumno del cual desea calcular su nota final: ");
                    alumnoService.calcularNotaFinal(scan.next().toLowerCase());
                    break;
                case 3:
                    System.out.println("Adios...");
                    break;
                case 4:
                    alumnoService.mostrarAlumnos();
                    System.out.println("ingrese alumno:");
                default:
                    System.out.println("Opcion incorrecta...");
                    break;
            }
        } while (opcion != 3);

    }

    public int menu() {
        System.out.println("1.- Crear un alumno...");
        System.out.println("2.- Calcular nota final de alumno...");
        System.out.println("3.- Salir...");
        System.out.println("4.- Mostrar Alumnos...");
        System.out.println("Ingrese una opcion...");
        return scan.nextInt();
    }
}
