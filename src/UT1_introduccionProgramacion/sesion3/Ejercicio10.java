package UT1_introduccionProgramacion.sesion3;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        // 🔟 Define una constante TASA_CAMBIO con el valor 1.12 (dólar a euro). Convierte una cantidad de dólares ingresada por el usuario a euros.

        Scanner scn = new Scanner(System.in);

        final float TASA_CAMBIO = 1.12f;

        System.out.println("Conversor de dólares a euros");
        System.out.println("Introduce una cantidad de dólares: ");
        float dolares = scn.nextFloat();

        System.out.println("El cambio a euros es: " + dolares * TASA_CAMBIO + " €");

    }
}