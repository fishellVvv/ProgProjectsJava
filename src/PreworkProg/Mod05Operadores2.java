package PreworkProg;

import java.util.Scanner;

public class Mod05Operadores2 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        /*
        Pseudocódigo:
            Inicio
            1. Definir variables de tipo entero para num1 y num2
            2. Definir variables de tipo entero para suma, resta, multi y resto
            3. Definir variables de tipo flotante para division
            4. Introducir num1 y num2
            5. Realizar la suma, resta, multiplicación, división y resto de num1 y num2
            6. Mostrar los resultados de las operaciones
            Fin
         */

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

        Ejercicio 2: Cálculo de Promedio de Tres Números
            A continuación, tienes un código en Java que calcula el promedio de tres números ingresados por el usuario.
            Observa el código y convierte cada línea en pseudocódigo paso a paso, siguiendo la estructura de un algoritmo simple y claro.
         */

        double numero1;
        double numero2;
        double numero3;
        double promedio;
        // Solicitar el primer número
        System.out.println("Ingrese el primer número:");
        numero1 = scn.nextDouble();
        // Solicitar el segundo número
        System.out.println("Ingrese el segundo número:");
        numero2 = scn.nextDouble();
        // Solicitar el tercer número
        System.out.println("Ingrese el tercer número:");
        numero3 = scn.nextDouble();
        // Calcular el promedio
        promedio = (numero1 + numero2 + numero3) / 3;
        // Mostrar el resultado
        System.out.println("El promedio es: " + promedio);

        /*
        Pseudocódigo:
            Inicio
            1. Declarar variables de tipo double para numero1, numero2, numero3 y promedio
            2. Solicitar el primer número
            3. Solicitar el segundo número
            4. Solicitar el tercer número
            5. Calcular el promedio como: promedio = (numero1 + numero2 + numero3) / 3
            6. Mostrar mensaje "El promedio es:" seguido del valor de promedio
            Fin
         */

        scn.close();

    }
}
