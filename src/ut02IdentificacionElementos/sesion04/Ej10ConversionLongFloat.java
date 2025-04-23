package ut02IdentificacionElementos.sesion04;

public class Ej10ConversionLongFloat {
    public static void main(String[] args) {

        // 10: Conversión de long a int y de float a int

        // Declaramos un número de tipo long (entero largo)
        long numeroLargo = 1_000_000_000_000L; // 1 billón

        // Convertimos de long a int (puede haber pérdida por desbordamiento si el número es muy grande)
        int numeroEntero = (int) numeroLargo; // Explícito (si lo indicamos) - Puede haber desbordamiento

        // Declaramos un número float con decimales
        float numeroDecimal = 9.99f;

        // Convertimos de float a int (se perderán los decimales)
        int numeroSinDecimales = (int) numeroDecimal; // Explícito (si lo indicamos) - Los decimales se eliminarán

        // Imprimimos los valores antes y después de la conversión
        System.out.println("Número original (long): " + numeroLargo);
        System.out.println("Número convertido a int: " + numeroEntero);
        System.out.println("Número original (float): " + numeroDecimal);
        System.out.println("Número convertido a int (sin decimales): " + numeroSinDecimales);

        // Al pasar de float o long a int hay posible perdida de información porque los decimales no caben en un int y el long puede albergar un número mucho mayor que lo que cabe en un int.

    }
}