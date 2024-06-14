public class Deposito extends Transaccion {
    private double monto;

    public Deposito(Cuenta cuenta, double monto) {
        super(cuenta);
        this.monto = monto;
    }
    @Override
    public void ejecutar() {
        cuenta.depositar(monto);
    }
}
