package cuadernoSantillana;

class Producto {
private final String nombre;
private final double precio;
private final int cantidad;

    public Producto (String nombre, double precio, int cantidad) {
        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        if (precio <0)
            throw new IllegalArgumentException("Precio fuera de rango.");
        if (cantidad <0)
            throw new IllegalArgumentException("Cantidad fuera de rango.");
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }

    public boolean enStock() { return cantidad > 0; }
    public double valorStock() { return cantidad * precio; }

    @Override public String toString() { return nombre + " - " + precio + "€ (" + cantidad + " unidades)"; }
}
