package ut10ClasesAvanzada.sesion14.Ej04Zoologico;

public class Perro extends Animal{
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau!");
    }
}
