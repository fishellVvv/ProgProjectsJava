package ut04EstructurasAlacenamiento.sesion11.ej02ArrayListArrayList;

import java.util.ArrayList;

public class ej04ModificarElemento {
    public static void main(String[] args) {

        /*
        4. Modificar un Elemento en una Lista Interna:

         Crea un ArrayList<ArrayList<String>> con listas internas representando productos y sus precios.
         Permite modificar el precio de un producto y luego imprime la lista de productos actualizada.
         */

        ArrayList<ArrayList<String>> productosPrecios = new ArrayList<>();

        ArrayList<String> prod1 = new ArrayList<>();
        prod1.add("CL 500");
        prod1.add("6.050 €");
        productosPrecios.add(prod1);

        ArrayList<String> prod2 = new ArrayList<>();
        prod2.add("Rebel 1100");
        prod2.add("11.450 €");
        productosPrecios.add(prod2);

        ArrayList<String> prod3 = new ArrayList<>();
        prod3.add("Africa Twin");
        prod3.add("20.200 €");
        productosPrecios.add(prod3);

        productosPrecios.get(1).set(1, "1.000 €");

        for (int i = 0; i < productosPrecios.size(); i++) {
            System.out.println("Moto " + (i+1) + ":");
            for (int j = 0; j < productosPrecios.get(i).size(); j++) {
                if (j == 0) {
                    System.out.print("Modelo: ");
                } else {
                    System.out.print("Precio: ");
                }
                System.out.println(productosPrecios.get(i).get(j));
            }
            System.out.println();
        }
    }
}