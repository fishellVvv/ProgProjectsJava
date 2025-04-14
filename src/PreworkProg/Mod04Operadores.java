package PreworkProg;

import java.util.Scanner;

public class Mod04Operadores {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        /*
        + -> sumar
        - -> restar
        * -> multiplicar
        / -> dividir
        % -> módulo (resto de dividir)

        && -> AND
        || -> OR
        <, >, <=, >=, ==, !=
         */

        int num1, num2, suma, resta, multi, modulo;
        float divi;

        System.out.println("Introduzca un número: ");
        num1 = scn.nextInt();

        System.out.println("Introduzca otro número: ");
        num2 = scn.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        divi = (float) num1 / num2;
        modulo = num1 % num2;

        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + multi);
        System.out.println("División: " + num1 + " / " + num2 + " = " + divi + " (el resto es " + modulo + ")");

        boolean mayor = num1 > num2;
        boolean igual = num1 == num2;
        boolean menor = num1 < num2;
        boolean diferente = num1 != num2;

        System.out.println("El primer numero es mayor que el segundo numero: " + mayor);
        System.out.println("Los números son iguales: " + igual);
        System.out.println("El primer numero es menor que el segundo numero: " + menor);
        System.out.println("Los números son diferentes: " + diferente);

        boolean igualYMayor10 = num1 == num2 && num1 > 10;
        boolean igualOMayor10 = num1 == num2 || num1 > 10;

        System.out.println("Los números son iguales y el primero es mayor que 10: " + igualYMayor10);
        System.out.println("Los números son iguales o el primero es mayor que 10: " + igualOMayor10);

        /*
        Entrenamiento básico:

        Ejercicio 1: Cálculo de Edad
            1. Crea un algoritmo en pseudocódigo que calcule la edad de una persona a partir de su año de nacimiento.
            2. Luego convierte este algoritmo a código Java.

        Pseudocódigo:
            Inicio
            1. Mostrar mensaje "Ingrese su año de nacimiento:"
            2. Leer añoNacimiento
            3. Calcular edad como: edad = añoActual - añoNacimiento
            4. Mostrar mensaje "Su edad es:" seguido del valor de edad
            Fin
         */

        System.out.println("Ingrese su año de nacimiento: ");
        int anioNacimiento = scn.nextInt();
        int edad = 2025 - anioNacimiento;
        System.out.println("Su edad es: " + edad);

        /*
        Entrenamiento avanzado:

        Ejercicio 2: Cálculo de Ahorros
            1. Define dos constantes (AHORRO_MENSUAL y MESES_EN_ANO) usando final int:
                AHORRO_MENSUAL: representa la cantidad fija que se ahorrará cada mes (por ejemplo, 500).
                MESES_EN_ANO: representa el número de meses en un año (12).
            2. Solicita al usuario que ingrese la cantidad de años que desea ahorrar.
            3. Usa operadores aritméticos para calcular:
                La cantidad total ahorrada al final del período ingresado por el usuario.
            4. Usa operadores lógicos básicos (&&, ||, !) para verificar si el usuario alcanzará un ahorro mínimo de $10,000:
                Imprime si el objetivo fue alcanzado o no.
         */

        final int ahorroMensual = 500;
        final int mesesEnAnio = 12;

        System.out.println("Indica el número de años que deseas ahorrar: ");
        int aniosAhorro = scn.nextInt();

        int ahorroTotal = ahorroMensual * mesesEnAnio * aniosAhorro;
        boolean objetivoAlcanzado = ahorroTotal >= 10000;

        System.out.println("El total ahorrado durante " + aniosAhorro + " años, es de " + ahorroTotal + "€");
        System.out.println("¿Alcanza el objetivo Mínimo de 10.000€? " + objetivoAlcanzado);

        scn.close();

    }
}
