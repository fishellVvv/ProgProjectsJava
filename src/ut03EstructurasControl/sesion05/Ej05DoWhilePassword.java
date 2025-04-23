package ut03EstructurasControl.sesion05;

import java.util.Scanner;

public class Ej05DoWhilePassword {
    public static void main(String[] args) {

        // 5: Uso de do-while para pedir contraseña
        // 📌 Objetivo: Pedir una contraseña y no permitir el acceso hasta que el usuario ingrese java123.

        Scanner scn = new Scanner(System.in);
        String password;

        do {
            System.out.print("Introduce la contraseña: ");
            password = scn.nextLine();
        } while(!password.equals("java123"));

        System.out.println("Acceso concedido.");

        scn.close();
    }
}