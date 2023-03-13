import java.util.Scanner;

public class MatrizMagica {

    public static void main(String[] args) {

        System.out.println("hola aqui sabras si tu matriz es magica o no");
        int dimension = 3;
        int[][] rellenar = rellenar(dimension);
        System.out.println("Esta es su matriz: ");
        mostrar(rellenar);
        int[] verificar = verificar(rellenar, dimension);
        imprimir(verificar);
    }

    public static int[][] rellenar(int dimension) {
        Scanner leyendo = new Scanner(System.in);
        int[][] matriz = new int[dimension][dimension];
        System.out.println("Ingrese los valores de su matriz de 1 a 9: ");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                do {
                    System.out.println("ingrese el valor para fila " + (i + 1) + " columna " + (j + 1));
                    matriz[i][j] = leyendo.nextInt();
                } while (matriz[i][j] <= 0 || matriz[i][j] > 9);

            }
        }
        return matriz;
    }

    public static int[] verificar(int[][] rellenar, int dimension) {
        int sumaFila = 0, sumaColumna = 0, sumaDiagonal = 0, sumaDiagona2 = 0;
        int[] almacenador = new int[(dimension * dimension) - 1];
        for (int i = 0; i < dimension; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < dimension; j++) {
                sumaFila += rellenar[i][j];
                sumaColumna += rellenar[j][i];
                if (i == j) {
                    sumaDiagonal += rellenar[i][j];
                }
                if (i == (dimension - 1 - i)) {
                    sumaDiagona2 += rellenar[i][j];
                }
            }
            almacenador[i] = sumaFila;
            almacenador[i + dimension] = sumaColumna;
            almacenador[6] = sumaDiagonal;
            almacenador[7] = sumaDiagona2;
        }
        return almacenador;
    }

    public static void imprimir(int[] verificar) {
        int cantidad = verificar.length;
        boolean respuesta = true;
        for (int i = 0; i < cantidad; i++) {
            if (verificar[i] != verificar[0]) {
                respuesta = false;
                break;
            }
        }
        if (respuesta) {
            System.out.println("la matriz es magica guapo");
        } else {
            System.out.println("la matriz no es magica mas suerte la proxima :,v");
        }
    }
    public static void mostrar (int [][] rellenar){
        int dimen = rellenar.length;
        for (int i = 0; i < dimen; i++){
            for (int j = 0; j < dimen; j++){
                System.out.print(rellenar[i][j]+" ");
            }
            System.out.println("");
        }
    }

}
