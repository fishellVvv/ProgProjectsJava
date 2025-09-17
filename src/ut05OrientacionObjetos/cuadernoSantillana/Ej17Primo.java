package ut05OrientacionObjetos.cuadernoSantillana;

// 17. Número primo
// Crea una función que reciba un número entero y devuelva si es primo.

import java.util.Scanner;

public class Ej17Primo {
    public static void main(String[] args) {
        int n = leerEntero();
        System.out.println( esPrimo(n) ? "Es primo" : "No es primo" );
    }

    private static int leerEntero() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Introduce un número entero: ");
            String entrada = sc.nextLine().trim();
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Error: introduce un número válido.");
            }
        }
    }

    private static boolean esPrimo(int n) {
        boolean b = true;

        if (n < 2) {
            b = false;
        } else {
            for (int i = 2; i < Math. sqrt(n); i++) {
                System.out.println(i);
                if ((n % i) == 0) {
                    b = false;
                    break;
                }
            }
        }
        return b;
    }
}
