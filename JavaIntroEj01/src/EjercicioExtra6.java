import java.util.Scanner;

public class EjercicioExtra6 {
    public static void main(String[] args) {
        Scanner leyendo = new Scanner(System.in);
        System.out.println("Cuantas personas van a ser evaluadas: ");
        double cantidadPersonas = leyendo.nextDouble();
        calcular(cantidadPersonas);

    }
    public static void calcular (double cantidadPersonas){
        Scanner leyendo = new Scanner(System.in);
        double altura = 0;
        double promedioGeneral=0;
        double promedioPekes=0;
        double barra = 1.60;
        int contadorP = 0;
        for (int i = 0; i < cantidadPersonas; i++){
            System.out.println("Ingrese la altura de la "+(i+1)+" persona: ");
            altura= leyendo.nextDouble();
            promedioGeneral += altura;
            if(altura < barra){
                promedioPekes += altura;
                contadorP++;
            }
        }
        System.out.println("la altura promedio de las "+cantidadPersonas+" personas es: "+(promedioGeneral/cantidadPersonas));
        System.out.println("la altura promedio de las "+contadorP+" personas pekes es: "+(promedioPekes/contadorP));
    }
}
