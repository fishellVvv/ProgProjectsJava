package ut02IdentificacionElementos.sesion03;

import java.util.Scanner;

public class Ej08Multiplos {
    public static void main(String[] args) {

        // 8️⃣ Crea un programa que pida al usuario dos números y evalúe si son múltiplos (num1 % num2 == 0).

        Scanner scn = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int num1 = scn.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = scn.nextInt();

        if(num1>num2 && num1%num2==0) {
            System.out.println("El primer número es un múltiplo del segundo.");
        } else if (num1<num2 && num2%num1==0) {
            System.out.println("El segundo número es un múltiplo del primero.");
        } else if (num1==num2) {
            System.out.println("Son iguales.");
        } else {
            System.out.println("Ninguno de los números es múltiplo del otro.");
        }

    }
}