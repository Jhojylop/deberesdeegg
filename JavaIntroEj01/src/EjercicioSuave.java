import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class EjercicioSuave {
    public static void main(String[] args) {
        //primer ejercicioo
        Scanner leyendo = new Scanner(System.in);
        System.out.println("ingrese dos numeros enteros: ");
        int numero1 = leyendo.nextInt();
        int numero2 = leyendo.nextInt();
        int suma = numero1 + numero2;
        System.out.println("la suma es igual a: "+ suma);
        //segundo ejercicio
        System.out.println("ingrese su nombre: ");
        leyendo.nextLine();
        String nombre = leyendo.nextLine();
        System.out.println("su nombre es: "+nombre);
        //tercer ejercicio
        System.out.println("ingrese una frase: ");
        String frase = leyendo.nextLine();
        String minusculas = toLowerCase(frase);
        String mayusculas = toUpperCase(frase);
        System.out.println("la frase es mayusculas es: "+mayusculas+ " y la frase en minusculas es: "+minusculas);
    }
}
