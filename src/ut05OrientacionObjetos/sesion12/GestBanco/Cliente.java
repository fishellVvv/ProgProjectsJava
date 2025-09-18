package ut05OrientacionObjetos.sesion12.GestBanco;

public class Cliente {
    private final String nombre;
    private final String dni;
    private double saldo;

    public Cliente(String nombre, String dni, double saldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldo;
    }

    public String getNombre() { return this.nombre; }
    public String getDni() { return this.dni; }
    public double getSaldo() { return this.saldo; }

    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }

    public boolean retirar(double cantidad) {
        if(this.saldo >= cantidad){
            this.saldo -= cantidad;
            return true;
        } return false;
    }

    public void mostrarInfo() {
        System.out.printf("%s (DNI: %s) | Saldo: %.2f €", this.nombre, this.dni, this.saldo);
    }
}
