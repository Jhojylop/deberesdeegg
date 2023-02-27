import java.util.Scanner;

public class ArregloCuadrado {
    public static void main(String[] args) {
        Scanner leyendo = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = leyendo.nextInt();
        String [][] cuadrado = new String[numero][numero];
        for (int i = 0; i < numero; i++){
            for (int j = 0; j < numero; j++){
                if (i == 0 || i==(numero-1)){
                    cuadrado[i][j] = "*";
                }else if(j == 0 || j == (numero-1)){
                    cuadrado[i][j] = "*";

                }else{
                    cuadrado[i][j] = " ";

                }
            }
        }

        for (int i = 0; i < numero; i++){
            for (int j = 0; j < numero; j++){
                System.out.print(cuadrado[i][j]);
            }
            System.out.println("");
        }


    }
}
