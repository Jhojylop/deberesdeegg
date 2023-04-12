/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe10;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class POOe10 {

    /**
     * Realizar un programa en Java donde se creen dos arreglos: el primero será
     * un arreglo A de 50 números reales, y el segundo B, un arreglo de 20
     * números, también reales. El programa deberá inicializar el arreglo A con
     * números aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe
     * ordenar de menor a mayor y copiar los primeros 10 números ordenados al
     * arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el
     * valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
     * elementos y el combinado de 20.
     */
    public static void main(String[] args) {

        Array xA = new Array();
        double[] da = new double[50];
        double[] db = new double[20];
        Random xx = new Random();
        System.out.println("ARREGLO A: ");

        for (int i = 0; i < da.length; i++) {

            da[i] = (int) (xx.nextDouble() * 100);

            System.out.print("[" + da[i] + "]");
        }
        //ordenar un vector
        Arrays.sort(da);
        System.out.println("");
        System.out.println("ARREGLO A ORDENADO : ");

        for (int i = 0; i < da.length; i++) {

            System.out.print("[" + da[i] + "]");

        }
        System.out.println("");
        System.out.println("" + Arrays.toString(da));

        for (int i = 0; i < db.length; i++) {
            if (i < 10) {
                db[i] = da[i];
            } else {
                db[i] = 0.5;
            }

        }
        System.out.println("ARREGLO B: ");
        System.out.println("" + Arrays.toString(db));
    }

}
