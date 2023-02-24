import java.util.Scanner;

public class EjercicioDo {
    public static void main(String[] args){
        Scanner leyendo= new Scanner(System.in);
        int contador = 0;
        int suma = 0;
        int numero;
        do {
            System.out.println("ingrese un numero: ");
            numero = leyendo.nextInt();
            contador++;

            if (numero == 0) {
                break;
            }

            if (numero > 0) {
                suma = suma + numero;
            }
        } while (contador != 20);

        if (contador < 20){
            System.out.println("se encontro el numero 0");
        }
        System.out.println("la suma de los numeros ingresados es: "+suma);
    }

}
