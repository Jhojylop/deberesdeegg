import java.util.Scanner;

public class EjercicioWhile {

    public static void main(String[] args) {
        Scanner leyendo = new Scanner (System.in);
        System.out.println("HOLA ingresa un nota entre 0 y 10");
        int nota = leyendo.nextInt();
        while (nota<0 || nota>10){
            System.out.println("la nota ingresada esta fuera del rango intenta una vez mas: ");
            nota = leyendo.nextInt();
        }
        System.out.println("la nota ingresada es correcta: ");
    }

}
