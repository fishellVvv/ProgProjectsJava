package ut10ClasesAvanzada.sesion15.Ej06HerenciaInterfaces;

public abstract class Producto implements Vendible{
    protected String nombre;
    protected double precioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getNombre() { return nombre; }
    public double getPrecioBase() { return precioBase; }

    public abstract double calcularPrecioFinal();

    public double calcularImporte() {
        return this.calcularPrecioFinal();
    }
}
