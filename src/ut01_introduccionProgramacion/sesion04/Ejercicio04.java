package ut01_introduccionProgramacion.sesion04;

public class Ejercicio04 {
    public static void main(String[] args) {

        // 4: Conversión de char a int (Código ASCII)

        // Declaramos un carácter
        char letra = 'A';

        // Conversión implícita de char a int
        // Java convierte 'A' a su código ASCII (65)
        int codigoASCII = letra; // Implícito (no lo indicamos)

        // Mostramos los valores
        System.out.println("Carácter: " + letra);
        System.out.println("Código ASCII: " + codigoASCII);

        // Al pasar de char a int no hay posible perdida de información porque todos los char tienen un valor numérico que cabe en un int.

    }
}