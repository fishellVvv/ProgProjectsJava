package PreworkProg;

public class Mod02Variables {
    public static void main(String[] args) {

        // TIPOS DE DATOS: enteros (int), decimales (float/double), boolean (true/false), caracteres (char), texto (string)
        // tipo de dato + nombre;

        int num = 10;
        float dec = 3.14f; // decimales pequeños
        double dec2 = 20.35; // decimales grandes
        boolean encendido = true;
        char caracter = 'Ü';
        String texto = "Hola mundo";
        final int constante = 5;

        /*
        Entrenamiento avanzado:

        Escribe un programa en Java que realice las siguientes operaciones de casteo y muestra los resultados en la consola:
            1. Declara una variable double con el valor 5.75 y conviértela (casteo explícito) a un tipo int. Imprime el resultado y explica qué sucede con los decimales en la conversión.
            2. Declara una variable int con el valor 65 y conviértela a un tipo char sin utilizar un casteo explícito. Imprime el resultado y explica qué representa el valor char obtenido.
         */

        double variableDoble = 5.75;
        int casteoEntero = (int) variableDoble;
        System.out.println("Casteo de double a int: " + casteoEntero); // Al castearlo en entero los decimales se pierden quedando solo la parte entera del dato original.

        int variableEntero = 65;
        char casteoCaracter = 65; // He tenido que asignar 65 porque si no me solicita explicitarlo
        System.out.println("Casteo de int a char: " + casteoCaracter); // Se obtiene el Caracter "A" del ASCII

    }
}