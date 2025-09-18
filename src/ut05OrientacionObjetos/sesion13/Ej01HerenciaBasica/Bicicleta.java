package ut05OrientacionObjetos.sesion13.Ej01HerenciaBasica;

public class Bicicleta extends Vehiculo{
    private final int numeroMarchas;

    public Bicicleta(String nombre, int numeroMarchas) {
        super(nombre);
        this.numeroMarchas = numeroMarchas;
    }

    public int getNumeroMarchas() { return numeroMarchas; }
}
