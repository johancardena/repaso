public class Transferencia extends Transaccion {
    private Cuenta destino;
    private double monto;

    public Transferencia(Cuenta cuenta, Cuenta destino, double monto) {
        super(cuenta);
        this.destino = destino;
        this.monto = monto;
    }
    @Override
    public void ejecutar() {
        cuenta.transferir(destino, monto);
    }
}
