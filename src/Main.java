
public class Main {
    public static void main(String[] args) {
        Usuario usuario1= new Usuario("juan lopes", "456789321");
        Cuenta cuentaCorriente = new CuentaCorriente("123456789",usuario1, 10000);
        Cuenta cuentaAhorro = new CuentaAhorro("654321", usuario1, 500.0);

        if (usuario1.verificarClave("456789321")){
            System.out.println("Clave verificada para " + usuario1.getNombre());

            Transaccion retiro = new Retiro(cuentaCorriente, 3500.0);
            retiro.ejecutar();
            Transaccion deposito = new Deposito(cuentaAhorro, 250.0);
            deposito.ejecutar();
            Transaccion transferencia = new Transferencia(cuentaCorriente, cuentaAhorro, 10.0);
            transferencia.ejecutar();
            Transaccion pagoServicio = new PagoServicio(cuentaCorriente, 60.0);
            pagoServicio.ejecutar();
        }else {
            System.out.println("Clave incorrecta.");
        }
    }
}