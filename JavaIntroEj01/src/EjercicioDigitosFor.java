import java.util.Scanner;

public class EjercicioDigitosFor {
    public static void main(String[] args) {
        Scanner leyendo = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros aleatorios que desea: ");
        int espacios = leyendo.nextInt();
        int[] numerosRandom = new int[espacios];
        rellenadorImpresion(numerosRandom, espacios);
    }

    public static void rellenadorImpresion(int[] numerosRandom, int espacios) {
        int[] registroDigitos = new int[6];
        for (int i = 0; i < espacios; i++) {
            int generadorRandom = (int) (Math.random() * 100000);
            int cantidadDigitos = String.valueOf(generadorRandom).length();
            registroDigitos[cantidadDigitos]++;
            numerosRandom[i] = generadorRandom;
        }
        for (int i = 0; i < espacios; i++) {
            System.out.println(numerosRandom[i]);
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("numero ingresados con " + i + " digitos es " + registroDigitos[i] + " veces");
        }
    }
}
