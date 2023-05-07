package service;

import java.util.Scanner;

public class MenuService {
    private ProductService productService = new ProductService();
    private Scanner scan = new Scanner(System.in);

    public void starUp() {
        int option;
        do {
            option = menu();
            switch (option) {
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.printStore();
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del producto que desea modificar");
                    String product = scan.next().toUpperCase();
                    System.out.println("Ingrese el valor nuevo del producto");
                    double newPrice = scan.nextDouble();
                    productService.modifyPriceProduct(product, newPrice);
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del producto que desea eliminar");
                    productService.deleteProduct(scan.next().toUpperCase());
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestra app");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (option != 5);
    }

    public int menu() {
        System.out.println("1. Ingresar productos ");
        System.out.println("2. Mostrar productos ");
        System.out.println("3. Modificar precio ");
        System.out.println("4. Eliminar producto ");
        System.out.println("5. Salir");
        System.out.println("Ingrese una opción...");
        return scan.nextInt();
    }
}
