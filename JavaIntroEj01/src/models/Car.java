package models;

public class Car {
    // Atributos
    private int year;
    private String marca;
    private String color;

    // Metodos

    public Car(int year, String marca, String color) {
        this.year = year;
        this.marca = marca;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private void apagar() {
        encender();
    }

    public void encender() {
        System.out.println("El auto se ha encendido");
    }
}
