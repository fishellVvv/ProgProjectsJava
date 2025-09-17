package ut05OrientacionObjetos.cuadernoSantillana;

// 14.Suma de dos matrices 3x3
// Llena dos matrices 3x3 con valores aleatorios y muestra la matriz suma.

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ej14SumaMatrices {
    public static void main(String[] args) {
        int n = leerEntero();

        int[][] matrizA = new int[n][n];
        int[][] matrizB = new int[n][n];
        int[][] matrizSuma = new int[n][n];

        llenarMatriz(matrizA, 0, 9);
        llenarMatriz(matrizB, 0, 9);
        sumarMatrices(matrizA, matrizB, matrizSuma);

        imprimirSumaMatrices(matrizA, matrizB, matrizSuma, n);
    }

    private static int leerEntero() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Introduce un número entero: ");
            String entrada = sc.nextLine().trim();
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Error: introduce un número válido.");
            }
        }
    }

    public static void llenarMatriz(int[][] matriz, int min, int maxInclusive) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ThreadLocalRandom.current().nextInt(min, maxInclusive + 1);
            }
        }
    }

    public static void sumarMatrices(int[][] mA, int[][] mB, int[][] mSuma){
        for (int i = 0; i < mSuma.length; i++) {
            for (int j = 0; j < mSuma[i].length; j++) {
                mSuma[i][j] = mA[i][j] + mB[i][j];
            }
        }
    }

    private static void imprimirSumaMatrices(int[][] mA, int[][] mB, int[][] mSuma, int n) {
        imprimirCabecera(n);
        for (int i = 0; i < mSuma.length; i++) {
            imprimirLinea(mA, mB, mSuma, i, n);
        }
    }

    private static void imprimirCabecera(int n) {
        String gap = " ".repeat(4 * n);

        System.out.print("\n Matriz A");
        System.out.print(gap);
        System.out.print(" Matriz B");
        System.out.print(gap);
        System.out.println(" Suma (A + B)");
    }

    private static void imprimirLinea(int[][] mA, int[][] mB, int[][] mSuma, int i, int n) {
        imprimirFila(mA[i]);
        System.out.print(i == n / 2 ? "   +   " : "       ");
        imprimirFila(mB[i]);
        System.out.print(i == n / 2 ? "   =   " : "       ");
        imprimirFila(mSuma[i]);
        System.out.println();
    }

    private static void imprimirFila(int[] fila) {
        System.out.print("|");
        for (int i = 0; i < fila.length; i++) {
            System.out.printf(i == 0 ? "%3d" : "%4d", fila[i]);
        }
        System.out.print(" |");
    }
}
