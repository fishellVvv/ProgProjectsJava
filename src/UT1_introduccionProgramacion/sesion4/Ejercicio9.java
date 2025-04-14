package UT1_introduccionProgramacion.sesion4;

public class Ejercicio9 {
    public static void main(String[] args) {

        // 9: Conversión en operaciones matemáticas

        int a = 5, b = 2;

        // División sin conversión (se pierde el decimal)
        System.out.println("División entera: " + (a / b)); // Da 2

        // Conversión a double para obtener decimales
        double resultado = (double) a / b; // Explícito (si lo indicamos)
        System.out.println("División con casting: " + resultado); // Da 2.5

        // Al hacer la división se pueden generar decimales, y si no convertimos a double o float, hay posible perdida de información porque los decimales no caben en un int.

    }
}