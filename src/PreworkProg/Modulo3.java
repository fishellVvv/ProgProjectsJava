package PreworkProg;

import java.util.Scanner;

public class Modulo3 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // donde lo guardo = lo que guardo
        // concatenar: +

        /*
        String nombre;
        System.out.println("Introduzca el nombre de una persona: ");
        nombre = scn.next();

        System.out.println("Hola, el nombre es " + nombre);
         */

        /*
        Entrenamiento básico:

        Ejercicio 1: Operaciones Básicas con Números
            Escribe un programa que solicite al usuario dos números enteros.
            Usa System.out.println para mostrar mensajes que indiquen al usuario que debe ingresar los números.
            Utiliza Scanner para leer cada número ingresado y almacénalo en una variable de tipo int.
            Imprime ambos números ingresados en un mensaje de confirmación.
         */

        int num1;
        int num2;

        System.out.println("Introduce un número entero: ");
        num1 = scn.nextInt();
        System.out.println("Introduce otro número entero: ");
        num2 = scn.nextInt();

        System.out.println("Los numeros que has introducido son " + num1 + " y " + num2);

        /*
        Entrenamiento avanzado:

        Ejercicio 2: Análisis de Caracteres en un Nombre Completo
            Crea un programa que solicite al usuario su nombre completo.
            Usa nextLine para capturar el nombre completo, luego muestra el nombre completo ingresado.
            Usa next para capturar solo el primer nombre. Imprime el primer nombre ingresado.
            Utiliza charAt para mostrar la primera letra del nombre completo.
         */

        scn.nextLine(); // Para limpiar el salto de linea y que no me afecte a este ejercicio

        System.out.println("Introduce tu nombre completo: ");
        String nombreCompleto = scn.nextLine();
        System.out.println("Tu nombre completo es " + nombreCompleto);

        System.out.println("Introduce solo tu primer nombre: ");
        String primerNombre = scn.next();
        System.out.println("Tu primer nombre es " + primerNombre);

        char primeraLetra = primerNombre.charAt(0);
        System.out.println("Tu primera inicial es " + primeraLetra);

        scn.close();

    }
}