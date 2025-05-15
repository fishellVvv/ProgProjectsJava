package ut04EstructurasAlacenamiento.sesion11.ej01Matrices;

public class ej03MatrizIdentidad {
    public static void main(String[] args) {

        /*
        3. Matriz de Identidad:

         Crea una matriz de 3x3 que sea una matriz identidad (con 1 en la diagonal principal y 0 en el resto).
         Imprime la matriz.
         */

        int[][] matrizIdentidad = new int[3][3];
        int filas = matrizIdentidad.length;
        int columnas = matrizIdentidad[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == j) {
                    matrizIdentidad[i][j] = 1;
                } else {
                    matrizIdentidad[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizIdentidad[i][j]);
                if (j != columnas - 1) System.out.print("\t");
            }
            System.out.println();
        }
    }
}