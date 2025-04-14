package ut01_introduccionProgramacion.sesion04;

public class Ej08ConversionBooleanString {
    public static void main(String[] args) {

        // 8: Conversión de boolean a String

        boolean activo = true;

        // Conversión a String
        String estado = String.valueOf(activo); // Explícito (en este caso hay que indicar la conversión de este modo)

        System.out.println("Estado convertido: " + estado);

        // Al pasar de un boolean a String no hay una posible perdida de información porque todos los boolean tienen valores con representación en el String, pero hay que hacerlo explícito porque hay que usar ".valueOf".

    }
}