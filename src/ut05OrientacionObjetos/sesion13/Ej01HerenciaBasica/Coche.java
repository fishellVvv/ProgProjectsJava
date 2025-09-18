package ut05OrientacionObjetos.sesion13.Ej01HerenciaBasica;

public class Coche extends Vehiculo {
    private final int caballos;

    public Coche(String nombre, int caballos) {
        super(nombre);
        this.caballos = caballos;
    }

    public int getCaballos() { return caballos; }
}
