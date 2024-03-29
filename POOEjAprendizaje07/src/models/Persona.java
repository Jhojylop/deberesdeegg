package models;

public class Persona {
    /*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
    sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
    atributo, puede hacerlo. Los métodos que se implementarán son:
             Un constructor por defecto.
             Un constructor con todos los atributos como parámetro.
             Métodos getters y setters de cada atributo.*/
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public boolean calcularEdad(){
        int edadLimite = 18;
        if (this.edad < edadLimite) {
            return false;
        } else {
            return true;
        }
    }
    public int calcularIm(){
        double imc = this.peso / Math.pow(this.altura, 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
}
