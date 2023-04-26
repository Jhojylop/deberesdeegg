package service;

import models.AhorcadoDos;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class JuegoService {
    private Scanner scan = new Scanner(System.in);
    AhorcadoDos juego = new AhorcadoDos();
    private String[] impresionPantalla;
    private int vidasEstaticas;
    private int contadorFallos;

    public void crearDatosJuego() {
        int opcion;
        do {
            System.out.println("Escoga una opción: ");
            System.out.println("1. FÁCIL...");
            System.out.println("2. MEDIO...");
            System.out.println("3. DIFÍCIL...");
            opcion = scan.nextInt();
        } while (opcion < 1 || opcion > 3);
        this.juego.escogerPalabra(opcion);
        juego.rellenarPalabra();
        juego.calcularVidas();
        vidasEstaticas = juego.getVidas();
        contadorFallos = 0;
        System.out.println("La palabra asignada tiene: " + juego.getPalabraEscogidaNormal().length() + " letras");
        System.out.println("Se le han asignado: " + juego.getVidas() + " vidas...");
        impresionPantalla = new String[juego.getPalabraEscogida().length];
        for (int i = 0; i < juego.getPalabraEscogida().length; i++) {
            impresionPantalla[i] = "_";
        }
        juego.setPalabrasEncontradas(0);
    }

    public void compararLetra(String letra) {
        int repetidas = 0;
        for (int i = 0; i < juego.getPalabraEscogida().length; i++) {
            if (juego.getPalabraEscogida()[i].equals(letra)) {
                juego.getPalabraEscogida()[i] = " ";
                impresionPantalla[i] = letra;
                repetidas++;
            }
        }
        if (repetidas > 0) {
            System.out.println("La letra ingresada si se encuentra en la palabra escondida y se repite: " + repetidas + " veces...");
            System.out.println(Arrays.toString(impresionPantalla));
            imprimirMatrizJuego();
            System.out.println("Le quedan " + juego.getVidas() + " vidas...");
        } else {
            System.out.println("La letra ingresada no se encuentra en la palabra ingresada...");
            contadorFallos++;
            System.out.println(Arrays.toString(impresionPantalla));
            imprimirMatrizJuego();
            System.out.println("Ha perdido una vida...");
            juego.restarVidas();
            if (juego.getVidas() == 0) {
                System.out.println("+++++ | = | || || |===| |===| |===| | = | |===| |===|+++++");
                System.out.println("+++++ |===| ||=|| |   | |==/  ||    |===| |   | |   |+++++");
                System.out.println("+++++ |= =| || || |===| |  R  |===| |= =| |==/  |===|+++++");
            }
            System.out.println("Le quedan " + juego.getVidas() + " vidas...");
        }
        juego.aumentarEncontradas(repetidas);
    }

    public void encontradas() {
        System.out.println("Tiene encontradas " + juego.getPalabrasEncontradas() + " letras de la palabra escondida..");
        if (juego.getPalabrasEncontradas() == juego.getPalabraEscogida().length) {
            System.out.println("HA GANADO...");
            juego.setPalabrasEncontradas(0);
            juego.setVidas(0);
        } else if (juego.getPalabrasEncontradas() >= 0 || juego.getPalabrasEncontradas() < juego.getPalabraEscogida().length) {
            System.out.println("Le quedan por encontrar " + (juego.getPalabraEscogida().length - juego.getPalabrasEncontradas()) + " letras...");
            if (juego.getVidas() == 0) {
                System.out.println("HA PERDIDO LA VIDA COMPA :V");
                System.out.println("La palabra era: " + juego.getPalabraEscogidaNormal());
            }
        }
    }

    public void imprimirMatrizJuego() {
        int base = 25;
        int vidas = vidasEstaticas;
        int con = 2 + contadorFallos;
        int altura = 7 + vidas;
        String[][] ahorcado = new String[altura][base];
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == (altura - 1) || j == 0 || j == (base - 1)) {// CREA EL CONTORNO DEL JUEGO...
                    ahorcado[i][j] = "# ";
                } else if (i > 1 && j == 5) {//CREA EL POSTE EN VERTICAL
                    ahorcado[i][j] = "|| ";
                } else if (i == 1 && (j > 5 && j < 13)) {//CREA EL POSTE EN HORIZONTAL
                    ahorcado[i][j] = "= ";
                } else if ((i > 1 && i < con) && j == 12) {//CREA LA CUERDA DEL AHORCADO
                    ahorcado[i][j] = "|";
                } else if (i == altura - 5 && j == 12) {//CREA LA CARITA DEL LADO IZQUIERDO
                    ahorcado[i][j] = "°)";
                } else if (i == altura - 5 && j == 11) {//CREA LA CARITA DEL LADO DERECHO
                    ahorcado[i][j] = "(°-";
                } else if (i == altura - 4 && j == 13) {//CREA EL TORSO DE LADO DERECHO
                    ahorcado[i][j] = "]";
                } else if (i == altura - 4 && j == 12) {//CREA EL TORSO DE LADO IZQUIERDO
                    ahorcado[i][j] = "[-";
                } else if (i == altura - 4 && j == 11) {//CREA EL BRAZO IZQUIERDO
                    ahorcado[i][j] = "/";
                } else if (i == altura - 3 && j == 11) {//CREA LA PIERNA IZQUIERDA
                    ahorcado[i][j] = " J.";
                } else if (i == altura - 3 && j == 12) {//CREA LA PIERNA DERECHA
                    ahorcado[i][j] = "l";
                } else if (i == altura - 4 && j == 14) {//CREA EL BRAZI DERECHO
                    ahorcado[i][j] = "l  ";
                } else {
                    ahorcado[i][j] = "  ";//CREA ESPACIOS VACIOS...
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

    public void iniciarJuego() {
        crearDatosJuego();
        do {
            System.out.println("============================");
            System.out.println("Ingrese una letra...");
            compararLetra(scan.next());
            encontradas();
        } while (juego.getVidas() != 0);
    }
}
