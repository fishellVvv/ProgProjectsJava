package ut02IdentificacionElementos.sesion06;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ej09DetectarPalabra {
    public static void main(String[] args) {

        // 9 – Detectar si se ha introducido texto en lugar de número (try-catch)
        // Pide al usuario que introduzca un número. Si escribe una palabra u otro texto, el programa debe capturar la excepción y mostrar "Eso no es un número".

        Scanner scn = new Scanner(System.in);
        int numero = 0;

        try {
            System.out.print("Introduzca un número: ");
            numero = scn.nextInt();
            System.out.println("El número introducido es " + numero);
        } catch(InputMismatchException e) {
            System.out.println("El valor introducido no es un número.");
        }

        scn.close();
    }
}