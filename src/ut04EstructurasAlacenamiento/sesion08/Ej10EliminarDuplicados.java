package ut04EstructurasAlacenamiento.sesion08;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Ej10EliminarDuplicados {
    public static void main(String[] args) {

        /*
        10. Eliminar duplicados de una lista
        Crea una ArrayList con elementos repetidos (por ejemplo: [1, 2, 2, 3, 4, 4, 5])
        Elimina los duplicados y muestra la lista final sin repetir.
         */

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(4);
        numeros.add(5);

        for (int i = 0; i < numeros.size(); i++) {
            for (int j = i + 1; j < numeros.size(); j++) {
                if (numeros.get(i).equals(numeros.get(j))) {
                    numeros.remove(j);
                    j--;
                }
            }
        }
        System.out.println(numeros);
    }
}