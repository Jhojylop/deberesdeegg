import java.util.Scanner;

public class EjercicioExtra8 {
    public static void main(String[] args) {
        Scanner leyendo = new Scanner(System.in);
        int numero;
        int contadorG = 0;
        int contadorP = 0;
        int contadorI = 0;
        do {
            System.out.println("Ingrese numero para ser evaluado recuerde que numeros negativos no seran tomados en cuenta: ");
            numero = leyendo.nextInt();
            if (numero>0){
                contadorG++;
                if ((numero % 2) == 0){
                    contadorP++;
                }else{
                    contadorI++;
                }
                if ((numero%5)==0){
                    break;
                }
            }
        }while(true);
        System.out.println("los numeros ingresados son: "+contadorG);
        System.out.println("cantidad de numeros impares es: "+contadorI);
        System.out.println("cantidad de numeros pares es: "+contadorP);
    }
}
