package ut04EstructurasAlacenamiento.sesion11.ej03Mapas;

import java.util.HashMap;

public class ej04ActualizarValor {
    public static void main(String[] args) {

        /*
        4. Actualizar el Valor de una Clave en un Mapa:

         Crea un HashMap<String, Integer> que almacene productos y sus cantidades.
         Actualiza la cantidad de un producto y luego muestra el mapa actualizado.
         */

        HashMap<String, Integer> productos = new HashMap<>();
        productos.put("Estuche", 1);
        productos.put("Bolígrafo", 2);
        productos.put("Lápiz", 3);
        productos.put("Libreta", 4);

        productos.replace("Bolígrafo", 5);

        System.out.println(productos);
    }
}