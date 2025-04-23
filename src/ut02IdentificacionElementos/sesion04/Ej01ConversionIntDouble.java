package ut02IdentificacionElementos.sesion04;

public class Ej01ConversionIntDouble {
    public static void main(String[] args) {

        // 1: Conversión implícita de int a double

        // Declaramos una variable entera
        int numeroEntero = 25;

        // Conversión implícita de int a double
        // Java permite esto automáticamente porque double tiene más capacidad que int
        double numeroDecimal = numeroEntero; // Implícito (no lo indicamos)

        // Imprimimos los valores antes y después de la conversión
        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número convertido a double: " + numeroDecimal);

        // Al pasar de int a double no hay posible perdida de información porque todos los int caben en double.

    }
}