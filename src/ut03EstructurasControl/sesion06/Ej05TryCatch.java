package ut03EstructurasControl.sesion06;

import java.util.Scanner;

public class Ej05TryCatch {
    public static void main(String[] args) {

        // 5 – Dividir dos números con try-catch
        // Haz un programa que divida dos números enteros introducidos por el usuario. Usa try-catch para evitar que el programa se rompa si el divisor es 0.


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
        }

        scn.close();
    }
}