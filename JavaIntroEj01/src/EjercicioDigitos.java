import java.util.Scanner;

public class EjercicioDigitos {
    public static void main(String[] args) {
        Scanner leyendo = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a evaluar: ");
        int numeroPosiciones = leyendo.nextInt();
        contadorDigitos(numeroPosiciones);
    }

    public static void contadorDigitos(int numeroPosiciones) {
        int[] vector = new int[numeroPosiciones];
        String evaluadorCadena = "";
        int unidad = 0, decena = 0, centena = 0, unidadMil = 0, decenaMil = 0;

        for (int i = 0; i < numeroPosiciones; i++) {
            int rellenoNumeros = (int) (Math.random() * 100000);
            vector[i] = rellenoNumeros;
            evaluadorCadena = String.valueOf(rellenoNumeros);
            switch (evaluadorCadena.length()) {
                case 1:
                    unidad++;
                    break;
                case 2:
                    decena++;
                    break;
                case 3:
                    centena++;
                    break;
                case 4:
                    unidadMil++;
                    break;
                case 5:
                    decenaMil++;
                    break;
            }
        }
        for (int i = 0; i < numeroPosiciones; i++) {
            System.out.println("el numero: " + (i + 1) + " es " + vector[i]);
        }
        System.out.println("hay: " + unidad + " numeros de un digito,");
        System.out.println("hay: " + decena + " numeros de 2 digitos,");
        System.out.println("hay: " + centena + " numeros de 3 digitos,");
        System.out.println("hay: " + unidadMil + " numeros de 4 digitos,");
        System.out.println("hay: " + decenaMil + " numeros de 5 digitos,");
    }
}
