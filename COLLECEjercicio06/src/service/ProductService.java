package service;

import models.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductService {
    private Map<String, Double> store = new HashMap<>();
    private Scanner scan = new Scanner(System.in);

    public void addProduct() {
        Product product = new Product();
        System.out.println("Ingrese el nombre del producto...");
        product.setProductName(scan.next().toUpperCase());
        System.out.println("Ingrese el precio del producto...");
        product.setproductPrice(scan.nextDouble());
        store.put(product.getProductName(), product.getproductPrice());
    }

    public void modifyPriceProduct(String key, double value) {
        String validatedKey = keyvalidation(key);
        if (validatedKey != null) {
            store.replace(key, value);
            System.out.println("El precio del producto " + key + " ha sido modificado");
        } else {
            System.out.println("Producto no encontrado");
        }
    }

    public void deleteProduct(String key) {
        String validatedKey = keyvalidation(key);
        if (validatedKey != null) {
            store.remove(key);
            System.out.println("El producto " + key + " fue elimanado con exito");
        } else {
            System.out.println("Producto no encontrado");
        }

    }

    public void printStore() {
        // TODO: Si no hay productos mostrar un mensaje tu tienda no tiene productos
        if (store.isEmpty()){
            System.out.println("Tu TIENDA NO TIENE PRODUCTOS");
        }else{
            System.out.println("Estos son sus productos");
            System.out.println(store);
        }
    }

    public String keyvalidation(String key) {
        String keyvalidation = null;
        if (store.containsKey(key)) {
            keyvalidation = key;
        }
        return keyvalidation;
    }
}
