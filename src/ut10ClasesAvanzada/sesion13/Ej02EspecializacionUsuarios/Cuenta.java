package ut10ClasesAvanzada.sesion13.Ej02EspecializacionUsuarios;

public class Cuenta {
    protected String titular;
    protected double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() { return this.titular; }
    public double getSaldo() { return this.saldo; }

    public String mostrarDatos() {
        System.out.print("No implementado ");
        return "-";
    }
}
