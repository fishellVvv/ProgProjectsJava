package ut05OrientacionObjetos.cuadernoSantillana;

// 11.Buscar número en un array
// Crea un array de 10 números, pide al usuario un número y muestra si está en el array.

import java.util.Scanner;

public class Ej11BuscarArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada;
        int num;
        int[] nums = new int[10];
        boolean encontrado = false;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10);
        }

        System.out.print("Introduce un número entero del 0 al 10: ");
        entrada = sc.nextLine();

        try {
            num = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Error: introduce un número válido.");
            return;
        }

        for (int n : nums) {
            if (n == num) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El numero se encuentra en el Array");
        } else {
            System.out.println("El numero no se encuentra en el Array");
        }
    }
}
