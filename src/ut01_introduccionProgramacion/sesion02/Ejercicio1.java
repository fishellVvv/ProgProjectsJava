package ut01_introduccionProgramacion.sesion02;

public class Ejercicio1 {
    public static void main(String[] args) {

        /*
        📌 EJERCICIO 1:
            Crea una variable de cada tipo entero y asígnale valores distintos.
            Luego imprímelas con System.out.println().
         */

        byte numByte = 127;
        short numShort = 32767;
        int numInt = 2147483647;
        long numLong = 9223372036854775807L;

        System.out.println("Los tipos de variables de números enteros son:");
        System.out.println("Byte, cuyo valor máximo es: " + numByte);
        System.out.println("Short, cuyo valor máximo es: " + numShort);
        System.out.println("Int, cuyo valor máximo es: " + numInt);
        System.out.println("Long, cuyo valor máximo es: " + numLong);

    }
}