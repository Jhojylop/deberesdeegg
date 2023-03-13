import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EjercicioExtra4 {
    public static void main(String[] args) {
        Scanner leyendo = new Scanner(System.in);
        int numero;
        do {
            System.out.println("ingrese un numero de 1 a 10:");
            numero= leyendo.nextInt();
        }while(numero < 1 || numero > 10);

        switch (numero){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("VI");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;

        }
    }
}
