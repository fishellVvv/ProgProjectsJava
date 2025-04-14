package ut01_introduccionProgramacion.sesion03;

public class Ejercicio6 {
    public static void main(String[] args) {

        // 6️⃣ Modifica el programa anterior y evalúa también (5 > 3) || (10 > 20). Explica los resultados obtenidos.

        System.out.println("El resultado de la siguiente expresión lógica (5 > 3) && (10 < 20) es: " + ((5 > 3) && (10 < 20)));
        System.out.println("El resultado de la siguiente expresión lógica (5 > 3) || (10 > 20) es: " + ((5 > 3) || (10 > 20)));
        System.out.println("En el primer caso ambas condiciones deben cumplirse y en el segundo debe cumplirse al menos una de las dos.");

    }
}