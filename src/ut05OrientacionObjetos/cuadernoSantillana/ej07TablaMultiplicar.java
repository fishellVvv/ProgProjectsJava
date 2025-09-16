package ut05OrientacionObjetos.cuadernoSantillana;

// 7. Tabla de multiplicar de un número dado
// Pide un número al usuario y muestra su tabla de multiplicar del 1 al 10.

import java.util.Scanner;

public class ej07TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada;
        int num;

        System.out.print("Introduce un numero entero: ");
        entrada = sc.nextLine();

        try {
            num = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Error: introduce un número válido.");
            return;
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("%,d * %,d = %,d\n", i+1, num, (i+1)*num);
        }
    }
}
