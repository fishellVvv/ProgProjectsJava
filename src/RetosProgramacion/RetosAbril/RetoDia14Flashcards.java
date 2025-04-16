package RetosProgramacion.RetosAbril;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RetoDia14Flashcards {
    public static void main(String[] args) {

        /*
        Hoy en clase, a Federico le han dicho que las flashcards son un buen mét_odo de estudio.
        Pero Federico no tiene nada para escribir en su casa. ¿Se te ocurre alguna forma para que pueda estudiar con el mét_odo mencionado?

        Pues claro que sí, vas a crear un programa que:
        Almacene las flashcards en una lista (pregunta, respuesta).
        Permita al usuario añadir nuevas flashcards.
        Muestra una pregunta aleatoria de la lista.
        Solicite una respuesta del usuario.
        Compare la respuesta del usuario con la correcta.
        Indique si la respuesta es correcta o incorrecta.
        Permita continuar practicando o salir.

        Ejemplo:
        ------------------------
        Anverso: La programación es…
        Reverso: Darle una serie de instrucciones a una máquina para que ejecute una acción específica.
         */

        Scanner scn = new Scanner(System.in);
        int opcion = 0;

        ArrayList<String[]> flashcards = new ArrayList<>();
        // Flashcards precargadas
        flashcards.add(new String[]{"La programación es…", "Darle una serie de instrucciones a una máquina para que ejecute una acción específica."});
        flashcards.add(new String[]{"¿Cual es la mejor película de la historia?", "The Matrix"});
        flashcards.add(new String[]{"¿Cual es el sentido de la vida, el universo y todo lo demás?", "42"});

        System.out.println("Bienvenido Federico, iniciando flashcards:\n"); // mensaje de bienvenida

        while (opcion != 3) { // si ponemos la opción de salir terminamos

            System.out.println("1. Añadir nuevas Flashcards.");
            System.out.println("2. Pregunta aleatoria.");
            System.out.println("3. Salir.");
            System.out.print("\nElige una opción: "); // pedimos la opción
            opcion = scn.nextInt();
            scn.nextLine(); // esto limpia la linea

            switch (opcion) {
                case 1:
                    System.out.println("\nAñadir nuevas Flashcards: ");

                    System.out.print("\nIntroduce la pregunta: "); // pedimos una pregunta y la guardamos
                    String pregunta = scn.nextLine();

                    System.out.print("Introduce la respuesta: "); // pedimos una respuesta y la guardamos
                    String respuesta = scn.nextLine();

                    String[] nuevaFlashcard = {pregunta, respuesta};
                    flashcards.add(nuevaFlashcard);

                    System.out.println("\nFlashcard añadida, ¿que quieres hacer ahora?\n");
                    break;
                case 2:
                    System.out.println("\nPregunta aleatoria: ");

                    int preguntaRandom = ThreadLocalRandom.current().nextInt(flashcards.size()); // creamos un número aleatorio dentro del tamaño de la lista
                    String[] preguntaSeleccionada = flashcards.get(preguntaRandom); // buscamos la pregunta que se ha seleccionado

                    System.out.println("\nPregunta: ");
                    System.out.println(preguntaSeleccionada[0]); // mostramos la pregunta aleatoria
                    System.out.print("\nTu respuesta: ");
                    String respuestaUsuario = scn.nextLine();  // leemos la respuesta del usuario

                    if (respuestaUsuario.equalsIgnoreCase(preguntaSeleccionada[1])) { // si la respuesta es igual a la almacenada es correcto
                        System.out.println("\n✅ ¡Correcto!\n");
                    } else { // si no es exactamente igual le decimos la correcta
                        System.out.println("\n❌ Incorrecto. La respuesta era: " + preguntaSeleccionada[1] + "\n");
                    }

                    System.out.print("Pulsa ENTER para volver al menú..."); // pedimos pulsar enter para dar tiempo a leer
                    scn.nextLine();

                    System.out.println("\n¿Que quieres hacer ahora?\n");
                    break;
                case 3:
                    System.out.println("\nByeeee!"); // despedida
                    break;
                default:
                    System.out.println("\nEsa opción no está, elige una estas:\n"); // en caso de que la opción no exista volvemos al menú
            }
        }
        scn.close();
    }
}