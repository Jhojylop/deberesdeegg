import models.Libro;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.cargarLibro();
        System.out.println("-----------------------");
        libro1.informarLibro();
        System.out.println("-----------------------");
        System.out.println(libro1.toString());
    }
}