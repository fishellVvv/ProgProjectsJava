package RetosProgramacion.RetosAbril;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RetoDia22Canciones {
    public static void main(String[] args) {

        /*
        El programa elige una canción secreta de una lista.
        El usuario tiene un máximo de 4 intentos para adivinarla.
        En cada intento, pide al usuario el nombre de la canción.
        Si acierta, felicítalo y termina.
        Si falla, proporciona una pista "confusa" basada en la canción secreta (ej.
        Si la canción es "Yellow Submarine", una pista podría ser "Tiene algo que ver con un color primario y un vehículo acuático... creo").
        Usa un bucle for para controlar los intentos.
        Si se agotan los intentos, revela la canción secreta.
        Si el usuario introduce una respuesta que no es una cadena de texto válida (intenta convertirla a un número, por ejemplo),
            usa un try-catch para imprimir un mensaje como "¡Eso no suena como el título de una canción!".
         */

        Scanner scn = new Scanner(System.in);
        int cancionesLeidas = 1;
        final int intentosMax = 4;

        ArrayList<String[]> listadoCanciones = new ArrayList<>(); // listado de canciones con sus pistas {pista, nombre canción, autor}
        listadoCanciones.add(new String[]{"Tiene algo que ver con un color primario y un vehículo acuático... creo", "Yellow Submarine", " (The Beatles)"});
        listadoCanciones.add(new String[]{"Una ciudad con nombre de pecado... y mucha fama", "Viva Las Vegas", " (Elvis Presley)"});
        listadoCanciones.add(new String[]{"Una noche... una especie de jinete... fantasmal", "Ghost Riders in the Sky", " (Johnny Cash)"});
        listadoCanciones.add(new String[]{"Es como si fueras rápido, salvaje... y hubieras nacido para ello", "Born to Be Wild", " (Steppenwolf)"});
        listadoCanciones.add(new String[]{"Algo que deseas hacer con mucha fuerza... como liberarte", "I Want to Break Free", " (Queen)"});
        listadoCanciones.add(new String[]{"Una reina con intenciones... poco pacíficas", "Killer Queen", " (Queen)"});
        listadoCanciones.add(new String[]{"Suena a escalera celestial o algo así...", "Stairway to Heaven", " (Led Zeppelin)"});
        listadoCanciones.add(new String[]{"Un alojamiento turístico con nombre elegante", "Hotel California", " (Eagles)"});
        listadoCanciones.add(new String[]{"Huele como el espíritu... pero de adolescentes", "Smells Like Teen Spirit", " (Nirvana)"});
        listadoCanciones.add(new String[]{"Una autopista hacia un destino bastante caluroso", "Highway to Hell", " (AC/DC)"});
        listadoCanciones.add(new String[]{"Una sacudida eléctrica muy sonora", "Thunderstruck", " (AC/DC)"});
        listadoCanciones.add(new String[]{"Una forma cariñosa de referirse a una hija encantadora", "Sweet Child O' Mine", " (Guns N' Roses)"});
        listadoCanciones.add(new String[]{"Nombre de mujer que también es una tormenta emocional", "November Rain", " (Guns N' Roses)"});
        listadoCanciones.add(new String[]{"Cuando nada más importa... salvo la melodía", "Nothing Else Matters", " (Metallica)"});
        listadoCanciones.add(new String[]{"Un número... temido por supersticiones y bestias", "The Number of the Beast", " (Iron Maiden)"});
        listadoCanciones.add(new String[]{"Una advertencia metálica para quien rompe la ley", "Breaking the Law", " (Judas Priest)"});

        ArrayList<Integer> cancionesDisponibles = new ArrayList<>(); // creamos una lista de números incrementales del tamaño de la lista de canciones para poder eliminar canciones repetidas
        for (int i = 0; i < listadoCanciones.size(); i++) { cancionesDisponibles.add(i); }

        System.out.println("Bienvenido al Juego de Adivinar la Canción (JAC)"); // mensaje inicial
        System.out.println("Pulsa ENTER para continuar...");
        scn.nextLine();
        System.out.println("Intenta adivinar las canciones con solo una pista, tienes 4 intentos para cada canción.");

        while (true) { // entramos en un bucle para iterar entre canciones

            System.out.println("\n" + cancionesLeidas + "º canción: ");
            boolean cancionAcertada = false;

            int posCancionesDisponibles = ThreadLocalRandom.current().nextInt(cancionesDisponibles.size()); // generamos un número aleatorio que marca la posición en canciones que quedan disponibles
            int indiceListaCanciones = cancionesDisponibles.remove(posCancionesDisponibles); // obtenemos el índice al que corresponde la canción en el listado y la eliminamos de las disponibles
            String[] cancionSeleccionada = listadoCanciones.get(indiceListaCanciones); // obtenemos la pista de la canción seleccionada
            System.out.println(cancionSeleccionada[0]); // mostramos la pista de la canción seleccionada

            for (int i=1; i<=intentosMax; i++) { // entramos en otro bucle para iterar entre intentos

                try {
                    System.out.print(i + "/4 intentos: ");
                    String respuestaUsuario = scn.nextLine(); // leemos la respuesta del usuario

                    if (respuestaUsuario.matches("\\d+")) { // si la respuesta solo tiene dígitos numéricos lanzamos la excepción
                        throw new Exception("Entrada numérica");
                    }

                    if (cancionSeleccionada[1].trim().equalsIgnoreCase(respuestaUsuario.trim())) { // comparamos la respuesta del usuario con la correcta
                        System.out.println("\n¡Exacto! esa es la canción: " + cancionSeleccionada[1] + cancionSeleccionada[2]);
                        cancionAcertada = true;
                        cancionesLeidas++; // una canción leida más
                        break;
                    } else {
                        System.out.println("Incorrecto, ese no es el nombre.");
                    }
                } catch (Exception e) {
                    System.out.println("¡Eso no suena como el título de una canción!");
                }
            }

            if (!cancionAcertada) { // cuando fallamos mostramos la respuesta correcta
                System.out.println("\nEl nombre de la canción es: " + cancionSeleccionada[1] + cancionSeleccionada[2]);
                cancionesLeidas++; // una canción leida más
            }

            if (!cancionesDisponibles.isEmpty()) { // comprobamos si quedan canciones en la lista
                System.out.println("Hemos leído " + (cancionesLeidas - 1) + " canciones.");
                System.out.println("Pulsa ENTER para continuar o escribe EXIT si deseas salir.");
                String opcion = scn.nextLine();

                if (opcion.equalsIgnoreCase("exit")) { // salimos
                    break;
                }
            } else { // si ya hemos repasado todas las canciones, damos la opción de empezar de nuevo
                System.out.println("\nYa no me quedan mas canciones. ¿quieres volver a empezar?");
                System.out.println("Pulsa ENTER para barajar de nuevo o escribe EXIT si deseas salir.");
                String opcion = scn.nextLine();

                if (opcion.equalsIgnoreCase("exit")) { // salimos
                    break;
                } else {
                    System.out.println("Barajando canciones..."); // para volver a empezar es necesario reiniciar el listado de canciones disponibles
                    cancionesDisponibles.clear();
                    for (int i=0; i<listadoCanciones.size(); i++) { cancionesDisponibles.add(i); }
                    cancionesLeidas = 1; // reiniciamos también el contador de canciones leídas
                    System.out.println("Intenta adivinar las canciones con solo una pista, tienes 4 intentos para cada canción."); // mostramos este mensaje de nuevo para refrescar la memoria
                }
            }
        }
        scn.close(); // cerramos al salir
    }
}