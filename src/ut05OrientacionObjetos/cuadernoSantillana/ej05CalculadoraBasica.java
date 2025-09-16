package ut05OrientacionObjetos.cuadernoSantillana;

// 5. Calculadora básica
// Pide dos números y una operación (+, -, *, /) e implementa una calculadora con switch.

import java.util.Scanner;

public class ej05CalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2;
        String entrada, operacion;

        System.out.print("Indica el primer número: ");
        entrada = sc.nextLine();

        entrada = entrada.replace(',','.');

        try {
            num1 = Double.parseDouble(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Error: introduce un número válido.");
            return;
        }

        while (true) {
            System.out.print("Indica una operación ( + - * / ): ");
            operacion = sc.nextLine().trim();

            if (operacion.equalsIgnoreCase("+") || operacion.equalsIgnoreCase("-") || operacion.equalsIgnoreCase("*") || operacion.equalsIgnoreCase("/")) {
                break;
            }
            System.out.println("Entrada inválida. Por favor, escribe +, -, * o /.");
        }

        System.out.print("Indica el segundo número: ");
        entrada = sc.nextLine();

        entrada = entrada.replace(',','.');

        try {
            num2 = Double.parseDouble(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Error: introduce un número válido.");
            return;
        }

        switch (operacion){
            case "+":
                System.out.printf("El resultado de la suma es: %,f", num1 + num2);
                break;
            case "-":
                System.out.printf("El resultado de la resta es: %,f", num1 - num2);
                break;
            case "*":
                System.out.printf("El resultado de la multiplicación es: %,f", num1 * num2);
                break;
            case "/":
                System.out.printf("El resultado de la división es: %,f", num1 / num2);
                break;
        }
    }
}
