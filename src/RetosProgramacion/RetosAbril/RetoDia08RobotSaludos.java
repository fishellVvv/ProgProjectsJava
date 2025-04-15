package RetosProgramacion.RetosAbril;

import java.util.Scanner;

public class RetoDia08RobotSaludos {
    public static void main(String[] args) {

        /*
        Escribe un programa que le pregunte al usuario su nombre.
        Si el nombre comienza con la letra "A" (mayúscula o minúscula), el robot responderá con un saludo entusiasta como: ¡Hola, Asombroso/a "Nombre"!.
        Si el nombre tiene más de 7 letras, el robot dirá: ¡Vaya, "Nombre", ¡qué nombre tan largo y sofisticado!.
        Para cualquier otro nombre, el robot simplemente dirá: Saludos, "Nombre".

        ¡Prepara al robot para t_odo tipo de nombres! Como un saludo especial a un nombre que empiece por A y tenga 7 letras, o que cuente un chiste si saluda a Jaimito...
         */

        Scanner scn = new Scanner(System.in);
        String nombre;
        char inicial;

        System.out.println("¡Buenas!, ¿Como te llamas?"); // preguntamos el nombre y lo escaneamos
        nombre = scn.nextLine().toLowerCase(); // lo pasamos a minúsculas t_odo
        inicial = nombre.charAt(0); // guardamos la primera letra en minúscula
        nombre = Character.toUpperCase(inicial) + nombre.substring(1); // pasamos ahora la Inicial del nombre a mayúscula

        if (inicial == 'a' && nombre.length() > 7) { // compruebo primero los casos compuestos para que no se los salte
            System.out.println("¡Hola, Asombroso/a " + nombre + ", qué nombre tan largo y sofisticado!");
        } else if (nombre.length() > 7) {
            System.out.println("¡Vaya, " + nombre + ", qué nombre tan largo y sofisticado!");
        } else if (inicial == 'a') {
            System.out.println("¡Hola, Asombroso/a " + nombre + "!");
        } else if (nombre.equals("Jaimito")) {
            System.out.println("Me se un chiste con tu nombre;\n—Profe, ¿me castigaría por algo que no he hecho?\n—Claro que no, Jaimito.\n—¡Menos mal! Porque no he hecho los deberes."); // perdón...
        } else if (nombre.equals("Victor")) {
            System.out.println("Ah si, otra vez tu... Hola, supongo...");
        } else {
            System.out.println("Saludos, " + nombre + ".");
        }

        scn.close();
    }
}