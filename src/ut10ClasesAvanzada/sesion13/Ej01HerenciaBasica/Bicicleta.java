package ut10ClasesAvanzada.sesion13.Ej01HerenciaBasica;

public class Bicicleta extends Vehiculo{
    private final int numeroMarchas;

    public Bicicleta(String nombre, int numeroMarchas) {
        super(nombre);
        this.numeroMarchas = numeroMarchas;
    }

    @Override
    public double calcularVelocidadMaxima() {
        return this.numeroMarchas * 5.0;
    }

    @Override
    public double consumo() {
        return this.numeroMarchas * 10.0;
    }
}
