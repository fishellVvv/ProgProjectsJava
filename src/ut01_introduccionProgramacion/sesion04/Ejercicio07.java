package ut01_introduccionProgramacion.sesion04;

public class Ejercicio07 {
    public static void main(String[] args) {

        // 7: Conversión de double a String

        double precio = 99.99;

        // Conversión a String
        String textoPrecio = Double.toString(precio); // Explícito (en este caso hay que indicar la conversión de este modo)

        System.out.println("Precio como String: " + textoPrecio);

        // Al pasar de un double a String no hay una posible perdida de información porque todos los double tienen valores con representación en el String, pero hay que hacerlo explícito porque hay que usar ".toString".

    }
}