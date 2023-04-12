package servicio;
import java.util.Scanner;

public class MenuService {
    MovilService movilService = new MovilService();

    public void iniciarPrograma() {

        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    movilService.cargarCelular();
                    break;
                case 2:
                    movilService.mostrarCelular();
                    break;
                case 3:
                    movilService.mostrarTodo();
                    break;
                case 4:
                    System.out.println("Adios guapo...");
                    break;
            }
        } while (opcion != 4);
    }

    public int menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.- Cargar datos de celular...");
        System.out.println("2.- Mostrar datos de un celular...");
        System.out.println("3.- Mostrar todos los celulares...");
        System.out.println("4.- Salir...");
        System.out.println("Ingrese una opcion...");
        return scan.nextInt();
    }

}
