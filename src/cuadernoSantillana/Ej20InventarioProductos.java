package cuadernoSantillana;

// 20. Inventario de productos
// Crea una clase Producto con nombre, precio y cantidad.
// Usa una lista para guardar varios productos e imprime un listado con el total del inventario (precio * cantidad).

import java.util.List;

public class Ej20InventarioProductos {
    public static void main(String[] args) {
        Producto p1 = new Producto("Honda-CL_500", 6050.00, 5);
        Producto p2 = new Producto("Honda-Revel_500", 6350.00, 0);
        Producto p3 = new Producto("Honda-Revel_1100", 11450.00, 2);

        List<Producto> productos = List.of(p1, p2, p3);

        for (Producto p : productos) {
            System.out.printf("%s - %.2f€ (%s - %d unidades) [Valor de Stock %.2f€]%n",
                    p.getNombre(), p.getPrecio(),
                    p.enStock() ? "en Stock" : "sin Stock",
                    p.getCantidad(), p.valorStock());
        }
    }
}
