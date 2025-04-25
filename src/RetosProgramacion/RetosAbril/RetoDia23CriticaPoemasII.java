package RetosProgramacion.RetosAbril;

import java.util.Scanner;

public class RetoDia23CriticaPoemasII {
    public static void main(String[] args) {

        /*
        Lola te va a pedir 2 palabras e intentará determinar si riman.
        La regla de rima simplificada es: las ÚLTIMAS DOS letras deben ser iguales (ignorando mayúsculas/minúsculas).
        Usa if/else para comparar las últimas dos letras.
        Si riman, imprime "¡Estas palabras riman!".
        Si no, imprime "¡No riman!".
        Usa bloques try-catch para manejar posibles errores:
        Si alguna de las palabras tiene menos de dos letras, captura la excepción (ej. StringIndexOutOfBoundsException)
            y muestra un mensaje como "¡Necesito al menos dos letras para rimar!".
        Si el usuario introduce algo que no se puede tratar como una cadena
            (aunque esto es más difícil de simular directamente con nextLine(),
            puedes intentarlo si pides la entrada de otra forma), captura un error
            genérico y responde con "¿Eso se considera una palabra?".
         */

        Scanner scn = new Scanner(System.in);

        try (scn) { // try (scn) cierra el Scanner al salir "try-with-resources"
            String palabra1, palabra2;

            System.out.println("Bienvenido de nuevo poeta, escribe dos palabras que rimen y nuestra crítica Lola te lo analizará."); // saludo e instrucciones
            System.out.println("-Lola: Veamos que tienes para mi:");

            System.out.print("Primera palabra: "); // solicitamos las palabras
            palabra1 = scn.nextLine();
            System.out.print("Segunda palabra: ");
            palabra2 = scn.nextLine();

            if (palabra1.equalsIgnoreCase(palabra2)) { // comprobamos si las palabras son iguales
                System.out.println("\n-Lola: Homer con Homer rima... ¡¡¡Muuuak!!!");
            } else if (palabra1.charAt(palabra1.length() - 2) == palabra2.charAt(palabra2.length() - 2) && // comparamos la penultima letra de cada palabra
                    palabra1.charAt(palabra1.length() - 1) == palabra2.charAt(palabra2.length() - 1)) { // y la última
                System.out.println("\n-Lola: ¡Estas palabras riman!"); // si coinciden
            } else {
                System.out.println("\n-Lola: ¡No riman!"); // si no coinciden
            }
        } catch (StringIndexOutOfBoundsException e) { // al hacer la comprobación de la penúltima letra, si solo tiene 1 letra saltará a este error
            System.out.println("\n-Lola: ¡Necesito palabras de al menos dos letras para rimar!");
        } catch (Exception e) { // en caso de otros errores de entrada de palabra, salta este
            System.out.println("\n-Lola: ¿Eso se considera una palabra?");
        }
    }
}