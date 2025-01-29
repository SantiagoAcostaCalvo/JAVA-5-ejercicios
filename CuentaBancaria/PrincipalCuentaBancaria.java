package CuentaBancaria;

public class PrincipalCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        cuentaBancaria.titular = "Juan Pérez";
        cuentaBancaria.numeroCuenta = "123456789";
        cuentaBancaria.tipoCuenta = "Ahorros";
        cuentaBancaria.saldo = 1500.75;
        System.out.println(cuentaBancaria.mostrarMensaje());
    }
}
