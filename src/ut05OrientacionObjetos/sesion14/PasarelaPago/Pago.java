package ut05OrientacionObjetos.sesion14.PasarelaPago;

public abstract class Pago {
    protected double cantidad;

    public Pago(double cantidad) {
        if (cantidad <=0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que 0");
        }
        this.cantidad = cantidad;
    }

    public double getCantidad() { return cantidad; }

    public abstract void procesarPago();
}
