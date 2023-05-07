package service;

import java.util.Scanner;

public class MenuService {
    PeliculaService peliculaService = new PeliculaService();
    private final Scanner scan = new Scanner(System.in);
    public void iniciarPrograma (){
        int opcion;
        do {
            opcion = menu();
            System.out.println("=================================================");
            switch (opcion){
                case 1:
                    peliculaService.agregarPelicula();
                    break;
                case 2:
                    System.out.println("Estas son las peliculas agregadas actualmente...");
                    peliculaService.mostrarPeliculas();
                    break;
                case 3:
                    System.out.println("Pelicuas con duración de mas de una hora");
                    peliculaService.mostrarPeliculasMayorUnaHora();
                    break;
                case 4:
                    System.out.println("Peliculas ordenadas por su duración de forma Ascendente ");
                    peliculaService.ordenarPorDuracion();
                    break;
                case 5:
                    System.out.println("Peliculas ordenadas por su duración de forma Descendente ");
                    peliculaService.ordenarPorDuracionDescendente();
                    break;
                case 6:
                    System.out.println("Peliculas ordenadas por el Titulo");
                    peliculaService.mostrarPeliculas();
                    break;
                case 7:
                    System.out.println("Películas ordenadas por director ");
                    peliculaService.ordenarDirector();
                    break;
                case 8:
                    System.out.println("Gracias por usar nuestra aplicación ");
                    break;
                default:
                    System.out.println("Opción no válida...");
                    break;
            }
            System.out.println("=================================================");
        }while(opcion != 8);
    }
    public int menu(){
        System.out.println("1.- Agregar Película ");
        System.out.println("2.- Mostrar Películas ");
        System.out.println("3.- Mostrar películas con duración de mas de una hora ");
        System.out.println("4.- Mostrar películas ordenadas de Mayor a Menor según la duración  ");
        System.out.println("5.- Mostrar películas ordenadas de Menor a Mayor según la duración ");
        System.out.println("6.- Mostrar películas ordenadas por el Título ");
        System.out.println("7.- Mostrar películas ordenadas por el Director ");
        System.out.println("8.- Salir ");
        System.out.println("Elija una opción ");
        return scan.nextInt();
    }

}
