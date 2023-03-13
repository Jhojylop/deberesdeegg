/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo entero truncan los
números o resultados.
 */

import java.util.Scanner;


public class EjercicioExtra11 {

    public static void main(String[] args) {
        int num;
        int cont = 1;
        System.out.println("Ingrese un numero: ");
        Scanner read = new Scanner(System.in);
        num = read.nextInt();
        int resultado = String.valueOf(num).length();
        System.out.println("resultado  es:"+resultado);

        do {
            if (num < 10) {
                break;
            } else {
                num = num / 10;
                cont++;
            }
        } while (num > 1);
        System.out.println("su numero tiene " + cont + " digitos");
        abcd();
    }

    private static void abcd() {
        int num;
        int cont = 1;
        System.out.println("Ingrese un numero: ");
        Scanner read = new Scanner(System.in);
        num = read.nextInt();
        if (num > 10) {
            while (num > 1) {
                num = num / 10;
                cont++;
            }
        }
        System.out.println("su numero tiene " + cont + " digitos");
    }
}
    

