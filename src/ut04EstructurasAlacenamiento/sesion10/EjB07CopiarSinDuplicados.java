package ut04EstructurasAlacenamiento.sesion10;

public class EjB07CopiarSinDuplicados {
    public static void main(String[] args) {

        /*
        7. Copiar sin duplicados
        Dado un array con posibles números repetidos,
        crea un nuevo array que contenga los mismos elementos sin duplicados.
        Ejemplo: {1, 2, 2, 3, 4, 4, 5} → {1, 2, 3, 4, 5}.
         */

        int[] numeros = new int[] {1, 2, 2, 3, 4, 4, 5};
        int[] numerosSinDuplicados = new int[numeros.length];
        int elementosUnicos = 0;

        for (int numero : numeros) {
            boolean repetido = false;
            for (int j = 0; j < elementosUnicos; j++) {
                if (numerosSinDuplicados[j] == numero) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                numerosSinDuplicados[elementosUnicos] = numero;
                elementosUnicos++;
            }
        }
        for (int i = 0; i < elementosUnicos; i++) {
            System.out.print(numerosSinDuplicados[i] + ", ");
        }
    }
}