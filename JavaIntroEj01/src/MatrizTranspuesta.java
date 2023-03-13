public class MatrizTranspuesta {
    public static void main(String[] args) {
        int [][] matrizInicial = rellenarmatriz();
        System.out.println("esta es su matriz inicial: ");
        impresionMatriz(matrizInicial);
        System.out.println("y esta su transpuesta ");
        transpuesta(matrizInicial);
    }
    public static int[][] rellenarmatriz(){
        int [][] matriz = new int[4][4];
        for (int i = 0 ; i < 4; i++ ){
            for (int j = 0; j < 4; j++){
                matriz[i][j]=(int)(Math.random()*10);
            }
        }
        return matriz;
    }

    public static void impresionMatriz (int [][] matrizInicial){

        for (int i = 0; i < 4 ; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(matrizInicial[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void transpuesta (int [][] matrizInicial){
        //int [][] matrizllena = matrizInicial;
        int [][] transpuesta = new int[4][4];
        for (int i = 0; i < 4; i++){
            for (int j=0; j < 4; j++){
                transpuesta[i][j] = matrizInicial[j][i];
            }
        }
        for (int i = 0; i < 4; i++){
            for (int j=0; j < 4; j++){
                System.out.print(transpuesta[i][j]+" ");
            }
            System.out.println("");
       }
    }

}