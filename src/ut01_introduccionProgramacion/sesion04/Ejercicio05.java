package ut01_introduccionProgramacion.sesion04;

public class Ejercicio05 {
    public static void main(String[] args) {

        // 5: Conversión de String a int con Integer.parseInt()

        // Declaramos una cadena con un número en formato texto
        String texto = "123";

        // Convertimos la cadena en un número entero
        int numero = Integer.parseInt(texto); // Explícito (en este caso hay que indicar la conversión de este modo)

        // Mostramos los valores antes y después de la conversión
        System.out.println("Texto: " + texto);
        System.out.println("Número convertido: " + numero);

        // Al pasar de un String a int hay una posible perdida de información porque todos los Strings no tienen valores que caben en un int.
        // Si intentamos convertir "abc" a int, el programa lanzará un error.

    }
}