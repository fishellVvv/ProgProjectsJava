package ut02IdentificacionElementos.sesion07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej01DivisionSegura {
    public static void main(String[] args) {

        // 1: División segura
        // Objetivo: Añadir manejo de ArithmeticException y InputMismatchException
        // Instrucción: Añade try-catch-finally para evitar que el programa falle si el divisor es cero o si se introduce texto.

        Scanner scn = new Scanner(System.in);

        try {
            System.out.print("Introduce el dividendo: ");
            int dividendo = scn.nextInt();
            System.out.print("Introduce el divisor: ");
            int divisor = scn.nextInt();
            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
        } catch(ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre 0.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Datos incorrectos.");
        } finally {
            System.out.println("Operación terminada.");
        }

        scn.close();
    }
}