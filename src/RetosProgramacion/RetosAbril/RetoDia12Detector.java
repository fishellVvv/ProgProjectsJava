package RetosProgramacion.RetosAbril;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RetoDia12Detector {
    public static void main(String[] args) {

        /*
        Pide al usuario que introduzca varios números enteros (uno por uno, y que indique "fin" para terminar).
        El programa debe verificar si cada número introducido es un "número de la suerte".
        Se considera un número de la suerte si es múltiplo de 7 (el resto de la división entre 7 es 0).
        Por cada número de la suerte encontrado, el programa imprimirá "¡[número] es un número de la suerte!".
        Al final, mostrará cuántos números de la suerte se encontraron en total.

        Pista: No olvides usar el try/catch 🙂
         */

        Scanner scn = new Scanner(System.in);
        int numerosSuerte = 0;
        int numeroUsuario;

        System.out.println("Bienvenido al detector de números de la suerte."); // texto de inicio

        try {
            System.out.println("Introduce todos los números que quieras a continuación:"); // le indicamos las instrucciones
            System.out.println("(escribe `fin` en cualquier momento para terminar)");
            while (true) {
                numeroUsuario = scn.nextInt(); // leemos el dato indicado por el usuario
                if (numeroUsuario % 7 == 0) { // comprobamos si es numero de la suerte para sumar uno al contador y dar el mensaje
                    numerosSuerte++;
                    System.out.println("¡" + numeroUsuario + " es un número de la suerte!");
                }
            }

        } catch (InputMismatchException e){ // revisamos que el valor introducido sea un entero y si no lo es salimos con el mensaje final
            System.out.println("Fin del juego.");
            System.out.println("Has acumulado " + numerosSuerte + " números de la suerte.");
        }

        scn.close();
    }
}