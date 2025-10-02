package cuadernoSantillana;

// 4. Par o impar
// Pide un número entero y muestra si es par o impar usando if.

import java.util.Scanner;

public class Ej04ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Introduce un numero entero: ");
        String entrada = sc.nextLine();

        try {
            num = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Error: introduce un número válido.");
            return;
        }

        if (num % 2 == 0){
            System.out.println("Es par.");
        } else {
            System.out.println("Es impar.");
        }
    }
}
