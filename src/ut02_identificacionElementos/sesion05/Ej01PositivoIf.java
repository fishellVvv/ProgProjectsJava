package ut02_identificacionElementos.sesion05;

import java.util.Scanner;

public class Ej01PositivoIf {
    public static void main(String[] args) {

        // 1: Uso de if para verificar números positivos y negativos
        // 📌 Objetivo: Pedir un número al usuario y determinar si es positivo, negativo o cero.

        Scanner scn = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int numero = scn.nextInt();

        if(numero>0) {
            System.out.println("El número introducido es positivo.");
        } else if(numero==0) {
            System.out.println("El número introducido es 0");
        } else {
            System.out.println("El número introducido es negativo");
        }

        scn.close();
    }
}