/*
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €


/**
 *
 * @author erik_
 */
import java.util.Scanner;
public class EjerciciosConversion {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);

        System.out.println("Ingrese la cantidad de euros a transformar ");

        int euro=leer.nextInt();
        System.out.println("¿A que moneda desea convertir? ");
        System.out.println(" Dolares ");
        System.out.println(" Yenes ");
        System.out.println(" Libras ");
        leer.nextLine();
        String op = leer.nextLine();
        Co(euro,op);

    }

    public static void Co (int euro, String op ){


        double Cd = 0;

        switch(op){

            case "Dolares":

                Cd = 1.28611 * euro;

                break;

            case "Yenes":


                Cd = 129.852 * euro;

                break;
            case "Libras":


                Cd = 0.86 * euro;

                break;
        }

        System.out.println("La conversion es de euro a " + op + " es de " + Cd);

    }
}