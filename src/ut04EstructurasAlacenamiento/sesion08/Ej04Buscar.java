package ut04EstructurasAlacenamiento.sesion08;

import java.util.Arrays;
import java.util.Scanner;

public class Ej04Buscar {
    public static void main(String[] args) {

        /*
        4. Buscar un elemento
        Pide al usuario un número y muestra si está presente en un array, y en qué posición.
         */

        Scanner scn = new Scanner(System.in);
        int[] numeros = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Escribe un número del 1 al 10 para buscarlo: ");
        int numeroUsuario = scn.nextInt();

        /*
        for (int i=0; i<numeros.length; i++) {
            if (numeros[i] == numeroUsuario) {
                System.out.println("El número se encuentra en la posición " + i + " del array.");
            }
        }
         */

        System.out.println("El número se encuentra en la posición " + Arrays.binarySearch(numeros, numeroUsuario) + " del array.");

        scn.close();
    }
}