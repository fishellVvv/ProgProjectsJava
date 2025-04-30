package ut04EstructurasAlacenamiento.sesion09;

import java.util.Arrays;

public class Ej05Ordenar {
    public static void main(String[] args) {

        /*
        5. Ordenar el array
        Declara un array con números desordenados y ordénalo de menor a mayor utilizando Arrays.sort().
         */

        int[] numeros = new int[] { 45, 20, 31, 3, 78, 13, 90, 55, 89, 8 };
        System.out.println("Lista desordenada: ");
        Arrays.stream(numeros).forEach(num -> System.out.print(num + ", "));

        Arrays.sort(numeros);

        System.out.println("\n\nLista ordenada: ");
        Arrays.stream(numeros).forEach(num -> System.out.print(num + ", "));
    }
}