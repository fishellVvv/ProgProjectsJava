package ut03EstructurasControl.sesion06;

import java.util.Scanner;

public class Ej07Finally {
    public static void main(String[] args) {

        // 7 – Mensaje de fin con finally
        // Haz un programa que intente dividir dos números. Usa try-catch-finally para mostrar siempre un mensaje final que diga "Operación terminada".

        Scanner scn = new Scanner(System.in);
        int dividendo, divisor, resultado;

        System.out.print("Introduce un dividendo: ");
        dividendo = scn.nextInt();
        System.out.print("Introduce otro divisor: ");
        divisor = scn.nextInt();

        try {
            resultado = dividendo / divisor;
            System.out.println("El resultado de la división es: " + resultado);
        } catch(ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre 0.");
        } finally {
            System.out.println("Operación terminada.");
        }

        scn.close();
    }
}