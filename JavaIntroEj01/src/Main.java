import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner leyendo = new Scanner(System.in);
        String nombre = "jhojan";
        int numero = 0;
        double decimales = 3.11;
        double sentido = 2.4;
        byte dato = 1;
        long datos = 23;
        int intento1 = 5;
        int intento2 = 8;
        double resultadodiv =(double)intento1/intento2;
        double resultadosum = intento1+intento2;
        boolean respuesta1 = intento1<intento2;
        boolean respuesta2 = intento1==intento2;
        intento1++;
        intento2--;
        System.out.println("hola aqui va mi primer intento "+nombre);
        System.out.println("aqui va mi edad: "+datos+" años");
        System.out.println("escriba su nombre: ");
        String nombre2 = leyendo.nextLine();
        System.out.println("escriba su edad: ");
        int edad = leyendo.nextInt();
        leyendo.nextLine(); // Limpia el buffer de entrada
        System.out.println("ingrese su apellido: ");
        String apellido = leyendo.nextLine();
        System.out.println("su nombre es: "+nombre2);
        System.out.println("su edad es: "+edad+" años");
        System.out.println("su apellido es: "+apellido);
        System.out.println(nombre);
        System.out.println(numero);
        System.out.println(resultadodiv);
    }
}