package ut05OrientacionObjetos.cuadernoSantillana;

// 18. Contar vocales en una frase
// Haz una función que cuente y devuelva el número de vocales de una frase introducida.

import java.util.Scanner;

public class Ej18ContarVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        int nV = contarVocales(sc.nextLine().trim().toLowerCase());

        System.out.printf("%nEn el texto hay %d vocales.", nV);
    }

    public static int contarVocales(String entrada) {
        int n = 0;
        for (char c : entrada.toCharArray() ) {
            n += "aeiouáéíóúü".contains(String.valueOf(c)) ? 1 : 0;
        }
        return n;
    }
}
