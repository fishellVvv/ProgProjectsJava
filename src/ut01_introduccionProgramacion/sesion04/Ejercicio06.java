package ut01_introduccionProgramacion.sesion04;

public class Ejercicio06 {
    public static void main(String[] args) {

        // 6: Conversión de int a String

        int numero = 456;

        // Convertimos el número a String
        String texto = String.valueOf(numero); // Explícito (en este caso hay que indicar la conversión de este modo)

        System.out.println("Número: " + numero);
        System.out.println("Texto convertido: " + texto);

        // Al pasar de un int a String no hay una posible perdida de información porque todos los int tienen valores con representación en el String, pero hay que hacerlo explícito porque hay que usar ".valueOf".

    }
}