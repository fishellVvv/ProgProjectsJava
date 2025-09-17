package ut05OrientacionObjetos.cuadernoSantillana;

// 16. Matriz identidad
// Crea una función que genere una matriz identidad de tamaño n.

import java.util.Scanner;

public class Ej16MatrizIdentidad {
    private static final Scanner SC = new Scanner(System.in);
    private static final int MIN_N = 1;
    private static final int MAX_N = 10;

    public static void main(String[] args) {
        int n = leerEntero();
        int[][] matriz = new int[n][n];

        definirMatriz(matriz);
        System.out.printf("%nMatriz Identidad de tamaño %d:%n", n);
        imprimirMatriz(matriz);
    }

    private static int leerEntero() {
        while (true) {
            System.out.printf("Introduce un número entero entre %d y %d: ", MIN_N, MAX_N);
            String entrada = SC.nextLine().trim();
            try {
                int n = Integer.parseInt(entrada);
                if (n < MIN_N || n > MAX_N) {
                    System.out.println("Fuera de rango. ");
                    continue;
                }
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Error: introduce un número válido.");
            }
        }
    }

    public static void definirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i == j) ? 1 : 0;
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            imprimirFila(matriz[i]);
            System.out.println();
        }
    }

    private static void imprimirFila(int[] fila) {
        System.out.print("|");
        for (int i = 0; i < fila.length; i++) {
            System.out.printf(i == 0 ? "%3d" : "%4d", fila[i]);
        }
        System.out.print(" |");
    }
}
