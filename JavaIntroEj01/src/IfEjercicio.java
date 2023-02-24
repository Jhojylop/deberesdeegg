import models.Car;

import java.util.Scanner;

public class IfEjercicio {

    public static void main(String[] args) {

        int sumResult = sum(10, 12);
        Car suzuki = new Car(1999, "Chevrolet", "Rojo");
        System.out.println(suzuki.getYear());
        suzuki.setYear(2001);
        System.out.println(suzuki.getYear());
        System.out.println("he vuelto");
        System.out.println(sumResult);
    //inicio de deberes con if
        System.out.println("ingrese dos numeros enteros: ");
        Scanner leyendo= new Scanner(System.in);
        int numero1= leyendo.nextInt();
        int numero2= leyendo.nextInt();
        if (numero1>25||numero2>25){
            System.out.println("alguno de los numeros ingresados es mayor a 25");
        } else{
            System.out.println("ninguno de los numeros es mayor a 25");
        }

    }

    public static int sum(int value1, int value2) {
        return value1 + value2;
    }
}
