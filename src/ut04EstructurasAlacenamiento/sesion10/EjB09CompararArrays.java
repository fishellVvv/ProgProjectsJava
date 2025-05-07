package ut04EstructurasAlacenamiento.sesion10;

import java.util.Scanner;

public class EjB09CompararArrays {
    public static void main(String[] args) {

        /*
        9. Comparar arrays
        Pide al usuario que introduzca dos arrays de enteros del mismo tamaño y
        muestra cuántos elementos coinciden en la misma posición.
        Ejemplo:
        Array 1: {1, 2, 3, 4, 5}
        Array 2: {1, 4, 3, 0, 5}
        Coinciden en 3 posiciones (índices 0, 2 y 4).
         */

        Scanner scn = new Scanner(System.in);
        int longitud;
        int coincidentes = 0;

        System.out.println("Vamos a comparar dos listados de números enteros.");
        System.out.print("Por favor indica la longitud de los listados: ");
        longitud = scn.nextInt();
        scn.nextLine();

        int[] numeros1 = new int[longitud];
        int[] numeros2 = new int[longitud];
        int[] numerosCoincidentes = new int[longitud];

        System.out.printf("\nAhora vamos a introducir un primer listado de %d números enteros.\n", (longitud));
        for (int i = 0; i < longitud; i++) {
            System.out.printf("Número %d: ", (i + 1));
            numeros1[i] = scn.nextInt();
            scn.nextLine();
        }

        System.out.printf("\nAhora vamos a introducir el segundo listado de %d números enteros.\n", (longitud));
        for (int i = 0; i < longitud; i++) {
            System.out.printf("Número %d: ", (i + 1));
            numeros2[i] = scn.nextInt();
            scn.nextLine();
        }

        for (int i = 0; i < longitud; i++) {
            if (numeros1[i] == numeros2[i]) {
                numerosCoincidentes[coincidentes] = i;
                coincidentes++;
            }
        }

        if (coincidentes > 0) {
            System.out.printf("Coinciden en %d ", coincidentes);

            if (coincidentes == 1) {
                System.out.print("posición (índice ");
            } else {
                System.out.print("posiciones (índices ");
            }

            if (coincidentes >= 3) {
                for (int i = 0; i < coincidentes - 2; i++) {
                    System.out.printf("%d, ", numerosCoincidentes[i]);
                }
            }

            if (coincidentes >= 2) {
                System.out.printf("%d y ", numerosCoincidentes[coincidentes - 2]);
            }

            System.out.printf("%d).", numerosCoincidentes[coincidentes - 1]);
        } else {
            System.out.println("\nNo coinciden en ninguna posición.");
        }
        scn.close();
    }
}