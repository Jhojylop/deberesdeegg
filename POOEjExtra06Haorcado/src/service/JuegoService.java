package service;

import models.Juego;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class JuegoService {
    private Scanner scan = new Scanner(System.in);
    Juego juego = new Juego();
    private int vidasEstaticas;
    private int contadorFallos;

    private void cargarDatosJuego() {
        System.out.println("Ingrese la palabra que se usará para jugar...");
        juego.setPalabraIngresada(scan.next().toLowerCase());
        juego.rellenarPalabra();
        juego.vectorPantalla();
        System.out.println("Ingrese las vidas que desea para jugar...");
        vidasEstaticas = scan.nextInt();
        juego.setVidas(vidasEstaticas);
        juego.mostrarLongitudPalabra();
        System.out.println("El JUEGO SE HA INICIALIZADO CON: " + juego.getVidas() + " vidas...");
        contadorFallos = 0;
    }

    private void buscarLetra(String letra) {
        String letra2 = letra.substring(0, 1);
        int contadorRepetidas = 0;
        for (int i = 0; i < juego.getPalabraLlenada().length; i++) {
            if (juego.getPalabraLlenada()[i].equals(letra2)) {
                juego.getPalabraLlenada()[i] = "_";
                juego.getVectorPantalla()[i] = letra2;
                contadorRepetidas++;
            }
        }
        if (contadorRepetidas > 0) {
            System.out.println("La letra ingresada si pertenece a la palabra y se encuentra: " + contadorRepetidas +
                    " veces repetida en la palabra escondida...");
            System.out.println("A continuacion vera como va la palabra...");
            imprimirMatrizJuego();
            System.out.println(Arrays.toString(juego.getVectorPantalla()));
        } else {
            System.out.println("La letra ingresada no pertenece a la palabra...");
            System.out.println("Usted ha perdido un vida...");
            System.out.println("A continuacion vera como va la palabra...");
            contadorFallos++;
            imprimirMatrizJuego();
            juego.restarVidas();
            if (juego.getVidas() == 0) {
                System.out.println("+++++ | = | || || |===| |===| |===| | = | |===| |===|+++++");
                System.out.println("+++++ |===| ||=|| |   | |==/  ||    |===| |   | |   |+++++");
                System.out.println("+++++ |= =| || || |===| |  R  |===| |= =| |==/  |===|+++++");
            }
            System.out.println(Arrays.toString(juego.getVectorPantalla()));
        }
        //pilas con el uso del get.encontradas es diferente a las veces q se repite la letra cuando se la lee.
        juego.contadorEncontradas(contadorRepetidas);
    }

    public void mostrarIntentos() {

        System.out.println("Usted tiene encontradas actualmente : " + juego.getEncontradas() + " letras de las: " +
                juego.getPalabraIngresada().length() + " que tiene la palabra...");
        if (juego.getEncontradas() == juego.getPalabraIngresada().length()) {
            System.out.println("ha llenado todas las letras de la palabra FELICIDADES...");
            juego.setEncontradas(0);
            juego.setVidas(0);
        } else if (juego.getEncontradas() >= 0 || juego.getEncontradas() < juego.getPalabraIngresada().length()) {
            System.out.println("Aun quedan " + (juego.getPalabraIngresada().length() - juego.getEncontradas()) +
                    " letras por encontrar...");
            System.out.println("le quedan : " + juego.getVidas() + " vidas...");
            if (juego.getVidas() == 0){
                System.out.println("USTED HA PERDIDO LA VIDA :V");
                System.out.println("la palabra era: "+juego.getPalabraIngresada());
            }
        }

    }

    public void jugar() {
        cargarDatosJuego();
        do {
            System.out.println("=================================================");
            System.out.println("Ingrese una letra para buscar");
            String letra = scan.next();
            buscarLetra(letra);
            mostrarIntentos();
        } while (juego.getVidas() != 0);
    }
    public void imprimirMatrizJuego(){
        int base = 25;
        int vidas = vidasEstaticas;
        int con = 2 + contadorFallos;
        int altura = 7 + vidas;
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
                    ahorcado [i][j] = "  ";//CREA ESPACIOS VACIOS...
                }
            }
        }
        for (int i = 0; i < altura; i++) {//MUESTRA LA MATRIZ POR PANTALLA...
            for (int j = 0; j < base; j++) {
                System.out.print(ahorcado[i][j]);
            }
            System.out.println("");
        }

    }

}
