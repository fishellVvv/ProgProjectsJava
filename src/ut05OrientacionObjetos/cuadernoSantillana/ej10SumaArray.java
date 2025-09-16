package ut05OrientacionObjetos.cuadernoSantillana;

// 10.Suma de elementos en un array
// Pide 5 números al usuario, guárdalos en un array y muestra la suma total.

import java.util.Scanner;

public class ej10SumaArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] nums = new double[5];
        double suma = 0.0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = leerDouble(sc, "Introduce el número " + (i+1) + ": ");
        }

        for (double n : nums) suma += n;

        System.out.printf("Suma total: %.2f%n", suma);
    }

    private static double leerDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String entrada = sc.nextLine().trim().replace(',', '.');
            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Error: introduce un número válido.");
            }
        }
    }
}
