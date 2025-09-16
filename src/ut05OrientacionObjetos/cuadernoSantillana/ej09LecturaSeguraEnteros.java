package ut05OrientacionObjetos.cuadernoSantillana;

// 9. Lectura segura de enteros
// Usa Scanner para pedir un entero y captura el error si el usuario introduce un valor no numérico.

import java.util.Scanner;

public class ej09LecturaSeguraEnteros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada;
        int num;

        System.out.print("Introduce un numero entero: ");
        entrada = sc.nextLine();

        try {
            num = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Error: introduce un número válido.");
            return;
        }

        System.out.println("El número introducido es válido.");
    }
}