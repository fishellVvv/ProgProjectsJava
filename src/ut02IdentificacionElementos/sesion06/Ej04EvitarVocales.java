package ut02IdentificacionElementos.sesion06;

public class Ej04EvitarVocales {
    public static void main(String[] args) {

        // 4 – Evitar mostrar letras vocales con continue
        // Muestra las letras de la palabra "PROGRAMACION", pero omite las vocales usando continue.

        String palabra = "PROGRAMACION";

        for(int i=0; i<palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                continue;
            }
            System.out.print(letra + "-");
        }
    }
}