package ut05OrientacionObjetos.cuadernoSantillana;

// 1. Área de un círculo
// Crea una clase que calcule el área de un círculo usando una constante PI.
// El usuario debe introducir el radio.

import java.util.Locale;
import java.util.Scanner;

public class Ej01AreaCirculo {
    private static final double PI = Math.PI;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio de la circunferencia: ");
        String entrada = sc.nextLine().trim();

        entrada = entrada.replace(',','.');

        double radio;
        try {
            radio = Double.parseDouble(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Error: introduce un número válido.");
            return;
        }

        if(radio < 0){
            System.out.println("Error: el radio no puede ser negativo.");
            return;
        }

        double areaCirculo = PI * radio * radio;

        System.out.printf(Locale.ROOT, "Área = %.2f unidades²%n", areaCirculo);
    }
}
