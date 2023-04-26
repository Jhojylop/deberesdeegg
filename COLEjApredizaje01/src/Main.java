import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        List <String> razas = new ArrayList<>();
        System.out.println("------------BIENVENIDO-------------");
        int opcion;
        do {
            opcion = menu();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese la raza del perro: ");
                    razas.add(scan.next());
                    break;
                case 2:
                    System.out.println("hasta la proxima...");
                    System.out.println("Estas son la razas ingresadas...");
                    System.out.println(razas);
                    razas.forEach(System.out::println);
                    break;
                default:
                    System.out.println("Opción incorrecta...");
                    break;

            }
        }while(opcion != 2);

    }
    public static int menu(){
        System.out.println("1.- Ingresar raza");
        System.out.println("2.- salir: ");
        System.out.println(" Ingrese una opción...");
        return scan.nextInt();
    }
}