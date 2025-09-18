package ut05OrientacionObjetos.sesion13.Ej01HerenciaBasica;

public class Coche extends Vehiculo {
    private final int caballos;

    public Coche(String nombre, int caballos) {
        super(nombre);
        this.caballos = caballos;
    }

    public int getCaballos() { return this.caballos; }

    @Override
    public double calcularVelocidadMaxima() {
        final double K = 38.8;
        return K * Math.cbrt(caballos);
    }

    @Override
    public double consumo() {
        return 3.8 + 0.12 * Math.pow(caballos, 0.7);
    }
}
