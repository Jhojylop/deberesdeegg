package models;//paquete

public class Perro {//clase
    private String nombre; //atrivutos
    private int edad; //atrivutos
    private String raza; //atrivuto
    private String sexo; //atrivuto
    private double peso;//atrivuto
    private Amo amo1;
    private Amo amo2;

    public Amo getAmo1() {
        return amo1;
    }

    public void setAmo1(Amo amo1) {
        this.amo1 = amo1;
    }

    public Amo getAmo2() {
        return amo2;
    }

    public void setAmo2(Amo amo2) {
        this.amo2 = amo2;
    }

    //constructor lleno
    public Perro(String nombre, int edad, String raza, String sexo, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.sexo = sexo;
        this.peso = peso;
    }

    //constructor con algunos parametros
    public Perro(String nombre, int edad, String raza, Amo amo1) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.amo1 = amo1;
    }

    //constructor vacio
    public Perro() {
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
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

    // metodo llenar
    public void llenarPerro(String nombre, int edad, String raza, String sexo, double peso) {
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;

    }

    //metodo mostrar
    public void mostrarPerro() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad del perro es: " + edad);
        System.out.println("La raza del perro es:" + raza);
        System.out.println("El sexo del perro es: " + sexo);
        System.out.println("El peso del perro es: " + peso);
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", amo1=" + amo1 +
                ", amo2=" + amo2 +
                '}';
    }
}