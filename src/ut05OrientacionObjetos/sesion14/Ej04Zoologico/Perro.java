package ut05OrientacionObjetos.sesion14.Ej04Zoologico;

public class Perro extends Animal{
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau!");
    }
}
