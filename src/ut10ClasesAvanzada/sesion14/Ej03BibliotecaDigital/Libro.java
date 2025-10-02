package ut10ClasesAvanzada.sesion14.Ej03BibliotecaDigital;

public class Libro extends Recurso{
    private int numeroPaginas;

    public Libro(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() { return numeroPaginas; }

    @Override
    public void mostrarInfo() {
        System.out.println(this.titulo + " [" + this.autor + "] - " + this.numeroPaginas + " páginas.");
    }
}
