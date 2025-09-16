package ut05OrientacionObjetos.cuadernoSantillana;

// 6. Números del 1 al 100 divisibles por 3 o 5
// Usa un bucle for para mostrar solo los que cumplan la condición.

public class ej06NumerosDivisibles {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.printf("%,d\n", i);
            }
        }
    }
}
