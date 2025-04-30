package ut04EstructurasAlacenamiento.sesion09;

import java.util.ArrayList;

public class Ej09Convertir {
    public static void main(String[] args) {

        /*
        9. Convertir array a lista
        Dado un array de enteros, conviértelo a una ArrayList<Integer> y muestra su contenido.
         */

        int[] numeros = new int[] { 1, 2, 3, 4, 5 };
        ArrayList<Integer> numerosLista = new java.util.ArrayList<>();
        for (int num: numeros) {
            numerosLista.add(num);
        }
        System.out.println(numerosLista);
    }
}