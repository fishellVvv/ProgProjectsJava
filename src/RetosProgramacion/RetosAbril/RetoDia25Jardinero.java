package RetosProgramacion.RetosAbril;

import java.util.ArrayList;
import java.util.Scanner;

public class RetoDia25Jardinero {
    public static void main(String[] args) {

        /*
        Crea un programa que pida al usuario que introduzca nombres de flores.
        Almacena estos nombres en una lista.
        Luego, con un bucle for-each, revisa cada nombre.
        Si el nombre tiene menos de 3 letras, ¡decláralo una "palabra marchita" y usa un try-catch para intentar
            acceder a una cuarta letra (que no existirá), capturando la StringIndexOutOfBoundsException con un mensaje
            divertido como: "¡Tan corta que ni siquiera tiene una cuarta letra para oler!".
         */

        Scanner scn = new Scanner(System.in);
        ArrayList<String> nombresFlores = new ArrayList<>();
        int contadorFlores = 0;
        String nombre;

        System.out.println("Bienvenido al Jardinero de Palabras Marchitas."); // mensaje de bienvenida
        System.out.println("A continuación introduce el nombres de flores (pulsa enter sin escribir nada para finalizar)\n");

        do { // pedimos nombres de flores hasta que el usuario pulse enter sin escribir nada
            System.out.print("Nombre de la flor " + (contadorFlores+1) + ": ");
            nombre = scn.nextLine();
            if (!nombre.isEmpty()) { // si se escribe algo, lo guardamos y sumamos 1 al contador
                nombresFlores.add(nombre);
                contadorFlores++;
            }
        } while (!nombre.isEmpty()); // mientras se escriba algo seguimos

        for (String flor : nombresFlores) { // iteramos por cada flor revisando su longitud
            System.out.println("Analizando la flor " + flor + "...");
            try {
                flor.charAt(3); // si en la cuarta letra no hay nada esta línea creará una excepción de tipo IndexOutOfBounds
                System.out.println("Ésta es una flor curiosa... 🌸"); // si no salta la excepción se da este mensaje
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("¡Tan corta que ni siquiera tiene una cuarta letra para oler! 🌱"); // al saltar la excepción se da este mensaje
            }
        }
        scn.close(); // cerramos al salir
    }
}