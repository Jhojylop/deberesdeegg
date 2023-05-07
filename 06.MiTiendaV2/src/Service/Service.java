/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DanielPalma
 */
public class Service {

    Scanner read = new Scanner(System.in);
    HashMap<String, Double> productos = new HashMap();

    public void menuTienda() {
        int opc;

        do {
            System.out.println("----------------------------");
            System.out.println("-----Menú-----");
            System.out.println("1.Agregar producto");
            System.out.println("2.Modificar precio del producto");
            System.out.println("3.Eliminar producto");
            System.out.println("4.Mostrar productos y precios");
            System.out.println("5.Salir");
            System.out.println("Ingrese una opción");
            opc = read.nextInt();

            switch (opc) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    imprimirProductos();
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa!");
                    break;
                default:
                    System.out.println("Por favor ingrese una opción válida");
            }

        } while (opc != 5);

    }

    public void agregarProducto() {
        System.out.println("Ingrese el nombre del producto");
        String nombreP = read.next().toLowerCase();
        System.out.println("Ingrese el precio del producto");
        double precioP = read.nextDouble();
        productos.put(nombreP, precioP);
    }

    public void modificarPrecio() {
        System.out.println("Ingrese el producto a modificar precio");
        String mProducto = read.next().toLowerCase();
        System.out.println("Ingrese el nuevo precio del producto");
        double nPrecio = read.nextDouble();
        productos.replace(mProducto, nPrecio);

    }

    public void eliminarProducto() {

        System.out.println("Ingrese un producto a eliminar");
        String eProducto = read.next();
        productos.remove(eProducto);

    }

    public void imprimirProductos() {

        System.out.println("La lista de productos con precios son:");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println("Producto=" + entry.getKey() + "; Precio= $ "
                    + entry.getValue());

        }
    }

}
