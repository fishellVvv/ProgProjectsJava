package ut10ClasesAvanzada.sesion15.Ej05InterfacesComportamiento;

public class Cancion implements Reproducible{
    private String titulo;
    private String genero;

    public Cancion(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo: '" + this.titulo + "' (" + this.genero + ")");
    }
}
