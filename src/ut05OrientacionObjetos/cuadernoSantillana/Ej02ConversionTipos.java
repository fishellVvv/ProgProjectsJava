package ut05OrientacionObjetos.cuadernoSantillana;

// 2. Conversión de tipos
// Pide un número decimal (double), conviértelo a int,
// y muestra ambos resultados indicando si hubo pérdida de información.

import java.util.Scanner;

public class Ej02ConversionTipos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero decimal: ");
        String entrada = sc.nextLine().trim();

        entrada = entrada.replace(',','.');

        double numD;
        try {
            numD = Double.parseDouble(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Error: introduce un número válido.");
            return;
        }

        int numI = (int) numD;

        System.out.printf("Número Double: %.4f\n", numD);
        System.out.printf("Número Int:    %,d\n", numI);
        System.out.printf("Diferencia:    %.4f\n", numD - numI);
    }
}
