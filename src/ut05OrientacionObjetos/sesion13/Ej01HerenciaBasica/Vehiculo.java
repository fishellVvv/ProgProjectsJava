package ut05OrientacionObjetos.sesion13.Ej01HerenciaBasica;

public class Vehiculo {
    protected String nombre;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return this.nombre; }

    public double calcularVelocidadMaxima() {
        System.out.print("No implementado ");
        return 0;
    }

    public double consumo() {
        System.out.print("No implementado ");
        return 0;
    }
}
