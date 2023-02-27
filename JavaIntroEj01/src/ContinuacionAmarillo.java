import java.sql.SQLOutput;
import java.util.Scanner;

public class ContinuacionAmarillo {
    //ejercicio validar primer letra de un string con substring
    public static void main(String[] args) {
        Scanner leyendo = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leyendo.nextLine();
        String primeraLetra = frase.substring(0,1);
        if (primeraLetra.equals("A")){
            System.out.println("CORRECTO");

        }else{
            System.out.println("incorrecto");
        }

        //ejercicio limite suma de numeros

        System.out.println("Ingrese un numero positivo que sera el limite de una final:");
        int numeroLimite = leyendo.nextInt();
        int suma = 0;
        do {
            System.out.println("Ingrese un numero: ");
            int secuenciaNumeros = leyendo.nextInt();
            suma = suma + secuenciaNumeros;
        }while (suma<=numeroLimite);
        System.out.println("la suma de los valores ingresados a superado el numero inicial " +numeroLimite+ " la suma total actual es: "+suma);

    }
}
