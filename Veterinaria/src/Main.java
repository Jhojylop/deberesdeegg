import models.Amo;
import models.Perro;
import servicio.PerroServicio;

public class Main {
    public static void main(String[] args) {
        PerroServicio servicio = new PerroServicio();
        Amo amo1 = new Amo("jhojan",24);
        Perro primerPerro = new Perro("yummi",5,"labrador", new Amo("jhojan",24));
        Perro cuartoPerro = new Perro("yummi",5,"labrador", amo1);
        System.out.println(primerPerro);
        System.out.println(cuartoPerro);
        servicio.mostrarPerro(primerPerro);
        Perro segundoPerro = new Perro();
        Perro tercerPerro = new Perro("dsa", 12, "Golden", "Mas",6.6);
        segundoPerro.setNombre("Pumardo");
        segundoPerro.llenarPerro("yummi",5,"labrador","masculino",5.5);
        primerPerro.mostrarPerro();
        segundoPerro.mostrarPerro();
        System.out.println("el perro bueno es "+primerPerro.getNombre());

    }
}