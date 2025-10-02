package ut10ClasesAvanzada.sesion15.Ej06HerenciaInterfaces;

public class ProductoFisico extends Producto{
    private double costeEnvio;

    public ProductoFisico(String nombre, double precioBase, double costeEnvio) {
        super(nombre, precioBase);
        this.costeEnvio = costeEnvio;
    }

    public double getCosteEnvio() { return costeEnvio; }

    @Override
    public double calcularPrecioFinal() {
        return (this.precioBase + this.costeEnvio);
    }
}
