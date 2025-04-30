package RetosProgramacion.RetosAbril;

import java.util.ArrayList;

public class RetoDia28Palindromos {
    public static void main(String[] args) {

        /*
        Crea un programa con un array de palabras.
        Utiliza un bucle for-each para analizar cada palabra.
        Si una palabra es un palíndromo (se lee igual al revés),
            ¡declárala "misteriosamente palíndroma: [palabra]"!
         */

        ArrayList<String> palabras = new ArrayList<>(); // creamos el array de palabras
        palabras.add("Palabra");
        palabras.add("Oso"); // palíndromo
        palabras.add("Mundo");
        palabras.add("Reconocer"); // palíndromo
        palabras.add("Abracadabra");
        palabras.add("Sometemos"); // palíndromo

        for (String palabra : palabras) { // iteramos el Array de palabras
            boolean esPalindromo = true; // declaramos una bandera
            for (int i=0; i < palabra.length()/2; i++) { // comprobamos las letras desde la primera a la mitad de la palabra
                if (palabra.toLowerCase().charAt(i) != palabra.toLowerCase().charAt(palabra.length()-1-i )) { // en cada iteración se comparan las letras de "fuera" a "dentro" de la palabra
                    esPalindromo = false; // si en alguna letra no son iguales la bandera es falsa y salimos del bucle
                    break;
                }
            }
            if (esPalindromo) System.out.println("misteriosamente palíndroma: " + palabra); // si al terminar de recorrer las letras, todas son iguales, es palíndromo
        }
    }
}