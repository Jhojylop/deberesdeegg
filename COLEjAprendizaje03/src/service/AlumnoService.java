package service;

import models.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoService {
    private List<Alumno> alumnos = new ArrayList<>();
    private final Scanner scan = new Scanner(System.in);
    private final int notasTotales = 3;

    public void crearAlumno() {
        Alumno alumno = new Alumno();
        System.out.println("Ingrese el nombre del alumno: ");
        alumno.setNombre(scan.next().toLowerCase());
        System.out.println("Ingrese las notas del alumno: ");
        for (int i = 0; i < notasTotales; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + ":");
            alumno.getNotas().add(scan.nextDouble());
        }
        alumnos.add(alumno);
        System.out.println("Alumno creado con exito...");
    }

    public void calcularNotaFinal(String alumnoBuscar) {
        Alumno alumno = buscarAlumno(alumnoBuscar);
        if (alumno == null) {
            System.out.println("Alumno no encontrado");
        } else {
            double promedio = sumaNotas(alumno) / notasTotales;
            System.out.println("EL promedio del estudiante "
                                + alumnoBuscar + " es : "
                                + String.format("%.2f", promedio));
        }
    }

    public double sumaNotas(Alumno alumnoBuscado) {
        double sumaNotas = 0;
        for (Double notas : alumnoBuscado.getNotas()) {
            sumaNotas += notas;
        }
        return sumaNotas;
    }

    public Alumno buscarAlumno(String alumnoBuscar) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equals(alumnoBuscar)) {
                return alumno;
            }
        }
        return null;
    }

    public void mostrarAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

}
