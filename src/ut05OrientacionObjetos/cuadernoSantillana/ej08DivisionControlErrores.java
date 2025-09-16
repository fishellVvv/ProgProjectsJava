package ut05OrientacionObjetos.cuadernoSantillana;

// 8. División con control de errores
// Pide dos números e intenta dividir. Controla la excepción si el divisor es cero.

import java.util.Scanner;

public class ej08DivisionControlErrores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada;
        int num1, num2;
        double resultado;

        System.out.print("Introduce el primer número: ");
        entrada = sc.nextLine();

        entrada = entrada.replace(',','.');

        try {
            num1 = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Error: introduce un número válido.");
            return;
        }

        System.out.print("Introduce el segundo número: ");
        entrada = sc.nextLine();

        entrada = entrada.replace(',','.');

        try {
            num2 = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Error: introduce un número válido.");
            return;
        }

        try {
            resultado = num1 / num2;
            System.out.printf("El resultado de la división es: %.2f", resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre 0.");
        }
    }
}
