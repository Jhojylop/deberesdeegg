import java.util.Scanner;

public class MatrizCuadrada {
    public static void main(String[] args) {
        System.out.println("aqui va a mirar su matriz grande");
        int[][] matrizGrande = rellenarMatriz();
        mostrar(matrizGrande);
        System.out.println("ahora rellene su matriz pequeña :");
        int[][] matrizPek = rellenar(matrizGrande);
        System.out.println("Aqui tiene su matriz pequeña: ");
        mostrar(matrizPek);


    }

    public static int[][] rellenarMatriz() {
        int dimension = 10;
        int[][] matriz = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        return matriz;
    }

    public static void mostrar(int[][] matrizGrande) {
        int dimen = matrizGrande.length;
        for (int i = 0; i < dimen; i++) {
            for (int j = 0; j < dimen; j++) {
                System.out.print(matrizGrande[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] rellenar(int[][] matrizGrande) {
        Scanner leyendo = new Scanner(System.in);
        int condicion = matrizGrande.length;
        int dimensionPek;
        do {
            System.out.println("ingrese la dimension de su matriz correctamente: ");
            dimensionPek = leyendo.nextInt();
        } while (dimensionPek < 1 || dimensionPek > condicion);

        int[][] matrizPek = new int[dimensionPek][dimensionPek];
        System.out.println("Ingrese los valores de su matriz de 1 a 9: ");
        for (int i = 0; i < dimensionPek; i++) {
            for (int j = 0; j < dimensionPek; j++) {
                do {
                    System.out.println("ingrese el valor para fila " + (i + 1) + " columna " + (j + 1));
                    matrizPek[i][j] = leyendo.nextInt();
                } while (matrizPek[i][j] <= 0 || matrizPek[i][j] > 9);

            }
        }
        return matrizPek;
    }

    public static void mostrarPek(int[][] matrizPek) {
        int dimen = matrizPek.length;
        for (int i = 0; i < dimen; i++) {
            for (int j = 0; j < dimen; j++) {
                System.out.print(matrizPek[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void verificar(int[][] matrizGrande, int[][] matrizPek) {

    }

}
