public class magicaEjemplo {
    public static void main(String[] args) {
        int[][] matriz = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};

        if (esMagica(matriz)) {
            System.out.println("La matriz es mágica.");
        } else {
            System.out.println("La matriz no es mágica.");
        }
    }

    public static boolean esMagica(int[][] matriz) {
        int n = matriz.length;
        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;

        for (int i = 0; i < n; i++) {
            int sumFilas = 0;
            int sumColumnas = 0;
            sumDiagonal1 += matriz[i][i];
            sumDiagonal2 += matriz[i][n - i - 1];

            for (int j = 0; j < n; j++) {
                sumFilas += matriz[i][j];
                sumColumnas += matriz[j][i];
            }

            if (sumFilas != sumColumnas || sumFilas != sumDiagonal1 || sumFilas != sumDiagonal2) {
                return false;
            }
        }

        return true;
    }

}