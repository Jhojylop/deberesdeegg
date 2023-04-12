import models.Puntos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el valor para el punto X1: ");
        double x1 = scan.nextDouble();
        System.out.println("Ingrese el valor para el punto Y1: ");
        double y1 = scan.nextDouble();
        System.out.println("Ingrese el valor para el punto X2: ");
        double x2 = scan.nextDouble();
        System.out.println("Ingrese el valor para el punto Y2: ");
        double y2 = scan.nextDouble();
        Puntos puntos = new Puntos(x1, x2, y1, y2);
        puntos.calcularDistancia();

    }
}