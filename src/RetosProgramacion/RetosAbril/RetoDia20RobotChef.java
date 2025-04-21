package RetosProgramacion.RetosAbril;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RetoDia20RobotChef {
    public static void main(String[] args) {

        /*
        Un robot chef está aprendiendo a cocinar, pero solo conoce recetas con ciertos ingredientes.
        Tienes dos listas de ingredientes: ingredientes_conocidos (ej. "tomate", "cebolla", "ajo") y ingredientes_secretos (ej. "polvo de hadas", "lágrimas de unicornio").
        - Pide al usuario que introduzca una lista de 5 ingredientes para una receta.
        Usa un bucle for para iterar sobre los ingredientes del usuario.
        Para cada ingrediente, verifica con if/else si está en ingredientes_conocidos. Si lo está, el robot dice "¡Excelente elección!".
        Si el ingrediente está en ingredientes_secretos, el robot, usando un try-catch para simular una reacción mágica inesperada, imprime un mensaje como "¡Chispas! ¡Este ingrediente tiene propiedades mágicas!".
        Si el ingrediente no está en ninguna de las listas, el robot dice "¿Qué es eso? ¡No tengo ni idea de cómo usarlo!".
        Al final, muestra cuántos ingredientes conocidos, secretos y desconocidos intentó usar el usuario.
         */

        Scanner scn = new Scanner(System.in);
        ArrayList<String> ingredientesConocidos = new ArrayList<>(Arrays.asList("tomate", "cebolla", "ajo", "aceite", "sal", "pimienta", "pollo", "ternera", "pescado", "arroz", "pasta", "pan", "queso", "huevo")); // lista de ingredientes conocidos
        ArrayList<String> ingredientesSecretos = new ArrayList<>(Arrays.asList("polvo de hadas", "lágrimas de unicornio", "esencia de dragón", "pluma de fénix", "brisa de luna", "escama de sirena")); // lista de ingredientes secrétos
        int numIngConocidos = 0;
        int numIngSecretos = 0;
        int numIngDesconocidos = 0;

        System.out.println("Bienvenido! soy el robot Chef, vamos a evaluar los ingredientes."); // mensaje inicial
        System.out.println("Por favor, a continuación ve diciéndome 5 ingredientes de tu receta.\n");

        for (int i=1; i<=5; i++) { // bucle para solicitar los 5 ingredientes
            System.out.print("Ingrediente " + i + ": ");
            String ingrediente = scn.nextLine().toLowerCase(); // leemos el ingrediente y lo guardamos en minúsculas

            if (ingredientesSecretos.contains(ingrediente)) { // comprobamos si está en la lista de ingredientes secretos
                try {
                    throw new Exception("¡Chispas! ¡Este ingrediente tiene propiedades mágicas!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    numIngSecretos++; // sumamos 1 a la lista de ingredientes secretos usados
                }
            } else if(ingredientesConocidos.contains(ingrediente)) { // comprobamos si está en la lista de ingredientes conocidos
                System.out.println("¡Excelente elección!");
                numIngConocidos++; // sumamos 1 a la lista de ingredientes conocidos usados
            } else {
                System.out.println("¿Qué es eso? ¡No tengo ni idea de cómo usarlo!");
                numIngDesconocidos++; // sumamos 1 a la lista de ingredientes desconocidos usados
            }
        }

        System.out.println("\n¡Perfecto!, para nuestra receta tenemos: "); // mensaje final con recuento de tipos de ingredientes
        if (numIngConocidos > 0) System.out.println(numIngConocidos + " ingredientes que conozco."); // si no hay ingredientes de este tipo no se muestra este mensaje
        if (numIngSecretos > 0) System.out.println(numIngSecretos + " ingredientes secretos con propiedades mágicas."); // si no hay ingredientes de este tipo no se muestra este mensaje
        if (numIngDesconocidos > 0) System.out.println(numIngDesconocidos + " ingredientes que no me suenan de nada."); // si no hay ingredientes de este tipo no se muestra este mensaje
        if (numIngDesconocidos > 3) {
            System.out.println("\nA ver como sale este experimento, ya me contarás."); // si el número de ingredientes desconocidos es mayor a 3 el robot no se atreve a predecir un buen resultado
        } else {
            System.out.println("\nVa a quedar una receta increíble!!!");
        }
        scn.close();
    }
}