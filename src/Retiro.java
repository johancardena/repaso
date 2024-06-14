public class Retiro extends Transaccion {
    private double monto;

    public Retiro(Cuenta cuenta, double monto) {
        super(cuenta);
        this.monto = monto;
    }
    @Override
    public void ejecutar(){
        cuenta.retirar(monto);
    }
}
