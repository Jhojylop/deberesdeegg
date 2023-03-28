import Entidad.Persona;
import Servicio.PersonaServicio;

public class Main {
    public static void main(String[] args) {

        Persona primeraPersona = new Persona("jhojan",23,170);

        Persona segundaPersona = new Persona();

        primeraPersona.setNombre("Alejandro");
        System.out.println(primeraPersona.getNombre());
        PersonaServicio prsServicio = new PersonaServicio();
        Persona terceraPersona = prsServicio.crearPersona();
        PersonaServicio impServicio = new PersonaServicio();

        impServicio.imprimrPesona(primeraPersona);
        impServicio.imprimrPesona(terceraPersona);
        primeraPersona.imprimir(primeraPersona);
    }
}