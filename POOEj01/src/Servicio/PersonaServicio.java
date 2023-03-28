package Servicio;

import Entidad.Persona;

import java.util.Scanner;

public class PersonaServicio {
    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in);
        Persona personaCompleta = new Persona();
        System.out.println("ingrese el nombre");
        personaCompleta.setNombre(leer.next());
        return personaCompleta;
    }
    public void  imprimrPesona(Persona persona){
        System.out.println("nombre: "+persona.getNombre());

    }
}
