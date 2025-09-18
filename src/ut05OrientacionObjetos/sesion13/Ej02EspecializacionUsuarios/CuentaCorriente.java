package ut05OrientacionObjetos.sesion13.Ej02EspecializacionUsuarios;

public class CuentaCorriente extends Cuenta {
    private final double limiteDescubierto;

    public CuentaCorriente(String titular, double saldo, double limiteDescubierto) {
        super(titular, saldo);
        this.limiteDescubierto = limiteDescubierto;
    }

    public double getLimiteDescubierto() { return this.limiteDescubierto; }

    @Override
    public String mostrarDatos() {
        return "Titular: " + titular + " Saldo: " + saldo + " € Límite descubierto: " + limiteDescubierto + " €";
    }
}
