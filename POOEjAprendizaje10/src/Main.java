import models.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        System.out.println("El vector A es: ");
        for (int i = 0; i < 50; i++) {
            System.out.print("[" + String.format("%.1f", array.getVectorA()[i]) + "]");
        }
        System.out.println("");

        Arrays.sort(array.getVectorA());
        System.out.println("El vector A ordenado de forma ascendente es: ");
        for (int i = 0; i < 50; i++) {
            System.out.print("[" + String.format("%.1f", array.getVectorA()[i]) + "]");
        }
        System.out.println("");
        System.out.println("el vector B combinado es: ");

        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                array.getVectorB()[i] = array.getVectorA()[i];
            } else {
                array.getVectorB()[i] = 0.5;
            }
            System.out.print("[" + String.format("%.1f", array.getVectorB()[i]) + "]");
        }

    }
}