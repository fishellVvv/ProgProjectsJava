package ut05OrientacionObjetos.sesion15.Ej06HerenciaInterfaces;

// 6 – Herencia con interfaces
// Crea una clase abstracta Producto con atributos nombre y precioBase, y un mét_odo abstracto double calcularPrecioFinal().
// Crea dos subclases:
//         • ProductoFisico (con un atributo costeEnvio que se suma al precio)
//         • ProductoDigital (con un atributo descuento que se resta al precio)
// Haz que todas las clases implementen la interfaz Vendible, que define el mét_odo double calcularImporte().
// En el main, crea una lista de Vendible con distintos productos y muestra el importe final de cada uno.

import java.util.ArrayList;
import java.util.List;

public class Ej06HerenciaInterfaces {
    public static void main(String[] args) {
        List<Vendible> productos = new ArrayList<>();
        productos.add(new ProductoFisico("Cocacola", 2.0, 0.5));
        productos.add(new ProductoDigital("Silksong", 19.9, 2.0));

        for (Vendible v: productos) {
            System.out.println(v.calcularImporte());
        }
    }
}
