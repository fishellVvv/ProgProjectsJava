package ut04EstructurasAlacenamiento.sesion11.ej01Matrices;

import java.util.Random;

public class ej02MatrizAleatoria {
    public static void main(String[] args) {

        /*
        2. Rellenar una Matriz con Números Aleatorios:

         Crea una matriz de 4x4 y rellénala con números aleatorios entre 1 y 100.
         Imprime la matriz.
         */

        int[][] matrizAleatoria = new int[4][4];
        int filas = matrizAleatoria.length;
        int columnas = matrizAleatoria[0].length;
        Random numRandom = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizAleatoria[i][j] = numRandom.nextInt(10);
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizAleatoria[i][j]);
                if (j != columnas - 1) System.out.print("\t");
            }
            System.out.println();
        }
    }
}