package RetosProgramacion.RetosAbril;

import java.util.Scanner;

public class RetoDia16Calculadora {
    public static void main(String[] args) {

        /*
        Crea una calculadora muy especial que a veces está de buen humor y otras no.
        Pide al usuario que introduzca dos números y la operación (+, -, *, /).
        Si la operación es división (/) y el segundo número es 0, la calculadora se pondrá de mal humor y lanzará un error
        (simúlalo con un try-catch que imprima un mensaje como "¡¿Dividir por cero?! ¡¿Acaso quieres destruir el universo?!").
        Para las otras operaciones, realiza el cálculo normal y muestra el resultado con un mensaje alegre como "¡Tadá! El resultado es...".
         */

        Scanner scn = new Scanner(System.in);
        int num1, num2;
        char operacion;

        System.out.println("¡Hola!\n (^_^)／ Soy la calculadora felíz. Aunque los infinitos me enfadan... por favor, no me hagas calcular infinitos."); // saludo
        System.out.print("\nIntroduce el primer número: "); // pedimos el primer número
        num1 = scn.nextInt();
        System.out.print("Introduce la operación (+, -, *, /): "); // pedimos la operación
        operacion = scn.next().charAt(0);
        System.out.print("Introduce el segundo número: "); // pedimos el segundo número
        num2 = scn.nextInt();

        if (operacion == '+') { // para la suma
            System.out.println("\nSumandooooo... " + num1 + " + " + num2 + " es igual a " + (num1 + num2) + " ＼(＾▽＾)／");
        } else if (operacion == '-') { // para la resta
            System.out.println("\nVamos con esa resta; " + num1 + " - " + num2 + " es igual a " + (num1 - num2) + " (⌒‿⌒)");
        } else if (operacion == '*') { // para la multiplicación
            System.out.println("\n¡Me encantan las multiplicaciones! " + num1 + " * " + num2 + " es igual a " + (num1 * num2) + " (•‿•)");
        }  else if (operacion == '/') { // para la división
            try {
                if (num2 == 0) { // comprobamos manualmente que el divisor sea 0 porque la excepción aritmética no salta con los double
                    throw new ArithmeticException("División por cero");
                }
                System.out.println("\n¡Tadá! El resultado de " + num1 + " / " + num2 + " es igual a " + ((double) num1 / num2) + " (⁀‿⁀)");
            } catch (ArithmeticException e) {
                System.out.println("\n¡¿Dividir por cero?! ¡¿Acaso quieres destruir el universo?! (҂‾ ▵‾)︻デ═一");
            }
        } else { // por si ha metido en la operación otro caracter
            System.out.println("\n¡Pero que dices! ¡Eso no es lo que te he pedido! (ಠ_ಠ)");
        }

        scn.close();
    }
}