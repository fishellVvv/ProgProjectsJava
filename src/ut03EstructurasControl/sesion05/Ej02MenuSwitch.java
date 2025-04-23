package ut03EstructurasControl.sesion05;

import java.util.Scanner;

public class Ej02MenuSwitch {
    public static void main(String[] args) {

        // 2: Uso de switch para menú de opciones
        // 📌 Objetivo: Crear un menú interactivo donde el usuario elija una opción y se muestre un mensaje diferente según su selección.

        Scanner scn = new Scanner(System.in);

        System.out.println("Menú de Opciones: ");
        System.out.println("1. Saludar");
        System.out.println("2. Mostrar fecha");
        System.out.println("3. Salir");

        System.out.print("\nSelecciona una opción escribiendo el número: ");
        int opcion = scn.nextInt();

        switch(opcion) {
            case 1:
                System.out.println("Hola, que tal?");
                break;
            case 2:
                System.out.println("Hoy?, el mejor día!");
                break;
            case 3:
                System.out.println("Byeeee!");
                break;
            default:
                System.out.println("Esa opción no está...");
        }

        scn.close();
    }
}