package RetosProgramacion.RetosAbril;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RetoDia09Aglomeracion {
    public static void main(String[] args) {

        /*
        Los alumnos de Prometeo que cursan DAM/DAW + Master andan muy liados y no tienen claro cuando tienen clase y cuando no.

        Haz un programa que les indique si tienen clase de FP, de Máster, o de las dos en un conjunto de fechas dado.
        El usuario introduce un número N, que indica el número de días que quiere ver,
        se deberá imprimir el número del día, si no tienen nada en esa fecha,
        FP si tiene clase de un módulo de DAM/DAW o Máster si ese día tiene clase de máster.

        Los días múltiplos de 3 tienen clase de FP.
        Los días múltiplos de 5, de máster.
        Los días que son múltiplos de 3 y 5 tienen clase de las dos.

        Ejemplo de entrada:
        ---------------------------------
        15

        Ejemplo de salida:
        ---------------------------------
        1
        2
        FP
        4
        Máster
        FP
        7
        8
        FP
        Máster
        11
        FP
        13
        14
        FP + Máster
         */

        Scanner scn = new Scanner(System.in);

        try {
            System.out.println("Bienvenido al consultor de clases de DAM/DAW + Master."); // Mensajes iniciales
            System.out.print("Dime cuantos días quieres consultar: ");
            int numeroDias = scn.nextInt(); // leemos el número de días a consultar
            System.out.println("A continuación te muestro los días que tienes clase:");

            for (int i = 1; i <= numeroDias; i++) { // Vamos a iterar desde 1 hasta el número de días indicado

                if (i%3==0 && i%5==0) { // Primero comprobamos el caso con dos condiciones para que no se la salte
                    System.out.println("Día: " + i);
                    System.out.println("Clase de FP y de Master");
                } else if (i%3==0) {
                    System.out.println("Día: " + i);
                    System.out.println("Clase de FP");
                } else if (i%5==0) {
                    System.out.println("Día: " + i);
                    System.out.println("Clase de Master");
                } else { // en caso de no tener clase no lo imprimo
                    continue;
                }
            }
        } catch (InputMismatchException e){ // revisamos que el valor introducido sea un entero
            System.out.println("Error: Debes introducir un número entero.");
        }
    }
}