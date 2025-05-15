package ut04EstructurasAlacenamiento.sesion11.arrayListArrayList;

public class ej01SumaMatrices {
    public static void main(String[] args) {

        /*
        1. Suma de Dos Matrices:

        Crea dos matrices de 3x3 y suma sus elementos.
        Imprime el resultado de la suma.
         */

        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matriz2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] matrizResultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizResultado[i][j]);
                if (j != columnas - 1) System.out.print("\t");
            }
            System.out.println();
        }
    }
}