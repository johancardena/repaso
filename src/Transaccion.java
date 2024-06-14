abstract class Transaccion {
    protected Cuenta cuenta;

    public Transaccion(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    public abstract void ejecutar();
}
