import models.Circuferencia;

public class Main {
    public static void main(String[] args) {
        Circuferencia circufeencia1 = new Circuferencia(5.5);
        circufeencia1.crearCircunferencia();
        System.out.println("el area es: " + circufeencia1.area());
        System.out.println("el perimetro es: " + circufeencia1.perimetro());

    }
}