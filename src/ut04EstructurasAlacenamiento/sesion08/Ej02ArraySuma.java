package ut04EstructurasAlacenamiento.sesion08;

import java.util.Arrays;
import java.util.Scanner;

public class Ej02ArraySuma {
    public static void main(String[] args) {

        /*
        2. Sumar elementos
        Suma todos los valores de un array de enteros y muestra el total.
         */

        Scanner scn = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i=0; i<numeros.length; i++) {
            System.out.print("Introduce el número " + (i+1) + ": ");
            numeros[i] = scn.nextInt();
        }

        System.out.println("\nContenido: ");

        /*
        int suma = 0;
        for (int num: numeros) {
            suma += num;
        }
        */

        System.out.println("La suma es: " + Arrays.stream(numeros).sum());

        scn.close();
    }
}