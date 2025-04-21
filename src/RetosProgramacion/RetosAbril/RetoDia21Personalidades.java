package RetosProgramacion.RetosAbril;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RetoDia21Personalidades {
    public static void main(String[] args) {

        /*
        El robot adivinador de personalidades hace 3 preguntas con 3 opciones cada una (diseña preguntas divertidas como "¿Qué prefieres hacer un sábado por la noche?").
        Cada opción está asociada a una "casa de personalidad" diferente (ej. "Aventurero", "Reflexivo", "Social").
        Usa un bucle for para hacer las 3 preguntas.
        Para cada pregunta, pide al usuario que elija una opción (1, 2 o 3).
        Usa if/else para asignar puntos a cada casa de personalidad según la respuesta elegida.
        Si el usuario introduce una opción inválida (no 1, 2 o 3), usa un try-catch para simular una "confusión del robot" e asigna un punto aleatorio a una de las casas.
        Después de las 3 preguntas, determina la casa con más puntos.
        Si hay un empate, elige una al azar.
        Anuncia la personalidad del usuario con un mensaje divertido basado en la casa ganadora (ej. "¡Eres un intrépido Aventurero, listo para conquistar cualquier código!").
         */

        Scanner scn = new Scanner(System.in);
        // int puntosAventurero = 0;
        // int puntosReflexivo = 0;
        // int puntosSocial = 0;
        int[] puntos = new int[3]; // contador de puntos (0 = Aventurero, 1 = Reflexivo, 2 = Social)

        ArrayList<String[]> listaPreguntas = new ArrayList<>(); // listado de preguntas
        listaPreguntas.add(new String[]{"\n¿Qué prefieres hacer un sábado por la noche?", "1. Escalar una montaña\n2. Leer un libro\n3. Ir de fiesta"});
        listaPreguntas.add(new String[]{"\nTu desayuno ideal es...", "1. Un batido energético\n2. Té con tostadas\n3. Churros con amigos"});
        listaPreguntas.add(new String[]{"\n¿Qué llevarías a una isla desierta?", "1. Una navaja multiusos\n2. Un diario\n3. A tu mejor amigo"});
        listaPreguntas.add(new String[]{"\n¿Tu superpoder favorito sería...?", "1. Volar\n2. Leer la mente\n3. Hablar todos los idiomas"});
        listaPreguntas.add(new String[]{"\nElige una mascota:", "1. Un halcón\n2. Un gato\n3. Un loro"});
        listaPreguntas.add(new String[]{"\nColor que más te define:", "1. Rojo\n2. Azul\n3. Amarillo"});
        listaPreguntas.add(new String[]{"\nEstás en un grupo de trabajo, tú...", "1. Tomas la iniciativa\n2. Organizas y planificas\n3. Conectas a todos"});
        listaPreguntas.add(new String[]{"\nTu transporte favorito:", "1. Moto\n2. Tren\n3. Autobús"});
        listaPreguntas.add(new String[]{"\nTu reacción ante una sorpresa:", "1. ¡Vamos allá!\n2. ¿Qué está pasando?\n3. ¡Qué emoción!"});
        listaPreguntas.add(new String[]{"\nTu lugar favorito en casa:", "1. El balcón\n2. La biblioteca\n3. El salón"});

        ArrayList<Integer> preguntasDisponibles = new ArrayList<>(); // creamos una lista de números incrementales del tamaño de la lista de preguntas para poder eliminar preguntas repetidas
        for (int i = 0; i < listaPreguntas.size(); i++) { preguntasDisponibles.add(i); }

        System.out.println("El Robot Adivinador de Personalidades [◉_◉]"); // mensaje inicial del robot
        System.out.println("Responde a las siguientes preguntas indicando la opción que más se ajuste a ti.");
        System.out.print("(pulsa ENTER para empezar)");
        scn.nextLine(); // solicitamos enter para continuar para que sea más comodo de leer

        for (int i=1; i<=3; i++) { // bucle para iterar tres preguntas de la lista
            int posPreguntasDisponibles = ThreadLocalRandom.current().nextInt(preguntasDisponibles.size()); // generamos un número aleatorio que marca la posición en preguntas que quedan disponibles
            int indiceListaPreguntas = preguntasDisponibles.remove(posPreguntasDisponibles); // obtenemos el índice al que corresponde la pregunta en el listado y la eliminamos de las disponibles
            String[] preguntaSeleccionada = listaPreguntas.get(indiceListaPreguntas); // obtenemos la pregunta seleccionada

            System.out.println(preguntaSeleccionada[0]); // mostramos la pregunta seleccionada
            System.out.println(preguntaSeleccionada[1]); // y mostramos las respuestas
            System.out.print("Respuesta (1-3): ");
            try {
                int respuestaUsuario = Integer.parseInt(scn.nextLine()); // comprobamos que se introduce un entero
                if (respuestaUsuario >= 1 && respuestaUsuario <= 3) { // y comprobamos que sea de 1 a 3
                    puntos[respuestaUsuario -1]++; // sumamos un punto a la opción elegida (-1 porque el array empieza por el 0)
                } else {
                    throw new Exception("Respuesta fuera de rango");
                }
            } catch (Exception e) {
                System.out.println("¡Confusión del robot! Intentémoslo con otra pregunta.");
                i--; // en caso de error restamos un intento para volver a preguntar
            }
        }

        if (puntos[0] == puntos[1] && puntos[0] == puntos[2]) { // si las tres casas de personalidad empatan, decidimos una al azar
            int desempate = ThreadLocalRandom.current().nextInt(3); // creamos un número aleatorio para decantar la personalidad
            puntos[desempate]++;
        }

        System.out.print("\nTest completado! tú personalidad es "); // finálmente lanzamos un mensaje personalizado para cada personalidad
        if (puntos[0] > puntos[1] && puntos[0] > puntos[2]) {
            System.out.println("aventurero.");
            System.out.println("Los aventureros os caracterizáis por lanzaros a lo desconocido sin mirar atrás.\nTu mochila siempre está lista y tu frase favorita es: \"¿Qué podría salir mal?\"");
        } else if (puntos[1] > puntos[0] && puntos[1] > puntos[2]) {
            System.out.println("reflexivo.");
            System.out.println("Los reflexivos os caracterizáis por pensar… mucho… a veces demasiado.\nAnalizas tanto cada situación que hasta tus decisiones llevan bibliografía.");
        } else {
            System.out.println("social.");
            System.out.println("Los sociales os caracterizáis por tener siempre planes... incluso cuando querías quedarte en casa.\nTu superpoder: convertir cualquier reunión en una fiesta.");
        }
        scn.close(); // cerramos al salir
    }
}