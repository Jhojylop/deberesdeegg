import java.util.Scanner;

public class EjercicioProcedimiento {
    public static void main(String[] args) {
        Scanner leyendo = new Scanner(System.in);
        System.out.println("por favor ingrese dos numeros : ");
        int numero1 = leyendo.nextInt();
        int numero2 = leyendo.nextInt();
        multiploInformation(numero1, numero2);

    }

    public static void multiploInformation(int numero1, int numero2) {
        if ((numero1 % numero2) == 0) {
            System.out.println("el numero " + numero1 + " si es multiplo de " + numero2);
        } else {
            System.out.println("el numero " + numero1 + " no es multiplo de " + numero2);
        }
    }
}
