package ut04EstructurasAlacenamiento.sesion08;

import java.util.Arrays;
import java.util.Scanner;

public class Ej01Array {
    public static void main(String[] args) {

        /*
        1. Declarar y mostrar
        Declara un array de 5 números enteros, asígnales valores y muéstralos por pantalla.
         */

        Scanner scn = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i=0; i<numeros.length; i++) {
            System.out.print("Introduce el número " + (i+1) + ": ");
            numeros[i] = scn.nextInt();
        }

        System.out.println("\nContenido: ");

        /*
        for (int i=0; i<numeros.length; i++) {
            System.out.println("Posición " + (i+1) + ": " + numeros[i]);
        }

        for (int num: numeros) {
            System.out.println("Elemento: " + num);
        }

        int indice = 0;
        while (indice < numeros.length) {
            System.out.println("Posición " + (indice+1) + ": " + numeros[indice]);
            indice++;
        }
        */

        Arrays.stream(numeros).forEach(num -> System.out.println("Elemento: " + num));

        scn.close();
    }
}