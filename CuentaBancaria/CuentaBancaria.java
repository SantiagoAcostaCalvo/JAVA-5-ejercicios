package CuentaBancaria;

public class CuentaBancaria {
    public String titular;
    public String numeroCuenta;
    public String tipoCuenta;
    public double saldo;
    public String mostrarMensaje() {
        return "Cuenta a nombre de " + titular + " con número " + numeroCuenta +
                " de tipo " + tipoCuenta + " ha sido registrada con un saldo de $" + saldo;
    }
}
