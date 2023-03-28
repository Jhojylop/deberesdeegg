package cuenta;

import java.util.ArrayList;
import java.util.List;

public class CuentaService {

    private List<Cuenta> cuentas = new ArrayList<>();


    public CuentaService() {
        cuentas.add(new Cuenta(1, 301971495, 0.5, 1000));

        cuentas.add(new Cuenta(2, 401749817, 0.5, 2000));
    }


    public void crearCuenta(int numeroCuenta, long dniCliente, double saldoInicial) {

        Cuenta cuenta = new Cuenta(numeroCuenta, dniCliente, saldoInicial);
        cuentas.add(cuenta);

        System.out.println("Cuenta " + numeroCuenta + " creada con exito");
    }

    public void consultarDatosCuenta(int numeroCuenta) {
        for (Cuenta cuenta : cuentas) {

            if (cuenta.getNumeroCuenta() == numeroCuenta) {

                System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());

                System.out.println("DNI del cliente: " + cuenta.getDniCliente());

                System.out.println("Saldo actual: " + cuenta.getSaldoActual());

                System.out.println("Interes: " + cuenta.getInteres());

                System.out.println("----------------------------");
                break;
            }
        }
    }

    public void listarCuentas() {

        for (Cuenta cuenta : cuentas) {
            System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());

            System.out.println("DNI del cliente: " + cuenta.getDniCliente());
            System.out.println("Saldo actual: " + cuenta.getSaldoActual());
            System.out.println("Interes: " + cuenta.getInteres());
            System.out.println("----------------------------");
        }
    }
}
}
