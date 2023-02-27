import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.length;

public class EjercicioAmarillo {
    public static void main(String[] args) {
        //ejercicio numero par o impar
        Scanner leyendo = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = leyendo.nextInt();
        if (numero % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");
        }
        //ejercicio de comparar string
        System.out.println("ingrese una frase: ");
        leyendo.nextLine();
        String frase = leyendo.nextLine();
        String fraseCompara = "eureka";
        if (frase.equals(fraseCompara)) {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }
        //ejercicio tamaño de strings con length
        System.out.println("ingrese un frase de 8 caracteres:");
        String frase8 = leyendo.nextLine();
        if (frase8.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
