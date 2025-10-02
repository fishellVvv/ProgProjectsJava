package ut10ClasesAvanzada.sesion14.Ej04Zoologico;

public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    public abstract void hacerSonido();
}
