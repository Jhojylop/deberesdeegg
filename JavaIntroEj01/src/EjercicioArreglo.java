import java.util.Scanner;

public class EjercicioArreglo {
    public static void main(String[] args) {
        int numeroCompas = 7;
        String[] vectorCompas = new String[numeroCompas];
        for (int i = 0; i < numeroCompas; i++){
            System.out.println("ingres el nombre del:" +(i+1));
            Scanner leyendo = new Scanner(System.in);
            String lugares = leyendo.nextLine();
            vectorCompas[i] = lugares;
        }
        System.out.print("");
        for (int i = 0; i<numeroCompas; i++){
            System.out.println(vectorCompas[i]);
        }
    }
}
