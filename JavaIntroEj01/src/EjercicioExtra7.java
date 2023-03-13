import java.util.Arrays;
import java.util.Scanner;

public class EjercicioExtra7 {
    public static void main(String[] args) {
        Scanner leyendo = new Scanner(System.in);
        int numeros;
        do {
            System.out.println("ingrese la cantidad de numeros a ingresar : ");
            numeros = leyendo.nextInt();
        }while(numeros < 1);
        int [] vector = new int[numeros];
        int maximo;
        int minimo;
        int i = 0;
        int suma = 0;
        do {
            System.out.println("Ingrese el "+(i+1)+" valor");
            vector[i]= leyendo.nextInt();
            suma += vector[i];
            i++;
        }while (i < numeros);
        Arrays.sort(vector);
        System.out.println("el valor minimo es: "+vector[0]);
        System.out.println("el valor mayor es: "+vector[numeros-1]);
        System.out.println("el promedio es: "+(suma/numeros));

    }
}
