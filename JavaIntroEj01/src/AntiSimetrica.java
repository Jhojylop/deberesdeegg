import java.util.Scanner;

public class AntiSimetrica {
    public static void main(String[] args) {
        Scanner leyendo = new Scanner(System.in);
        System.out.println("INGRESE EL TAMAÑO DE LA MATRIZ QUE VA HACER EVALUADA: ");
        int dimension = leyendo.nextInt();
        int [][] matrizInicial = rellenar(dimension);
        int [][] transpuesta = transpuesta(matrizInicial,dimension);
        verificacion(matrizInicial,transpuesta,dimension);

    }
    public static int [][] rellenar (int dimension){
        int [][]matrizInicial = new int[dimension][dimension];
        Scanner leyendo = new Scanner(System.in);
        System.out.println("Ingrese los numeros: ");
        for (int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++){
                matrizInicial[i][j]= leyendo.nextInt();
            }
        }
        return matrizInicial;
    }
    public static int [][] transpuesta (int[][] matrizInicial,int dimension ){
        int [][] transpuesta = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++){
                transpuesta[i][j]=matrizInicial[j][i];
            }
        }
        return transpuesta;
    }
    public static void verificacion(int [][] matrizInicial,int [][] transpuesta, int dimension){
        boolean respuesta = true;
        for(int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++){
                if (matrizInicial[i][j] != (transpuesta[i][j]*-1)){
                    respuesta=false;
                }
            }
        }
        if (respuesta){
            System.out.println("la matriz es antisimetrica");
        }else{
            System.out.println("la matriz no es antisimetrica");
        }
    }
}
