import java.util.Scanner;

public class EjercicioExtra3 {
    public static void main(String[] args) {
        int validacion;
        String letra;
        Scanner leyendo = new Scanner(System.in);
        do {
            System.out.println("Ingrese una vocal: ");
            letra = leyendo.next();
            validacion = String.valueOf(letra).length();
        }while(validacion!=1);
        verificacion(letra);

    }
    public static void verificacion (String letra){
        switch (letra.toUpperCase()){
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("es una vocal ");
                break;
            default:
                System.out.println("no es una vocal  ");
        }
    }

}
