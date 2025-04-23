package ut04EstructurasAlacenamiento.sesion08;

import java.util.Arrays;

public class Ej03MaxMin {
    public static void main(String[] args) {

        /*
        3. Valor máximo y mínimo
        Dado un array de enteros, muestra el valor más alto y el más bajo.
         */

        int[] numeros = new int[] { 1, 2, 3, 4, 5 };

        /*
        int max = numeros[0];
        for (int i=0; i<numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        System.out.println("El número máximo es: " + max);
        */

        System.out.println("El número máximo es: " + Arrays.stream(numeros).max().getAsInt());

        /*
        int min = numeros[0];
        for (int i=0; i<numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        System.out.println("El número mínimo es: " + min);
         */

        System.out.println("El número mínimo es: " + Arrays.stream(numeros).min().getAsInt());
    }
}