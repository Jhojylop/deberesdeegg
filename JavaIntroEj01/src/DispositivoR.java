import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.substring;

public class DispositivoR {
    public static void main(String[] args) {
        Scanner leyendo = new Scanner(System.in);
        int validacionFormato = 5;
        boolean hizoMatch = false;
        int correcto = 0;
        int incorrecto = 0;
        int incorrectoCantidad = 0;
        String fde = "&&&&&";
        do {
            System.out.println("Ingrese una secuencia de caracteres: ");
            String cadenaIngreso = leyendo.nextLine();
            if (cadenaIngreso.length() <= validacionFormato) {
                String inicioFormato = substring(cadenaIngreso, 0, 1);
                String finFormato = cadenaIngreso.substring(cadenaIngreso.length() - 1);
                if (inicioFormato.equals("X") && finFormato.equals("O")) {
                    correcto++;
                } else if (cadenaIngreso.equals(fde)) {
                    hizoMatch = true;
                } else {
                    incorrecto++;
                }
            } else {
                incorrectoCantidad++;
            }
        } while (!hizoMatch);

        System.out.println("usted a ingresado correctamanete: " + correcto + " veces e incorrectamente " + (incorrecto + incorrectoCantidad) + " veces.");

    }
}
