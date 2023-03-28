package servicio;

import models.Perro;

public class PerroServicio {
    public void mostrarPerro(Perro perro){
        System.out.println("El nombre es: " + perro.getNombre());
        System.out.println("La edad del perro es: " +  perro.getEdad());
        System.out.println("La raza del perro es:" + perro.getRaza());
        System.out.println("El sexo del perro es: " + perro.getSexo());
        System.out.println("El peso del perro es: " + perro.getPeso());
    }
}
