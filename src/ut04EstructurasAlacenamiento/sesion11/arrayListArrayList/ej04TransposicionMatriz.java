package ut04EstructurasAlacenamiento.sesion11.arrayListArrayList;

public class ej04TransposicionMatriz {
    public static void main(String[] args) {

        /*
        4. Transposición de una Matriz:

         Crea una matriz de 2x3 y transponla, es decir, convierte sus filas en columnas.
         Imprime la matriz original y la trans
         */

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int filasM = matriz.length;
        int columnasM = matriz[0].length;
        int[][] matrizTrans = new int[columnasM][filasM];

        for (int i = 0; i < filasM; i++) {
            for (int j = 0; j < columnasM; j++) {
                matrizTrans[j][i] = matriz[i][j];
            }
        }

        for (int i = 0; i < filasM; i++) {
            for (int j = 0; j < columnasM; j++) {
                System.out.print(matriz[i][j]);
                if (j != columnasM - 1) System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < columnasM; i++) {
            for (int j = 0; j < filasM; j++) {
                System.out.print(matrizTrans[i][j]);
                if (j != filasM - 1) System.out.print("\t");
            }
            System.out.println();
        }
    }
}