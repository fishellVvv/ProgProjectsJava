package ut05OrientacionObjetos.sesion13.Ej02EspecializacionUsuarios;

public class CuentaAhorro extends Cuenta {
    private final double interesAnual;

    public CuentaAhorro(String titular, double saldo, double interesAnual) {
        super(titular, saldo);
        this.interesAnual = interesAnual;
    }

    public double getInteresAnual() { return this.interesAnual; }

    @Override
    public String mostrarDatos() {
        return "Titular: " + this.titular + " Saldo: " + this.saldo +
                " € Interés anual: " + this.interesAnual + " %";
    }
}
