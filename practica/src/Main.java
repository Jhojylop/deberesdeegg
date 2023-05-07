import models.Perro;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Perro> listaPrueba = new ArrayList<>();
        Perro perro1 = new Perro("toby" ,23);
        Perro perro2 = new Perro("oso",10);
        Perro perro3 = new Perro("leon", 15);
        listaPrueba.add(perro1);
        listaPrueba.add(perro3);
        listaPrueba.add(perro2);
        System.out.println("impresion normal");
        listaPrueba.forEach(System.out::println);
       // Collections.sort(listaPrueba);
       // listaPrueba.forEach(System.out::println);
        Collections.sort(listaPrueba,Perro.compararEdad);
        System.out.println("impresion edad ascendente");
        listaPrueba.forEach(System.out::println);
        Collections.sort(listaPrueba, Perro.compararEdadDescendente);
        System.out.println("impresion edad descendente");
        listaPrueba.forEach(System.out::println);
        Set<Perro> conjuntoPerro = new TreeSet<>(listaPrueba);
        System.out.println("comparacion por edad con treeset");
        conjuntoPerro.forEach(System.out::println);
        System.out.println("uso de treeset diferente por nombre");
        Set<Perro> ordenNombre = new TreeSet<>(Perro.compararNombre);
        ordenNombre.addAll(listaPrueba);
        ordenNombre.forEach(System.out::println);
        Set <Perro> ordenNatura = new TreeSet<>();
        ordenNatura.addAll(ordenNombre);
        System.out.println("Impresion Normal..");
        ordenNatura.forEach(System.out::println);
    }
}