package ut04EstructurasAlacenamiento.sesion11.ej03Mapas;

import java.util.HashMap;
import java.util.TreeMap;

public class ej05OrdenarMapa {
    public static void main(String[] args) {

        /*
        5. Ordenar un Mapa por Claves:

         Crea un HashMap<String, Double> que almacene nombres de productos y sus precios.
         Usa un TreeMap para ordenar los productos por nombre de forma alfabética.
         Imprime el mapa ordenado.
         */

        HashMap<String, Double> productos = new HashMap<>();
        productos.put("Libreta", 4.5);
        productos.put("Estuche", 3.75);
        productos.put("Calculadora", 12.);
        productos.put("Bolígrafo", 2.5);

        TreeMap<String, Double> productosOrdenados = new TreeMap<>(productos);

        System.out.println(productosOrdenados);
    }
}