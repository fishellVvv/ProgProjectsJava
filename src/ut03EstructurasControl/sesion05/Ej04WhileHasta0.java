package ut03EstructurasControl.sesion05;

import java.util.Scanner;

public class Ej04WhileHasta0 {
    public static void main(String[] args) {

        // 4: Uso de while para contar hasta que el usuario ingrese 0
        // 📌 Objetivo: Pedir números al usuario hasta que ingrese 0.

        Scanner scn = new Scanner(System.in);

        System.out.print("Introduce un número entero (0 para salir): ");
        int numero = scn.nextInt();

        while(numero != 0) {
            System.out.println("Has introducido " + numero);
            System.out.print("Introduce otro numero (0 para salir): ");
            numero = scn.nextInt();
        }

        System.out.println("Programa finalizado.");

        scn.close();
    }
}