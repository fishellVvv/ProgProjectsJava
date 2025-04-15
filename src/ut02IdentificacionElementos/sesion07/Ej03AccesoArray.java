package ut02IdentificacionElementos.sesion07;

import java.util.Scanner;

public class Ej03AccesoArray {
    public static void main(String[] args) {

        // 3: Acceso a un array
        // Objetivo: Añadir manejo de ArrayIndexOutOfBoundsException
        // Instrucción: Usa try-catch para evitar error si se ingresa una posición incorrecta (como 5 o -1).

        Scanner scn = new Scanner(System.in);
        String[] frutas = {"Manzana", "Banana", "Naranja"};

        try {
            System.out.print("Introduce un número entre 0 y 2: ");
            int posicion = scn.nextInt();
            System.out.println("Fruta seleccionada: " + frutas[posicion]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: El número debe ser entre 0 y 2");
        }

        scn.close();
    }
}