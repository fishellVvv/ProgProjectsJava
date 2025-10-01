package ut05OrientacionObjetos.sesion15.Ej05InterfacesComportamiento;

public class Video implements Reproducible{
    private String titulo;
    private String formato;

    public Video(String titulo, String formato) {
        this.titulo = titulo;
        this.formato = formato;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo: '" + this.titulo + "' [" + this.formato + "]");
    }
}
