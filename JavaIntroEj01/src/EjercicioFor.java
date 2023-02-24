import java.util.Scanner;

public class EjercicioFor {
    public static void main(String[] args) {
        Scanner leyendo = new Scanner(System.in);
        int ingresos = 4;
        int numero;

        for (int i = 0; i < ingresos; i++) {
            System.out.println(" INGRESE UN NUMERO entre 1 y 20: ");
            numero = leyendo.nextInt();
            if (numero < 0 || numero > 20) {
                System.out.print("numero incorrecto vuelva a intentarlo: ");
                i--;
            } else {
                for (int j = 0; j < numero; j++) {
                    System.out.print("*");
                }
             System.out.print("\n");
            }

        }
    }
}
