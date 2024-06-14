public class PagoServicio extends Transaccion{
    private double monto;

    public PagoServicio(Cuenta cuenta, double monto) {
        super(cuenta);
        this.monto = monto;
    }
    @Override
    public void ejecutar() {
        cuenta.retirar(monto);
        System.out.println("Pago de servicio de " + monto + " realizado.");
    }
}
