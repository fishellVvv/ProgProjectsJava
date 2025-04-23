package ut03EstructurasControl.sesion06;

import java.util.Scanner;

public class Ej01WhileBreak {
    public static void main(String[] args) {

        // 1 – Salir de un bucle while con break
        // Haz un programa que pida al usuario números enteros positivos. El programa debe terminar cuando el usuario introduzca el número 0. Usa un bucle while con break.

        Scanner scn = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Introduce un número entero positivo (0 para terminar): ");
            numero = scn.nextInt();

            if (numero == 0) {
                break;
            } else if (numero <= 0) {
                System.out.println("Vuelve a intentarlo, el numero debe ser un entero positivo. ");
            } else {
                System.out.println("El número indicado es " + numero);
            }
        }

        System.out.println("Programa finalizado");

        scn.close();
    }
}