import java.util.Scanner;

public class EjercicioExtra5 {
    public static void main(String[] args) {
        Scanner leyendo = new Scanner(System.in);
        String letra;
        int validacion;
        double costo=0;
        do {
            System.out.println("Ingrese su letra segun su tipo como socio A,B,C: ");
            letra = leyendo.next();
            validacion = String.valueOf(letra).length();
        }while(validacion!=1);
        calcular(letra,costo);

    }
    public static void calcular (String letra , double costo){
        Scanner leyendo = new Scanner(System.in);
        switch(letra.toUpperCase()){
            case "A":
                System.out.println("ingrese el costo del tratamiento: ");
                costo = leyendo.nextInt();
                costo = costo * (0.5);
                System.out.println("por ser socio tipo "+letra+" el valor a pagar es: "+costo);
                break;
            case "B":
                System.out.println("ingrese el costo del tratamiento: ");
                costo = leyendo.nextInt();
                costo = costo * (0.65);
                System.out.println("por ser socio tipo "+letra+" el valor a pagar es: "+costo);
                break;
            case "C":
                System.out.println("ingrese el costo del tratamiento: ");
                costo = leyendo.nextInt();
                System.out.println("por ser socio tipo "+letra+" el valor a pagar es: "+costo);
                break;
            default:
                System.out.println("usted no pertenece aqui");
        }
    }
}
