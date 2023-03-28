package cuenta;

public class Cuenta {
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual = 0;
    private double interes;

    public Cuenta(int numeroCuenta, long dniCliente, double interes, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.interes = interes;
        this.saldoActual = saldoActual;
    }

    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;

        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }


    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
}