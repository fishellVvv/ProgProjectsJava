package RetosProgramacion.RetosAbril;

import java.util.Scanner;

public class RetoDia04Boom {
    public static void main(String[] args) {

        /*
        Un resplandor y hace ¡BOOM! y digo, ains ya está aquí la guerra
        Como dice la señora del famoso meme, un día estalló la guerra. Haz un programa que, dado un número que se pasa por entrada, haga una cuenta atrás y acabe con un ¡BOOM!.

        Ejemplo de entrada:
        -----------------------------
        5

        Ejemplo de salida:
        -----------------------------
        5
        4
        3
        2
        1
        ¡BOOM!
         */

        Scanner scn = new Scanner(System.in);

        System.out.print("- La Antonia: Un resplandor...\n Indica la duración del resplandor: ");
        int duracionResplandor = scn.nextInt(); // solicitamos la duración de la cuenta atrás

        for (int i=duracionResplandor; i>0; i--) { // recorremos en un bucle todas las posiciones desde el valor dado hasta 1
            System.out.print(i + ", ");
        }

        System.out.println("\n- La Antonia: ...y hace ¡BOOM! y digo, ains ya está aquí la guerra"); // y ¡BOOM!

        scn.close();
    }
}