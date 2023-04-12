import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese  el año: ");
        int year = scan.nextInt();
        System.out.println("Ingrese el mes: ");
        int month = scan.nextInt();
        System.out.println("Ingrese el dia: ");
        int day = scan.nextInt();
        LocalDate date = LocalDate.of(year,month,day);
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        Period period = Period.between(date,currentDate);
        System.out.printf("Han transcurrido %d años, %d meses, %d dias, desde la fecha ingresada.%n ",period.getYears(),period.getMonths(),period.getDays());

    }
}