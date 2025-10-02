package ut10ClasesAvanzada.sesion14.Ej03BibliotecaDigital;

public abstract class Recurso {
    protected String titulo;
    protected String autor;

    public Recurso(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }

    public abstract void mostrarInfo();
}
