package ut02_identificacionElementos.sesion06;

public class Ej03ForBreak {
    public static void main(String[] args) {

        // 3 – Finalizar un bucle for al encontrar un número concreto
        // Haz un programa que busque el número 7 entre los números del 1 al 20. Cuando lo encuentre, debe mostrar un mensaje y terminar el bucle con break.

        for(int i=1; i<=20; i++) {
            System.out.print(i + ", ");

            if(i == 7) {
            break;
            }
        }

        System.out.println("¡¡¡Programa terminado!!! (encontrado un 7)");
    }
}