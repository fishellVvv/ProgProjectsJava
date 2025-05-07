package ut04EstructurasAlacenamiento.sesion10;

public class EjB10FrecuenciaElementos {
    public static void main(String[] args) {

        /*
        10. Frecuencia de elementos
        Dado un array de enteros, muestra cuántas veces se repite cada valor.
        Ejemplo: {1, 2, 2, 3, 1, 1} →
        1 aparece 3 veces
        2 aparece 2 veces
        3 aparece 1 vez
         */

        int[] numeros = new int[] {1, 2, 2, 3, 1, 1};

        for (int i = 0; i < numeros.length; i++) {
            boolean diferente = true;

            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    if (numeros[j] == numeros[i]) {
                        diferente = false;
                        break;
                    }
                }
            }

            if (diferente) {
                int contador = 0;
                for (int j = i; j < numeros.length; j++) {
                    if (numeros[j] == numeros[i]) {
                        contador++;
                    }
                }
                System.out.printf("%d aparece %d veces\n", numeros[i], contador);
            }
        }
    }
}