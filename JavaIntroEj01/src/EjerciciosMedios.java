import java.util.Scanner;

public class EjerciciosMedios {
    public static void main(String[] args) {
        Scanner leyendo = new Scanner(System.in);
        System.out.println("Ingrese dos numeros: ");
        int numero1 = leyendo.nextInt();
        int numero2 = leyendo.nextInt();
        int opcion;
        int contador = 0;
        String eleccion = "";
        do {
            showMenu();
            opcion = leyendo.nextInt();
            double resultado;
            switch (opcion) {
                case 1:
                    resultado = numero1 + numero2;
                    System.out.println(resultado);

                    break;
                case 2:
                    resultado = numero1 - numero2;
                    System.out.println(resultado);
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    System.out.println(resultado);
                    break;
                case 4:
                    resultado = (double) numero1 / numero2;
                    System.out.println(resultado);
                    break;
                case 5:
                    System.out.println("esta seguro que desea salir? escoja S/N");
                    leyendo.nextLine();
                    eleccion = leyendo.nextLine();
                    if (eleccion.equals("S")) {
                        System.out.println("ha esogido la opcion si, adios...");
                        contador = 1;
                    }
                    break;
            }

        } while (opcion < 6 && contador != 1);
    }

    private static void showMenu() {
        System.out.println("Menú");
        System.out.println("1.sumar");
        System.out.println("2.restar");
        System.out.println("3.multipicar");
        System.out.println("4.dividir");
        System.out.println("5.salir");
        System.out.println("escoja una opcion");
    }
}
