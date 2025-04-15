package ut02IdentificacionElementos.sesion07;

import java.util.Random;
import java.util.Scanner;

public class Ej04Aleatorio {
    public static void main(String[] args) {

        // 4: Adivina el número aleatorio
        // Objetivo: Añadir manejo de NumberFormatException al convertir texto a número
        // Instrucción: Añade manejo de NumberFormatException y un finally que diga: "Juego finalizado."

        Scanner scn = new Scanner(System.in);
        Random numeroRandom = new Random();
        int secreto = numeroRandom.nextInt(10) + 1;

        System.out.print("Adivina el número (1-10): ");
        String intentoTexto = scn.nextLine();

        try {
            int intento = Integer.parseInt(intentoTexto);

            if (intento == secreto) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto. El número era: " + secreto);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: debes introducir números enteros (1-10).");
        } finally {
            System.out.println("Juego finalizado.");
        }

        scn.close();
    }
}