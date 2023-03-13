/*
 Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
import java.util.Scanner;


public class EjercicioExtra10 {

    
    public static void main(String[] args) {
    
    int num1 = (int) (Math.random()*10+1);
    int num2 = (int) (Math.random()*10+1);
    int mul = resultado(num1,num2);   
    int resultado;
    System.out.println(mul);   
    Scanner read = new Scanner(System.in);
        do {
        
        System.out.println("Ingrese el su resultdo"); 
        resultado = read.nextInt();
        
        if(resultado==mul){
         System.out.println("Resultado correcto"); 
        }
    }while(resultado != mul);
         
    }
    
    public static int resultado(int num1, int num2){
     int total;
     total = num1 * num2;
        return total;
    }
    
}
