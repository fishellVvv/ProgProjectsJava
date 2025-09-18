package ut05OrientacionObjetos.sesion13.Ej01HerenciaBasica;

public class Bicicleta extends Vehiculo{
    private final int numeroMarchas;

    public Bicicleta(String nombre, int numeroMarchas) {
        super(nombre);
        this.numeroMarchas = numeroMarchas;
    }

    public int getNumeroMarchas() { return this.numeroMarchas; }

    @Override
    public double calcularVelocidadMaxima() {
        return 18 + 2.2 * numeroMarchas;
    }

    @Override
    public double consumo() {
        return 0;
    }
}
