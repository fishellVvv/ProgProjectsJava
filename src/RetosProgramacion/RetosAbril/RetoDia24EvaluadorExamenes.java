package RetosProgramacion.RetosAbril;

import java.util.ArrayList;
import java.util.Scanner;

public class RetoDia24EvaluadorExamenes {
    public static void main(String[] args) {

        /*
        Emiliano el profe de Filosofía es el encargado de evaluar un examen de 3 preguntas de opción múltiple (A, B, C).
        Define las respuestas correctas para cada pregunta.
        Pide al usuario que introduzca sus respuestas para cada pregunta.
        Usa un bucle for para leer las 3 respuestas del usuario.
        Usa if/else para comparar cada respuesta del usuario con la respuesta correcta, asignando puntos (ej. 1 punto por respuesta correcta).
        Introduce una "respuesta ambigua" para una de las preguntas (ej. la respuesta correcta podría ser 'A' o 'B').
        Si el usuario elige cualquiera de las opciones ambiguas, asigna medio punto.
        Usa try-catch para manejar si el usuario introduce una opción inválida (algo diferente de A, B o C),
            penalizando con 0 puntos para esa pregunta y mostrando un mensaje de "¡Respuesta inválida!".
        Al final, muestra la puntuación total del usuario.
         */

        Scanner scn = new Scanner(System.in);
        String respuestaUsuario;
        double puntos = 0;
        boolean respuestaValida;

        ArrayList<String[]> preguntasRespuestas = new ArrayList<>(); // lista de preguntas, respuestas y puntuaciónes lista[]{pregunta, respuesta A, puntos A, ...}
        preguntasRespuestas.add(new String[]{"¿Cuál es la principal obra de Platón?",
                "A. La Política", "0", "B. La República", "1", "C. Ética a Nicómaco", "0"});
        preguntasRespuestas.add(new String[]{"¿Qué es más importante según el existencialismo?",
                "A. La existencia", "0.5", "B. La libertad", "0.5", "C. La moral absoluta", "0"});
        preguntasRespuestas.add(new String[]{"¿Qué significa el \"mito de la caverna\" de Platón?",
                "A. Una metáfora sobre la percepción y la verdad", "1", "B. Un texto sobre astronomía", "0", "C. Una parábola sobre la guerra", "0"});

        System.out.println("Bienvenido al examen, a continuación se plantearán 3 preguntas."); // mensaje inicial
        System.out.println("Por favor, escoge una respuesta para cada pregunta.");

        for (int i=0; i<preguntasRespuestas.size(); i++) { // recorremos e imprimimos las preguntas
            System.out.println("\nPregunta " + (i+1) + ":");
            System.out.println(preguntasRespuestas.get(i)[0]);
            for (int j=1; j<preguntasRespuestas.get(i).length; j+=2) { // recorremos e imprimimos las respuestas
                System.out.println(preguntasRespuestas.get(i)[j]);
            }
            System.out.print("\nRespuesta: "); // solicitamos al usuario su respuesta
            respuestaUsuario = scn.nextLine().trim().toUpperCase();
            respuestaValida = false; // indicamos el booleano como falso antes de la comprobación de cada pregunta

            try {
                for (int j=1; j<preguntasRespuestas.get(i).length; j+=2) { // recorremos las respuestas comparando con la opción del usuario
                    if (preguntasRespuestas.get(i)[j].substring(0, 1).equalsIgnoreCase(respuestaUsuario)) {
                        puntos += Double.parseDouble(preguntasRespuestas.get(i)[j+1]); // sumamos los puntos de la opción elegida
                        respuestaValida = true; // cuando la respuesta del usuario coincide con una de las opciones, validamos el booleano
                        break;
                    }
                }
                if (!respuestaValida) { // si la respuesta del usuario no ha coincidido se lanza el error
                    throw new IllegalArgumentException("Respuesta inválida");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("¡Respuesta inválida!");
            }
        }
        System.out.printf("\nTu puntuación final es: %.1f puntos.\n", puntos); // mensajes finales
        if (puntos == 2.5) {
            System.out.println("¡Excelente! ¡Has acertado todo!");
        } else if (puntos >= 1.5) {
            System.out.println("Nada mal, has tocado fondo en la caverna y visto algo de luz.");
        } else {
            System.out.println("Necesitas repasar filosofía... y rápido.");
        }
        scn.close(); // cerramos al salir
    }
}