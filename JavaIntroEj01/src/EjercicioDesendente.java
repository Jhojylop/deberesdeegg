public class EjercicioDesendente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int [] vector = new int [100];

        for (int i=0; i<=99; i++){
            vector [i]= i+1;
        }
        for (int i=99; i>=0; i--){

            System.out.println(vector[i] );
        }

    }

}
