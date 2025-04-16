package RetosProgramacion.RetosAbril;

import java.util.Scanner;

public class RetoDia15ValidadorPassword {
    public static void main(String[] args) {

        /*
        Resulta que nos piden que programemos un validador de contraseñas.
        Algo fácil para los alumnos de Prometeo.
        Solo tenemos que decir si, una contraseña introducida por terminal es válida o no.
        Para que una contraseña sea válida debe:

        Tener al menos 8 caracteres.
        Tener al menos una letra minúscula.
        Tener al menos una letra mayúscula.
        Tener al menos un número.
        Tener al menos un símbolo especial de entre los siguientes *, ?, !, ^, “, $.
        No contener la palabra GIT, en ningún formato (ni GIT, ni git, ni gIt, ni giT, ni Git, ni GIt, ni gIT, ni GiT). Odiamos Git.
         */

        Scanner scn = new Scanner(System.in);
        String password;
        boolean passwordValida = false;

        System.out.println("Validador de contraseñas."); // mensaje inicial

        while (!passwordValida) {
            System.out.print("\nPor favor, introduce una contraseña válida: "); // solicitamos la contraseña
            password = scn.nextLine();

            if (password.length() < 8) { // comprobamos la longitud
                System.out.println("❌ La contraseña es demasiado corta, debe tener al menos 8 caracteres");
            } else if (!password.matches(".*[a-z].*")) { // comprobamos las minúsculas con regex
                System.out.println("❌ La contraseña debe tener al menos una letra minúscula");
            } else if (!password.matches(".*[A-Z].*")) { // comprobamos las mayúsculas con regex
                System.out.println("❌ La contraseña debe tener al menos una letra mayúscula");
            } else if (!password.matches(".*[0-9].*")) { // comprobamos los números con regex
                System.out.println("❌ La contraseña debe tener al menos un número");
            } else if (!password.matches(".*[*?!^“$].*")) { // comprobamos caracteres especiales con regex
                System.out.println("❌ La contraseña debe tener al menos símbolo especial");
            } else if (password.toLowerCase().contains("git")) { // pasamos a minúsculas para ver si tiene "git"
                System.out.println("❌ La contraseña no puede contener la palabra 'git' (en ningún formato)");
            } else {
                System.out.println("\n✅ Contraseña válida. ¡Buen trabajo!");
                passwordValida = true; // Al introducir una contraseña válida pasamos la variable a tru para que salga del while
            }
        }
        scn.close();
    }
}