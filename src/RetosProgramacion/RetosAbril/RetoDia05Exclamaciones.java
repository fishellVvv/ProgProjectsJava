package RetosProgramacion.RetosAbril;

import java.util.Scanner;

public class RetoDia05Exclamaciones {
    public static void main(String[] args) {

        /*
        Jordi nunca se acuerda de abrir las exclamaciones. Él dice que es porque en catalán no se abren las exclamaciones, pero yo creo que simplemente no sabe escribir.
        Vamos a crear un programa que asegure que hay tantos abrir exclamación (¡) como cerrar exclamación (!) para flamearlo.

        Ejemplo de entrada:
        -------------------------
        ¡¡¡Caramba!!!
        Hola!

        Ejemplo de salida:
        -------------------------
        Si
        No
         */

        Scanner scn = new Scanner(System.in);
        int conteoExclamaciones = 0; // Definimos un entero donde vamos a ir contabilizando las exclamaciónes

        System.out.print("Escribe tu frase: "); // Solicitamos y escaneamos la frase
        String frase = scn.nextLine();

        for (int i=0; i<frase.length(); i++) { // Revisamos la frase letra por letra para buscar las exclamaciones
            if (frase.charAt(i) == '¡') {
                conteoExclamaciones++; // cuando se abre una exclamación sumamos 1
            }else if (frase.charAt(i) == '!') {
                conteoExclamaciones--; // cuando se cierra una exclamación restamos 1
            }
        }

        if (conteoExclamaciones == 0) { // Si las abiertas y las cerradas son las mismas el conteo estará a cero
            System.out.println("Tu frase no tiene exclamaciones sin cerrar. ヽ(´▽`)/");
        } else if (conteoExclamaciones < 0) { // Si se han cerrado más de las que se han abierto el conteo será negativo
            System.out.println("Tu frase tiene " + (conteoExclamaciones * -1) + " exclamaciones sin abrir. (ಥ_ಥ)");
        } else { // Si se han abierto más de las que se han cerrado el conteo será positivo
            System.out.println("Tu frase tiene " + conteoExclamaciones + " exclamaciones sin cerrar. (；￣Д￣)");
        }
        scn.close();
    }
}