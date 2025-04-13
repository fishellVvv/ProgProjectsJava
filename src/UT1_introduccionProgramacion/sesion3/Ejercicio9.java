package UT1_introduccionProgramacion.sesion3;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        // 9️⃣ Escribe un código que reciba un número e indique si es par o impar usando el operador módulo (%).

        Scanner scn = new Scanner(System.in);

        System.out.println("Escribe un número entero: ");
        int num = scn.nextInt();

        if(num%2==0) {
            System.out.println("Es un número par.");
        } else {
            System.out.println("Es un número impar.");
        }

    }
}