package ut10ClasesAvanzada.sesion13.Ej01HerenciaBasica;

public class Coche extends Vehiculo {
    private final int caballos;

    public Coche(String nombre, int caballos) {
        super(nombre);
        this.caballos = caballos;
    }

    @Override
    public double calcularVelocidadMaxima() {
        return this.caballos * 2.0;
    }

    @Override
    public double consumo() {
        return this.caballos * 0.05;
    }
}
