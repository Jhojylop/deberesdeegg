package Entidad;

public class Persona {
    public String nombre;
    public int edad;
    public double altura;

    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void imprimir(Persona persona){

        System.out.println("nombre"+this.nombre);
    }
}
