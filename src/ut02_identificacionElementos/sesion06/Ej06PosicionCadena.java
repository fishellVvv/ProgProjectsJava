package ut02_identificacionElementos.sesion06;

import java.util.Scanner;

public class Ej06PosicionCadena {
    public static void main(String[] args) {

        // 6 – Acceder a una posición no válida de una cadena (charAt) con control de excepción
        // Solicita una palabra al usuario y pide una posición. Intenta mostrar el carácter en esa posición usando try-catch. Si se produce un error, muestra un mensaje.

        Scanner scn = new Scanner(System.in);
        String palabra;
        int posicion;
        char letra;

        System.out.print("Escribe una palabra: ");
        palabra = scn.nextLine();
        System.out.print("Ahora dime la posición de una letra. (entre 1 y " + palabra.length() + "): ");
        posicion = scn.nextInt();

        try {
            letra = palabra.charAt(posicion - 1);
            System.out.println("La letra en la posición " + posicion + " es " + letra + ".");
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("Esa posición no existe.");
        }

        scn.close();
    }
}