package ut02IdentificacionElementos.sesion04;

public class Ej02ConversionDoubleInt {
    public static void main(String[] args) {

        // 2: Conversión explícita (double a int) con truncamiento

        // Declaramos una variable double con un valor decimal
        double valorDecimal = 8.75;

        // Conversión explícita (casting) de double a int
        // Se usa (int) antes de la variable para forzar la conversión
        int valorEntero = (int) valorDecimal; // Explícito (si lo indicamos) - Los decimales se eliminarán

        // Imprimimos los valores originales y convertidos
        System.out.println("Valor original (double): " + valorDecimal);
        System.out.println("Valor convertido (int): " + valorEntero);

        // Al pasar de double a int hay posible perdida de información porque los decimales no caben en un int.

    }
}