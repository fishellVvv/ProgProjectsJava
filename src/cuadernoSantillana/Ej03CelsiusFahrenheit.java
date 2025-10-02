package cuadernoSantillana;

// 3. Conversión entre Celsius y Fahrenheit
// Usa funciones para convertir temperaturas.
// Asegúrate de que los tipos de datos sean apropiados.

import java.util.Scanner;

public class Ej03CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sistema;
        double temp, tempF, tempC;

        while (true) {
            System.out.print("¿En qué sistema deseas introducir la temperatura (C/F)? ");
            sistema = sc.nextLine().trim();

            if (sistema.equalsIgnoreCase("C") || sistema.equalsIgnoreCase("F")) {
                break;
            }
            System.out.println("Entrada inválida. Por favor, escribe C o F.");
        }

        System.out.printf("Introduce la temperatura en º%s a convertir: ", sistema.toUpperCase());
        String entrada = sc.nextLine().trim();

        entrada = entrada.replace(',','.');

        try {
            temp = Double.parseDouble(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Error: introduce un número válido.");
            return;
        }

        if (sistema.equalsIgnoreCase("C")) {
            tempF = (temp * (9.0 / 5.0)) + 32;
            System.out.printf("%.2fºC son %.2fºF", temp, tempF);
        } else {
            tempC = (temp -32) * (5.0 / 9.0);
            System.out.printf("%.2fºF son %.2fºC", temp, tempC);
        }
    }
}
