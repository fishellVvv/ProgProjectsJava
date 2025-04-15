package ut02IdentificacionElementos.sesion06;

import java.util.Scanner;

public class Ej10NumeroSecreto {
    public static void main(String[] args) {

        // 10 – Salir de un bucle do-while cuando se adivina un número secreto
        // Crea un número secreto entre 1 y 10. El usuario tiene que adivinarlo. Usa do-while y break para salir cuando acierte.

        Scanner scn = new Scanner(System.in);
        int numeroSecreto = 8;
        int numeroUsuario = 0;

        System.out.println("Estoy pensando en un número secreto del 1 al 10.");

        do {
            System.out.print("Intenta adivinarlo: ");
            numeroUsuario = scn.nextInt();

            if (numeroUsuario == numeroSecreto){
                break;
            }

            System.out.println("Nop, ese no es, vamos a por otro intento.");

        } while(true);

        System.out.println("Exacto! ese es el número secreto.");

        scn.close();
    }
}