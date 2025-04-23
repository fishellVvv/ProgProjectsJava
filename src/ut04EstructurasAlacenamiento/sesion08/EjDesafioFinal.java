package ut04EstructurasAlacenamiento.sesion08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjDesafioFinal {
    public static void main(String[] args) {


        /*
        Haz un pequeño programa que permita al usuario gestionar una lista de la compra:
            • Añadir productos.
            • Mostrar productos.
            • Eliminar productos por nombre.
            • Mostrar la lista ordenada alfabéticamente.
         */

        Scanner scn = new Scanner(System.in);
        ArrayList<String> listaProductos = new ArrayList<>();
        int opcion = 1;

        try {
            while (opcion < 5 && opcion > 0) {
                System.out.println("Lista de productos. Elija una opción:");
                System.out.println("1. Añadir producto");
                System.out.println("2. Mostrar productos");
                System.out.println("3. Eliminar producto");
                System.out.println("4. Mostrar la lista ordenada alfabéticamente");
                System.out.println("5. Salir");

                opcion = scn.nextInt();
                scn.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Introduce el nombre del producto: ");
                        listaProductos.add(scn.nextLine());
                        System.out.println("Producto añadido (pulsa ENTER para continuar)");
                        scn.nextLine();
                        break;
                    case 2:
                        System.out.println("Lista de productos:");
                        System.out.println(listaProductos);
                        System.out.println("(pulsa ENTER para continuar)");
                        scn.nextLine();
                        break;
                    case 3:
                        System.out.print("Introduce el nombre del producto a eliminar: ");
                        listaProductos.remove(scn.nextLine());
                        System.out.println("Producto eliminado (pulsa ENTER para continuar)");
                        scn.nextLine();
                        break;
                    case 4:
                        System.out.println("Lista de productos ordenada:");
                        Collections.sort(listaProductos);
                        System.out.println(listaProductos);
                        System.out.println("(pulsa ENTER para continuar)");
                        scn.nextLine();
                        break;
                }
            }
            if (opcion == 5) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Error: el valor no existe en la lista.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Datos incorrectos.");
        }

        scn.close();
    }
}