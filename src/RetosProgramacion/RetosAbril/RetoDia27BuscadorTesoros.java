package RetosProgramacion.RetosAbril;

import java.util.ArrayList;

public class RetoDia27BuscadorTesoros {
    public static void main(String[] args) {

        /*
        Crea un programa que tenga un array de cadenas de texto.
        Utiliza un bucle for-each para examinar cada cadena.
        Si una cadena contiene la palabra "tesoro" (sin importar mayúsculas o minúsculas),
            ¡anuncia el descubrimiento con un "¡Tesoro encontrado: [cadena]!"!
         */

        ArrayList<String> cadenas = new ArrayList<>(); // creamos el array de cadenas de texto
        cadenas.add("¡He encontrado el Tesoro escondido en la playa!");
        cadenas.add("Dicen que el tEsOrO está enterrado bajo la vieja iglesia.");
        cadenas.add("Lo que siento por ti es un verdadero TES0RO del alma.");
        cadenas.add("Aquel mapa apuntaba directamente al tesorito maldito.");
        cadenas.add("Su apellido era Montesorovaldi, de origen italiano.");
        cadenas.add("En la caverna hallaron una caja etiquetada como teso_r0...");
        cadenas.add("Mi gato se llama Tesora y duerme todo el día.");
        cadenas.add("Nunca supe que la palabra atestoronado existía...");
        cadenas.add("Un antiguo manuscrito mencionaba el TeSoRaCo de los Andes.");
        cadenas.add("Te adoro más que a cualquier TresorO perdido.");

        for (String cadena : cadenas) { // iteramos el bucle para buscar el tesoro
            if (cadena.toLowerCase().contains("tesoro")) { // pasamos el texto a minúsculas antes de buscar
                System.out.println("¡Tesoro encontrado: [" + cadena + "]!");
            }
        }
    }
}