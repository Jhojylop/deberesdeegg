package models;

import java.util.Scanner;

public class Libro {
    //    Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//    Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//    constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//    luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//    numero de páginas.
    private int ibsn;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public int getIbsn() {
        return ibsn;
    }

    public void setIbsn(int ibsn) {
        this.ibsn = ibsn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Libro() {
    }

    public Libro(int ibsn, String titulo, String autor, int numeroPaginas) {
        this.ibsn = ibsn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void cargarLibro() {
        Scanner leyendo = new Scanner(System.in);
        System.out.println("Ingrese el ISBN del libro: ");
        ibsn = leyendo.nextInt();
        leyendo.nextLine();
        System.out.println("Ingrese el titulo del libro: ");
        titulo = leyendo.nextLine();
        System.out.println("Ingrese el nombre del Autor del libro: ");
        autor = leyendo.nextLine();
        System.out.println("Ingrese el numero de páginas del libro: ");
        numeroPaginas = leyendo.nextInt();

    }

    public void informarLibro() {
        System.out.println("el IBSN es : " + ibsn);
        System.out.println("el Titulo es : " + titulo);
        System.out.println("el Autor es: " + autor);
        System.out.println("su número de páginas es: " + numeroPaginas);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ibsn=" + ibsn +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
