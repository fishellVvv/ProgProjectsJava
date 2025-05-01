package RetosProgramacion.RetosAbril;

import java.util.Scanner;

public class RetoDia11Adivinanza {
    public static void main(String[] args) {

        /*
        El programa elige una palabra secreta (por ejemplo, "programar").
        El usuario tiene 5 intentos para adivinar la palabra.
        En cada intento, el programa compara la palabra introducida por el usuario con la palabra secreta.
        Si son iguales, muestra un mensaje de felicitación y termina.
        Si no son iguales, indica cuántos intentos le quedan.
        Si se agotan los intentos sin adivinar, muestra la palabra secreta y un mensaje de "¡Game Over!".
         */

        Scanner scn = new Scanner(System.in);
        String palabraSecreta = "programar";
        String palabraUsuario;
        int numeroIntentos = 5;

        System.out.println("Adivina la palabra secreta (tienes 5 intentos)."); // texto inicial

        for (int i = 1; i<=numeroIntentos; i++) { // hacemos un bucle que itere para cada intento
            System.out.print("Intento número " + i + ": "); // solicitamos la palabra
            palabraUsuario = scn.nextLine();

            if(palabraUsuario.equals(palabraSecreta)) { // en caso de acertarla felicitamos y salimos del bucle
                System.out.println("Palabra correcta.\n ¡You Win!");
                break;
            }else if (i < numeroIntentos) { // si falla comprobamos si quedan intentos y se lo indicamos al usuario
                System.out.println("Palabra incorrecta, te quedan " + (numeroIntentos - i) + " intentos.");
            } else System.out.println("Palabra incorrecta.\n ¡Game Over!"); // si falla y no le quedan intentos pues game over
        }
        scn.close();
    }
}