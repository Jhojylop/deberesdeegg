import java.util.Scanner;

public class EjercicioExtra9 {
    public static void main(String[] args) {
        Scanner leyendo = new Scanner(System.in);
        int dividendo, divisor;
        do {
            System.out.println("Ingrese numeros validos enteros mayores que cero: ");
            dividendo = leyendo.nextInt();
            divisor = leyendo.nextInt();
        } while ((divisor < 1 || dividendo < 1) || (dividendo < divisor));
        dividir(dividendo, divisor);


    }

    public static void dividir(int dividendo, int divisor) {
        int cociente = 0;
        int residuo;
        int auxiliar = dividendo;
        do {
            residuo = dividendo - divisor;
            dividendo = residuo;
            cociente++;

        } while (dividendo >= divisor);
        System.out.println("el resultado de la division entre: " + auxiliar + " y " + divisor + " es de cociente: " + cociente + " y con un residuo de: " + dividendo);
    }
}
