package models;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Persona {
    private String name;
    private LocalDate birthDate;
    private List<Persona> personas = new ArrayList<>();

    public Persona() {
    }

    public Persona(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void crearPersona() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona: ");
        name = scan.nextLine().toUpperCase();
        System.out.println("Ingrese la fecha de nacimiento de la persona: ");
        System.out.println("Ingrese el año: ");
        int year = scan.nextInt();
        System.out.println("Ingrese el mes: ");
        int month = scan.nextInt();
        System.out.println("Ingrese el día: ");
        int day = scan.nextInt();
        birthDate = LocalDate.of(year, month, day);
        Persona persona = new Persona(name, birthDate);
        personas.add(persona);
    }

    public void calcularEdad(String nombre) {
        Persona persona = buscarPersona(nombre);
        if (persona == null) {
            System.out.println("Usuario no encontrado...");
            return;
        }
        Period period = Period.between(birthDate, LocalDate.now());
        System.out.printf("El usuario tiene %d años, %d meses, %d dias,%n", period.getYears(), period.getMonths(), period.getDays());

    }

    public Persona buscarPersona(String nombre) {
        Persona personaEncontrada = null;
        for (Persona persona : this.personas) {
            if (persona.name.equals(nombre)) {
                System.out.println("Usuario encontrado...");
                personaEncontrada = persona;
            }
        }
        return personaEncontrada;
    }

    public void menorQua(String nombre) {
        Scanner scan = new Scanner(System.in);
        Persona persona = buscarPersona(nombre);
        if (persona == null) {
            System.out.println("Usuario no encontrado...");
            return;
        }
        System.out.println("Ingrese una edad para comparar: ");
        int edadComparar = scan.nextInt();
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechalimite = fechaActual.minusYears(edadComparar);

        if (persona.birthDate.isBefore(fechalimite)) {
            System.out.println("La persona es mayor que la edad ingresada: " + edadComparar);
        } else {
            System.out.println("La persona es menor que la edad ingresada: " + edadComparar);
        }
    }

    public void imprimirPersona(String nombre) {
        Persona persona = buscarPersona(nombre);
        if (persona == null) {
            System.out.println("Usuario no encontrado...");
            return;
        }
        System.out.println(persona);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", personas=" + personas +
                '}';
    }
}
