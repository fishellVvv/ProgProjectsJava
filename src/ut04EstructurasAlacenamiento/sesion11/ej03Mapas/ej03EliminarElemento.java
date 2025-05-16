package ut04EstructurasAlacenamiento.sesion11.ej03Mapas;

import java.util.TreeMap;

public class ej03EliminarElemento {
    public static void main(String[] args) {

        /*
        3. Eliminar un Elemento de un Mapa:

         Crea un TreeMap<Integer, String> con claves numéricas y valores de colores.
         Elimina un color del mapa e imprime el mapa resultante.
         */

        TreeMap<Integer, String> colores = new TreeMap<>();
        colores.put(1, "Rojo");
        colores.put(2, "Verde");
        colores.put(3, "Azul");
        colores.put(4, "Amarillo");
        colores.put(5, "Morado");
        colores.put(6, "Naranja");

        colores.remove(5);

        System.out.println(colores);
    }
}