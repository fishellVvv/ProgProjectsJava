package ut04EstructurasAlacenamiento.sesion08;

import java.util.Scanner;

public class Ej04Buscar {
    public static void main(String[] args) {

        /*
        4. Buscar un elemento
        Pide al usuario un número y muestra si está presente en un array, y en qué posición.
         */

        Scanner scn = new Scanner(System.in);
        int[] numeros = new int[] { 45, 20, 31, 3, 78, 13, 90, 55, 89, 8 };
        boolean encontrado = false;

        System.out.print("Escribe un número para buscarlo: ");
        int numeroUsuario = scn.nextInt();

            for (int i=0; i<numeros.length; i++) {
                if (numeros[i] == numeroUsuario) {
                    encontrado = true;
                    System.out.println("El número " + numeroUsuario + " se encuentra en la posición " + i + " del array.");
                    break;
                }
            }

        if (!encontrado) System.out.println("El número no se encuentra en el listado del array.");

        scn.close();
    }
}