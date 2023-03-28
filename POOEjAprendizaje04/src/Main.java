import models.Rectangulo;

public class Main {
    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.crearRectangulo();
        System.out.println("La superficie es: "+rectangulo1.superficie());
        System.out.println("El perimetro es: "+rectangulo1.perimetro());
        System.out.println("este es su rectangulo :3 ");
        rectangulo1.impresionRectangulo();

    }
}