package UT1_introduccionProgramacion.sesion4;

public class Ejercicio3 {
    public static void main(String[] args) {

        // 3: Desbordamiento al convertir int a byte

        // Número mayor al rango de byte (-128 a 127)
        int numeroGrande = 150;

        // Conversión explícita a byte
        // Como 150 está fuera del rango de byte, se producirá un desbordamiento
        byte numeroPequenio = (byte) numeroGrande; // Explícito (si lo indicamos)

        // Mostramos los valores
        System.out.println("Número original (int): " + numeroGrande);
        System.out.println("Número convertido a byte: " + numeroPequenio);

        // Al pasar de int a byte hay posible perdida de información porque no todos los int caben en un byte.

    }
}