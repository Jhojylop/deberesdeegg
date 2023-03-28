import models.Operacion;

public class Main {
    public static void main(String[] args) {

        Operacion operacion1 = new Operacion();
        operacion1.crearOperacion();
        System.out.println("la suma es: "+operacion1.sumar());
        System.out.println("la resta es: "+operacion1.restar());
        System.out.println("la multiplicación es: "+operacion1.multiplicar());
        System.out.println("la división es: "+operacion1.dividir());


}
}