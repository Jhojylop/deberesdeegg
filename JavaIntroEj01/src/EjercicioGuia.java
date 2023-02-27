import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeMath.sqrt;

public class EjercicioGuia {
    public static void main(String[] args) {
        Scanner leyendo = new Scanner(System.in);
        System.out.println("Ingrese un valor en grados centigrados: ");
        int grados = leyendo.nextInt();
        double resultado = 32 + (9 * (double) grados / 5);
        System.out.println("el resultado en farenheit es: " + resultado);
        //ultimo ejercicio suave de la primera pagina
        System.out.println("ingrese un numero entero: ");
        int numero = leyendo.nextInt();
        int doble = numero * 2;
        int triple = numero * 3;
        double raiz = Math.sqrt(numero);
        System.out.println("el doble del numero ingresado es: " + doble + " el triple es: " + triple + " y la raiz cuadrada es:" + raiz);
    }
}
