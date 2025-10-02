package ut10ClasesAvanzada.sesion14.Ej03BibliotecaDigital;

public class Revista extends Recurso{
    private int numeroEdicion;

    public Revista(String titulo, String autor, int numeroEdicion) {
        super(titulo, autor);
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() { return numeroEdicion; }

    @Override
    public void mostrarInfo() {
        System.out.println(this.titulo + " [" + this.autor + "] - edición: " + this.numeroEdicion + ".");
    }
}
