package ut05OrientacionObjetos.cuadernoSantillana;

// 15. Transposición de una matriz
// Pide al usuario una matriz cuadrada y muestra su transpuesta.

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ej15TransponerMatriz {
    public static void main(String[] args) {
        int n = leerEntero(1, 10);
        int[][] matriz = new int[n][n];
        int[][] matrizTrans = new int[n][n];

        switch (mostrarMenu()){
            case 1:
                llenarMatriz(matriz, 0, 9);
                break;
            case 2:
                definirMatriz(matriz);
                break;
        }

        transponerMatriz(matriz, matrizTrans);

        System.out.println("\nMatriz original:");
        imprimirMatriz(matriz);
        System.out.println("\nMatriz transpuesta:");
        imprimirMatriz(matrizTrans);
    }

    private static int leerEntero(int min, int maxInclusive) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.printf("Introduce un número entero entre %d y %d: ", min, maxInclusive);
            String entrada = sc.nextLine().trim();
            try {
                int n = Integer.parseInt(entrada);
                if (n < min || n > maxInclusive) {
                    System.out.println("Fuera de rango. ");
                    continue;
                }
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Error: introduce un número válido.");
            }
        }
    }

    public static int mostrarMenu() {
        System.out.println("\nElige una opción: ");
        System.out.println("1. Rellenar matriz con números aleatorios.");
        System.out.println("2. Rellenar matriz a mano.");
        return leerEntero(1, 2);
    }

    public static void llenarMatriz(int[][] matriz, int min, int maxInclusive) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ThreadLocalRandom.current().nextInt(min, maxInclusive + 1);
            }
        }
    }

    public static void definirMatriz(int[][] matriz) {
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Valor de la matriz[%d][%d]%n", i, j);
                matriz[i][j] = leerEntero(0, 9);
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

    public static void transponerMatriz(int[][] matriz, int[][] matrizTranspuesta) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTranspuesta[i][j] = matriz[j][i];
            }
        }
    }
}
