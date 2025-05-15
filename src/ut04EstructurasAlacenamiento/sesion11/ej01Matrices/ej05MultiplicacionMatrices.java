package ut04EstructurasAlacenamiento.sesion11.ej01Matrices;

public class ej05MultiplicacionMatrices {
    public static void main(String[] args) {

        /*
        5. Multiplicación de Matrices:
         Crea dos matrices de 2x2 y multiplícalas.
         Imprime el resultado de la multiplicación.
         */

        int[][] matriz1 = {
                {1, 2},
                {3, 4}
        };
        int[][] matriz2 = {
                {5, 6},
                {7, 8}
        };
        int f1 = matriz1.length;
        int c1 = matriz1[0].length;
        int f2 = matriz2.length;
        int c2 = matriz2[0].length;
        int[][] matrizResultado = new int[f1][c2];

        if (c1 != f2) {
            System.out.println("No se pueden multiplicar estas matrices.");
        } else {
            for (int i = 0; i < f1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                }
            }
            for (int i = 0; i < f1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(matrizResultado[i][j]);
                    if (j != c2 - 1) System.out.print("\t");
                }
                System.out.println();
            }
        }
    }
}