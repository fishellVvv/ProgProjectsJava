package ut03EstructurasControl.sesion07;

public class Ej05LongitudNombre {
    public static void main(String[] args) {

        // 5: Longitud de un nombre
        // Objetivo: Añadir manejo de NullPointerException
        // Instrucción: Usa try-catch para evitar que el programa se detenga si nombre es null.

        String nombre = null;

        try {
            System.out.println("La longitud del nombre es: " + nombre.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Dato null");
        }
    }
}