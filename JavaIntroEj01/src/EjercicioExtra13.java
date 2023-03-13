import java.util.Scanner;

public class EjercicioExtra13 {
    public static void main(String[] args) {
        Scanner leyendo = new Scanner(System.in);
        System.out.println("ingrese la altura de la escalera :");
        int altura = leyendo.nextInt();
        construir(altura);
    }
    public static void construir(int altura){
        for (int i = 0; i < altura ;i++){
            for (int j = 0; j <= i; j++){
                System.out.print((j+1));
            }
            System.out.println("");
        }
    }
}
