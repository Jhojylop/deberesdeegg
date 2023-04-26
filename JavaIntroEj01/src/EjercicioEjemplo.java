import java.sql.SQLOutput;

public class EjercicioEjemplo {
    public static void main(String[] args) {
        int base = 16;
        int vidas = 5;
        int contadorFallos = 3;
        int con = 2 + contadorFallos;
        int altura = 7 + vidas;
        String mensaje = "AHORCADO";
        String [][] ahorcado = new String[altura][base];
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == (altura - 1) || j == 0 || j == (base - 1)){// CREA EL CONTORNO DEL JUEGO...
                    ahorcado [i][j] = "# ";
                } else if (i > 1 && j == 5 ){//CREA EL POSTE EN VERTICAL
                    ahorcado [i][j] = "|| ";
                } else if (i == 1 && (j > 5 && j < 13)){//CREA EL POSTE EN HORIZONTAL
                    ahorcado [i][j] = "= ";
                } else if ((i > 1 && i < con) && j == 12) {//CREA LA CUERDA DEL AHORCADO
                    ahorcado [i][j] = "|";
                } else if (i == altura -5 && j == 12) {//CREA LA CARITA DEL LADO IZQUIERDO
                    ahorcado [i][j] = "°)";
                } else if (i == altura - 5 && j == 11) {//CREA LA CARITA DEL LADO DERECHO
                    ahorcado [i][j] = "(°-";
                } else if (i == altura - 4 && j == 13) {//CREA EL TORSO DE LADO DERECHO
                    ahorcado [i][j] = "]";
                } else if (i == altura - 4 && j == 12) {//CREA EL TORSO DE LADO IZQUIERDO
                    ahorcado [i][j] = "[-";
                } else if (i == altura - 4 && j == 11) {//CREA EL BRAZO IZQUIERDO
                    ahorcado [i][j] = "/";
                } else if (i == altura - 3 && j == 11) {//CREA LA PIERNA IZQUIERDA
                    ahorcado [i][j] = " J.";
                } else if (i == altura - 3 && j == 12) {//CREA LA PIERNA DERECHA
                    ahorcado [i][j] = "l";
                } else if (i == altura - 4 && j == 14) {//CREA EL BRAZI DERECHO
                    ahorcado [i][j] = "l  ";
                }  else{
                    ahorcado [i][j] = "  ";//IMPRIME ESPACIOS VACIOS...
                }
            }
        }
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(ahorcado[i][j]);
            }
            System.out.println("");
        }

    }
}
