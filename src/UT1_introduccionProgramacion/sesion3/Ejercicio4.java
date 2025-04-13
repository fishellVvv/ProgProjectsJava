package UT1_introduccionProgramacion.sesion3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        // 4️⃣ Crea un programa que reciba dos números y determine cuál es mayor, menor o si son iguales.

        Scanner scn = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int num1 = scn.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = scn.nextInt();

        if(num1>num2) {
            System.out.println("El primer número es mayor.");
        } else if (num1==num2) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("El primer número es menor.");
        }

        scn.close();

    }
}