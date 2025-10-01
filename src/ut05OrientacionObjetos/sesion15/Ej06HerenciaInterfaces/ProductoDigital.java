package ut05OrientacionObjetos.sesion15.Ej06HerenciaInterfaces;

public class ProductoDigital extends Producto{
    private double descuento;

    public ProductoDigital(String nombre, double precioBase, double descuento) {
        super(nombre, precioBase);
        this.descuento = descuento;
    }

    public double getDescuento() { return descuento; }

    @Override
    public double calcularPrecioFinal() {
        return (this.precioBase - this.descuento);
    }
}
