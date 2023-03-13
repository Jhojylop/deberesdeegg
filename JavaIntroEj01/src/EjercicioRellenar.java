import java.util.Scanner;

public class EjercicioRellenar {
    public static void main(String[] args) {
        Scanner leyendo = new Scanner(System.in);
        System.out.println("Ingrese la canidad de numeros que se van a ser evaluados: ");
        int numeroPosiciones = leyendo.nextInt();
        System.out.println("Ingrese el numero a buscar: ");
        int numeroBuscado = leyendo.nextInt();
        rellenarBuscar(numeroPosiciones, numeroBuscado);

    }

    public static void rellenarBuscar(int numeroPosiciones, int numeroBuscado) {
        int[] vector = new int[numeroPosiciones];
        int vecesRepetido = 0;
        for (int i = 0; i < numeroPosiciones; i++) {
            vector[i] = (int) (Math.random() * 100);
            if (vector[i] == numeroBuscado) {
                vecesRepetido++;
            }
        }
        for (int i = 0; i < numeroPosiciones; i++) {
            System.out.println("el numero en la posicion: " + (i + 1) + " es: " + vector[i]);
        }
        System.out.println("las veces que se repitio el numero " + numeroBuscado + " fueron: " + vecesRepetido + " veces.");
    }
}
