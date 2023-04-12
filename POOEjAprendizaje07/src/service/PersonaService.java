package service;

import models.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaService {
    List<Persona> personas = new ArrayList<>();

    public void crearPersona(String nombre, int edad, String sexo, double peso, double altura) {
        Persona persona = new Persona(nombre, edad, sexo, peso, altura);
        personas.add(persona);
        System.out.println("El usuario: " + persona.getNombre() + " ha sido creado con éxito...");
    }

    public void calcularImc(String nombreVerificar) {
        Persona persona = buscarPersona(nombreVerificar);
        if (persona == null) {
            System.out.println("usuario no encontrado: ");
            return;
        }
        if (persona.calcularIm() == -1) {
            System.out.println("el usuario esta con bajo peso...");
        } else if (persona.calcularIm() == 0) {
            System.out.println("el usuario esta en el peso ideal...");
        } else {
            System.out.println("el usario tiene sobrepeso...");
        }
    }

    public void medidorEdad(String nombreVerificar) {
        Persona persona = buscarPersona(nombreVerificar);
        if (persona == null) {
            System.out.println("usuario no encontrado: ");
        }

        if (persona.calcularEdad()) {
            System.out.println("El usuario es mayor de edad");
        } else {
            System.out.println("El usario es menor de edad");
        }
    }

    public Persona buscarPersona(String nombreVerificar) {
        Persona personaEncontrada = null;
        for (Persona persona : this.personas) {
            if (nombreVerificar.equals(persona.getNombre())) {
                System.out.println("Usuario encontrado...");
                personaEncontrada = persona;
                break;
            }

        }
        return personaEncontrada;
    }

    public void mostrarEstadistica() {
        int contadorMayorEdad = 0;
        int contadorMenorEdad = 0;
        int contadorBajoPeso = 0;
        int contadorSobrePeso = 0;
        int contadorPesoIdeal = 0;
        int contadorTotal = 0;
        for (Persona persona : this.personas) {
            if (persona.calcularEdad()) {
                contadorMayorEdad++;
            } else {
                contadorMenorEdad++;
            }
            if (persona.calcularIm() == -1) {
                contadorBajoPeso++;
            } else if (persona.calcularIm() == 0) {
                contadorPesoIdeal++;
            } else
            contadorTotal++;
        }
        int porcentajeMayorEdad = (contadorMayorEdad * 100) / contadorTotal;
        int porcentajeMenorEdad = (contadorMenorEdad * 100) / contadorTotal;
        int porcentajeBajoPeso = (contadorBajoPeso * 100) / contadorTotal;
        int porcentajePesoIdeal = (contadorPesoIdeal * 100) / contadorTotal;
        int porcentajeSobrePeso = (contadorSobrePeso * 100) / contadorTotal;
        System.out.println("El porcentaje de personas mayores de edad, de todas las personas actualmente ingresadas es: " + porcentajeMayorEdad + "%");
        System.out.println("El porcentaje de personas menores de edad, de todas las personas actualmente ingresadas es: " + porcentajeMenorEdad + "%");
        System.out.println("El porcentaje de personas con Bajo peso, de todas las personas actualmente ingresadas es: " + porcentajeBajoPeso + "%");
        System.out.println("El porcentaje de personas con Peso Ideal, de todas las personas actualmente ingresadas es: " + porcentajePesoIdeal + "%");
        System.out.println("El porcentaje de personas con Sobrepeso, de todas las personas actualmente ingresadas es: " + porcentajeSobrePeso + "%");
    }


}
