import cuenta.CuentaService;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



    CuentaService cuentaService = new CuentaService();

    Scanner scanner = new Scanner(System.in);
    int opcion;

    do{
        opcion = imprimirMenu();
        switch (opcion) {


            case 1:
                System.out.println("Ingrese el numero de cuenta: ");
                int numeroCuenta = scanner.nextInt();
                System.out.println("Ingrese el dni del cliente: ");
                long dniCliente = scanner.nextLong();
                System.out.println("Ingrese el saldo inicial: ");
                double saldoInicial = scanner.nextDouble();
                cuentaService.crearCuenta(numeroCuenta, dniCliente, saldoInicial);
                break;

            case 2:
                System.out.println("Ingrese el saldo a ingresar: ");
                double saldoIngresar = Double.parseDouble(System.console().readLine());
                break;
            case 3:
                System.out.println("Ingrese el valor a retirar: ");
                double valorRetirar = Double.parseDouble(System.console().readLine());
                break;
            case 4:
                System.out.println("Ingrese el valor a retirar: ");
                double valorRetirarRapido = Double.parseDouble(System.console().readLine());
                break;
           /* case 5:

                consultarSaldo();
                break;*/

            case 6:
                System.out.println("Ingrese el numero de cuenta: ");
                int cuentaABuscar = scanner.nextInt();
                cuentaService.consultarDatosCuenta(cuentaABuscar);
                break;

            case 7:
                cuentaService.listarCuentas();
                break;
            case 8:
                System.out.println("Gracias por utilizar nuestros servicios");
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    } while(opcion!=8);
}

private static int imprimirMenu(){

        System.out.println("1. Crear cuenta");
        System.out.println("2. Ingresar saldo");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Retiro rapido");
        System.out.println("5. Consultar saldo");
        System.out.println("6. Consultar datos de la cuenta");
        System.out.println("7. Consultar todas las cuentas");
        System.out.println("8. Salir");
        System.out.println("Ingrese una opcion: ");
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }
}
