package ut02_identificacionElementos.sesion06;

import java.util.Scanner;

public class Ej08SumaPositivos {
    public static void main(String[] args) {

        // 8 – Leer números y sumar los positivos, ignorando los negativos con continue
        // Pide al usuario 5 números enteros. Suma solo los positivos usando continue para ignorar los negativos.

        Scanner scn = new Scanner(System.in);
        int numero = 0;
        int resultado = 0;

        System.out.println("Introduce a continuación 5 números positivos (los negativos se ignorarán).");

        for(int i = 1; i<=5; i++) {
            System.out.print("numero" + i + ": ");
            numero = scn.nextInt();

            if(numero < 0) {
                continue;
            }

            resultado = resultado + numero;
        }

        System.out.println("La suma total es: " + resultado);

        scn.close();
    }
}