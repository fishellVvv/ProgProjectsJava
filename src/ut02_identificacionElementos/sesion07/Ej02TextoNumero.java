package ut02_identificacionElementos.sesion07;

import java.util.Scanner;

public class Ej02TextoNumero {
    public static void main(String[] args) {

        // 2: Convertidor de texto a número
        // Objetivo: Añadir manejo de NumberFormatException
        // Instrucción: Añade un bloque try-catch para evitar que el programa se rompa si el usuario escribe letras.

        Scanner scn = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        String texto = scn.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println(numero + " x 10: " + (numero * 10));
        } catch(NumberFormatException e) {
            System.out.println("Eso no es un número válido.");
        }

        scn.close();
    }
}