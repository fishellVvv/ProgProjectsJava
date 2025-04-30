package ut04EstructurasAlacenamiento.sesion09;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej08Buscar {
    public static void main(String[] args) {

        /*
        8. Buscar en la lista
        Pregunta al usuario un nombre, y busca si está en la lista. Si está, muestra su posición.
         */

        Scanner scn = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Luis");
        nombres.add("Antonio");
        nombres.add("Francisco");
        nombres.add("José");

        System.out.print("Introduce un nombre: ");
        String nombreUsuario = scn.nextLine();

        if (nombres.contains(nombreUsuario)) {
            System.out.println("El nombre se encuentra en la posición " + (nombres.indexOf(nombreUsuario) + 1) + " de la lista.");
        } else System.out.println("El nombre no se encuentra en la lista.");

        scn.close();
    }
}