package ut05OrientacionObjetos.sesion14.Ej04Zoologico;

public class Gato extends Animal{
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau!");
    }
}
