package RetosProgramacion.RetosAbril;

import java.util.Scanner;

public class RetoDia17CriticaPoemas {
    public static void main(String[] args) {

        /*
        Pide al usuario que introduzca un poema de hasta 4 líneas. Lola la Crítica intentará analizar su "métrica" según reglas muy extrañas:
        Línea 1: Debe tener exactamente 5 palabras.
        Línea 2: Debe contener la letra 'z' al menos una vez.
        Línea 3: Debe tener más vocales que consonantes.
        Línea 4: Debe terminar con la misma palabra con la que empezó la primera línea (ignorando mayúsculas/minúsculas).

        Para llevar a cabo el programa:
        Usa un bucle for para leer cada línea del poema.
        Usa if/else para verificar si cada línea cumple su regla. Si no, Lola da una crítica divertida (ej., "¡Demasiadas palabras para mi gusto!", "¡Le falta un toque de 'z'!".).
        Usa try-catch para manejar si el usuario introduce menos de 4 líneas (simulando un poema incompleto).
        Al final, da una "puntuación poética" basada en cuántas reglas cumplió el poema.
         */

        Scanner scn = new Scanner(System.in);
        int puntuacion = 0;
        int contadorPalabras;
        int vocalesConsonantes = 0;
        String primeraPalabra = "";
        String ultimaPalabra = "";

        System.out.println("Bienvenido poeta, escribe a continuación una cuarteta (poema de cuatro versos) y nuestra crítica Lola te lo analizará."); // Saludo y instrucciones
        System.out.println("-Lola: Veamos que tienes para mi:");

        for (int i=0; i<4; i++) { // Iniciamos un bucle para recorrer los 4 versos
            String verso;
            try {
                verso = scn.nextLine();
                if (verso.isBlank()) { // Comprobamos si algún verso está vacío
                    throw new Exception("Verso vacío");
                }
            } catch (Exception e) { // En caso de un verso vacío Lola se enfada y termina el programa
                System.out.println("\nLola: ¡Un poema incompleto! Me niego a seguir leyendo semejante abandono lírico.");
                scn.close(); // Cerramos el scanner antes de irnos
                return;
            }

            verso = verso.toLowerCase(); // Algunas comprobaciones requieren pasar el verso a minúsculas para poder comparar con otras palabras

            contadorPalabras = verso.split(" ").length; // Primera comprobación, las palabras del verso
            if (contadorPalabras == 5) {
                puntuacion += 1; // Lola da un punto por cada verso con 5 palabras
            } else if (contadorPalabras < 5) {
                System.out.println("Lola: ¡Pocas palabras para mi gusto!");
            } else {
                System.out.println("Lola: ¡Demasiadas palabras para mi gusto!");
            }

            if (verso.contains("z")) { // Segunda comprobación, letras "z" en el verso
                puntuacion += 1; // Lola da un punto por cada verso que contenga al menos una letra "z"
            } else {
                System.out.println("Lola: ¡Le falta un toque de 'z'!");
            }

            for (int j = 0; j < verso.length(); j++) { // Tercera comprobación, mas vocales que consonantes, recorremos la frase letra a letra en un bucle
                char letra = verso.charAt(j);
                if (Character.isLetter(letra)) { // Comprobamos que el caracter sea una letra
                    if ("aeiou".indexOf(letra) != -1) { // Comprobamos que sea una vocal y sumamos uno al contador
                        vocalesConsonantes++;
                    } else { // En caso de ser una consonante, restamos uno al contador
                        vocalesConsonantes--;
                    }
                }
            }

            if (i == 0) { // Cuarta comprobación, la primera palabra debe ser igual a la última. Si estamos en el primer verso entramos aquí
                primeraPalabra = verso.split(" ")[0]; // Separamos el verso en palabras y guardamos la primera
            } else if (i == 3) { // Si estamos en el cuarto verso entramos aquí
                String[] palabras = verso.split(" "); // Separamos el verso en palabras
                ultimaPalabra = palabras[palabras.length - 1]; // Guardamos la última palabra
            }
        }

        if (vocalesConsonantes > 0) {
            puntuacion += 1; // Lola da un punto al poema si tiene mas vocales que consonantes
        } else {
            System.out.println("Lola: Más consonantes que vocales, ¡qué aspereza lírica!");
        }

        if (primeraPalabra.equals(ultimaPalabra)) {
            puntuacion += 1; // Lola da un punto al poema si la primera palabra y la última coinciden
        } else {
            System.out.println("Lola: No me engañas, eso no rima con el principio.");
        }

        System.out.printf("\nLola: Mi veredicto final es: %d/10 puntos poéticos.\n", puntuacion); // Mostramos la puntuación final

        switch (puntuacion) { // Damos una respuesta personalizada dependiendo de la puntuación obtenida
            case 10 -> System.out.println("¿Cómo lo has hecho?, no lo habrás generado con IA ¿no?");
            case 8, 9 -> System.out.println("¡Excelente!, estaré atenta a tu carrera literaria.");
            case 6, 7 -> System.out.println("Me hayo notablemente sorprendida, ¡muy bien hecho!");
            case 4, 5 -> System.out.println("No está nada mal para ser un aficionado de la literatura.");
            default -> System.out.println("Tampoco esperaba mucho, no me sorprende.");
        }

        scn.close(); // Cerramos al salir
    }
}