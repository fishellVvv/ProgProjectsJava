package UT1_introduccionProgramacion.sesion4;

public class Ejercicio1 {
    public static void main(String[] args) {

        // 1: Conversión implícita de int a double

        // Declaramos una variable entera
        int numeroEntero = 25;

        // Conversión implícita de int a double
        // Java permite esto automáticamente porque double tiene más capacidad que int
        double numeroDecimal = numeroEntero;

        // Imprimimos los valores antes y después de la conversión
        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número convertido a double: " + numeroDecimal);

    }
}