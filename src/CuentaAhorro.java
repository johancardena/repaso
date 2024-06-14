public class CuentaAhorro extends Cuenta {
    public CuentaAhorro(String numeroCuenta, Usuario usuario, double saldo){
        super(numeroCuenta,usuario,saldo);
    }

    @Override
    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro de " + monto + " realizado. Saldo actual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para retiro.");
        }
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito de " + monto + " realizado. Saldo actual: " + saldo);
    }

    @Override
    public void transferir(Cuenta destino, double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            destino.depositar(monto);
            System.out.println("Transferencia de " + monto + " realizada a " + destino.getNumeroCuenta());
        } else {
            System.out.println("Saldo insuficiente para transferencia.");
        }
    }
}




