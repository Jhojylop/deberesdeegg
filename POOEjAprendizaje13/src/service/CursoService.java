package service;

import models.Curso;

import java.util.Scanner;

public class CursoService {
    Curso curso = new Curso();
    public void cargarAlumnos (){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < curso.getAlumnos().length ; i++) {
            System.out.println("Ingrese el nombre del alumno numero"+(i+1));
            curso.getAlumnos()[i] = leer.nextLine();
        }
    }
    public void crearCurso (){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del curso: ");
        curso.setNombreCurso(leer.nextLine());
        System.out.println("Ingrese la cantidad de horas por día: ");
        curso.setCantidadHorasXDias(leer.nextDouble());
        System.out.println("Ingrese la cantidad de dias por semana: ");
        curso.setDiaXSemana(leer.nextDouble());
        leer.nextLine();
        System.out.println("Ingrese el turno: ");
        curso.setTurno(leer.nextLine());
        System.out.println("Ingrese el precio por hora: ");
        curso.setPrecioXHora(leer.nextDouble());
        System.out.println("Ingrese los alumnos: ");
        cargarAlumnos();
    }
    public void calcularGanancias (){
        System.out.println("el precio total es: " + curso.getCantidadHorasXDias() * curso.getPrecioXHora() * curso.getDiaXSemana() * 5);

    }
}
