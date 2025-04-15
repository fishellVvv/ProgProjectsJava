package RetosProgramacion.RetosAbril;

import java.util.Random;

public class RetoDia07Caracoles {
    public static void main(String[] args) {

        /*
        Imagina una emocionante carrera entre caracoles cibernéticos. Cada caracol tiene una velocidad aleatoria entre 1 y 5 (¡qué emoción!).

        Escribe un programa que simule una carrera de 20 "pasos" entre dos caracoles.
        En cada paso, la posición de cada caracol aumenta según su velocidad.
        Al final, ¡declara al caracol ganador (o si hay un emocionante empate)!

        Pista: usar java.util.Random
         */

        Random rnd = new Random();
        String gary = "__@/"; // Las referencias
        String rayo = "__O/"; // <3
        int posGary = 0;
        int posRayo = 0;
        final int meta = 20; // la posición de meta se establece como una constante

        System.out.println("Bienvenidos todos a la XIV Carrera Intergaláctica de Caracoles Cibernéticos!!!"); // Comentarios de inicio
        System.out.println("Con todos ustedes los protagonistas del evento:");
        System.out.println("Con el dorsal 42, el caracol Gary!!!:\t" + gary);
        System.out.println("Y con el dorsal 95, Rayo McSnail!!!:\t" + rayo);
        System.out.println("\n¡Ya están en sus marcas!\n");

        System.out.println("\t\t  SALIDA → |___-___-___-___-___-___-___-___-___-___-___-___-___-___-___-___-___-___-___-___| META [20 m]\n"); // Dibujamos la pista en estado inicial
        System.out.printf("Gary [%02d m]:\t", posGary); // Gary el Caracol
        System.out.println(gary);
        System.out.printf("Rayo [%02d m]:\t", posRayo); // Rayo McSnail
        System.out.println(rayo);
        System.out.println("\n");

        while (posGary<meta && posRayo<meta) { // Este bucle iterará mientras que ninguno haya llegado a la meta

            posGary += rnd.nextInt(5) + 1; // La posición de Gary aumenta entre 1 y 5 en cada iteración
            posRayo += rnd.nextInt(5) + 1; // La de rayo también

            if (posRayo >= meta || posGary >= meta) {
                System.out.println("\uD83C\uDFC1 La carrera ha terminado!!!\n"); // mensaje final si hay meta
            } else if (posRayo > posGary) {
                System.out.println("Rayo McSnail está delante!\n"); // mensaje para cuando Rayo va por delante
            } else if (posRayo < posGary) {
                System.out.println("Gary va lanzado a por la victoria!\n"); // mensaje para cuando Gary va por delante
            } else {
                System.out.println("La carrera no puede ser mas emocionante, cualquiera puede ganar!\n"); // mensaje para cuando van empatados
            }

            System.out.println("\t\t  SALIDA → |___-___-___-___-___-___-___-___-___-___-___-___-___-___-___-___-___-___-___-___| META [20 m]\n"); // dibujamos la pista en cada iteración
            System.out.printf("Gary [%02d m]:\t", posGary);
            for (int i = 0; i < posGary; i++) System.out.print(".\t"); // se dibujan tantos ". " como metros ha avanzado
            System.out.println(gary);
            System.out.printf("Rayo [%02d m]:\t", posRayo);
            for (int i = 0; i < posRayo; i++) System.out.print(".\t");
            System.out.println(rayo);
            System.out.println("\n");
        }

        if (posRayo > posGary) {
            System.out.print("\uD83C\uDFC6 Rayo McSnail ha ganado la copa!!!"); // mensaje final en caso de victoria de Rayo
        } else if (posRayo < posGary) {
            System.out.print("\uD83C\uDFC6 Rayo McSnail ha ganado la copa!!!"); // mensaje final en caso de victoria de Gary
        } else {
            System.out.print("\uD83E\uDD1D Increíble! Tenemos un empate!!! Todo se decidirá en la siguiente ronda!"); // mensaje final en caso de empate
        }
    }
}