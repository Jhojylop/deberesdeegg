import models.Meses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Meses meses = new Meses();
        String mesBuscado;
        int contadorFallos = 1;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("hay un mes escondido, ingrese un mes para ver si lo encuentra: ");
            mesBuscado = scan.nextLine().toLowerCase();
            if (meses.reesultado(mesBuscado)){
                System.out.println("felicidades ese era el mes que estaba escondido: ");
            }else{
                System.out.println("has fallado...");
                contadorFallos++;
            }
        }while(!meses.reesultado(mesBuscado));
        System.out.println("Usted necesito de: "+contadorFallos+" intentos para adivinar, remanco v:...");
    }
}