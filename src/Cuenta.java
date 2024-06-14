abstract class Cuenta {
    protected String numeroCuenta;
    protected Usuario usuario;
    protected double saldo;

    public Cuenta(String numeroCuenta, Usuario usuario, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.usuario = usuario;
        this.saldo = saldo;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void retirar(double monto);
    public abstract void depositar(double monto);
    public abstract void transferir(Cuenta destino, double monto);

}
