package RetosProgramacion.RetosAbril;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RetoDia06CajeroMercadona {
    public static void main(String[] args) {

        /*
        Juan está trabajando en un Mercadona en el que no hay cajero automático, él siempre calcula el cambio de los clientes de cabeza. ¿Se te ocurre alguna forma de hacerle la vida más sencilla al pobre chaval?

        Crea un programa que:
        Reciba la cantidad de dinero (double) que el usuario ha entregado para pagar.
        Compare la cantidad entregada con el precio del producto y calcule la diferencia.
        Súmale el IVA porque esto es España, redondeado a dos décimas (+21%)
        Devuelva el valor utilizando la menor cantidad de billetes y monedas posibles siendo estos;
            billete de 500 €, billete de 200 €, billete de 100 €, billete de 50 €, billete de 20 €, billete de 10 €, billete de 5 €,
            moneda de 2 €, moneda de 1 €, moneda de 50 cénts, moneda de 20 cénts, moneda de 10 cénts, moneda de 2 cénts y moneda de 1 cént.

        Pero cuidado, si un cliente intenta pagar con menos dinero del necesario… ¡Tendrás que avisarle antes de que se lleve el producto gratis!

        Ejemplo:
        El producto cuesta 17 €.
        El cliente te da 20 pavos.
        El cambio es de 1 moneda de 1 euro y 1 moneda de 2 euros.
         */

        Scanner scn = new Scanner(System.in);
        int precioProducto, precioConIVA, dineroRecibido, elCambio;
        int[] cambioValores = {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        String[] cambioEtiquetas = {"billetes de 500 €", "billetes de 200 €", "billetes de 100 €", "billetes de 50 €", "billetes de 20 €", "billetes de 10 €", "billetes de 5 €",
                "monedas de 2 €", "monedas de 1 €", "monedas de 50 cént.", "monedas de 20 cént.", "monedas de 10 cént.", "monedas de 5 cént.", "monedas de 2 cént.", "monedas de 1 cént."};

        System.out.println("Iniciando cajero...");
        System.out.println("** Bienvenido a Mercadona **");
        System.out.println("Escaneando producto...");

        precioProducto = ThreadLocalRandom.current().nextInt(100, 10000);
        precioConIVA = (int) Math.round(precioProducto * 1.21);
        System.out.printf("\nEl precio es: \t%.2f €\n", precioProducto / 100.0);
        System.out.printf("+ IVA 21%%: \t\t%.2f €\n", (precioConIVA - precioProducto) / 100.0);
        System.out.println("------------------------");
        System.out.printf("Total a pagar: \t%.2f €\n", precioConIVA / 100.0);

        try {
            System.out.print("\nIntroduce la cantidad de dinero aportada por el cliente: ");
            double dineroCliente = scn.nextDouble();
            dineroRecibido = (int) Math.round(dineroCliente * 100);

            elCambio = dineroRecibido - precioConIVA;

            if (elCambio > 0) {
                System.out.printf("\nEl cambio es: %.2f €", elCambio / 100.0);
                System.out.println("\nDesglose del cambio: ");

                for (int i = 0; i < cambioValores.length; i++) {
                    int cantidad = elCambio / cambioValores[i];
                    if (cantidad > 0) {
                        System.out.println("\t" + cantidad + " " + cambioEtiquetas[i]);
                        elCambio %= cambioValores[i];
                    }
                }

                System.out.println("\nGracias por comprar en Mercadona.");
            } else if (elCambio == 0) {
                System.out.println("\nEl cambio es: 0€");
                System.out.println("\nGracias por comprar en Mercadona.");
            } else {
                System.out.println("\nFalta dinero, ¿donde está la pasta?");
            }

        } catch (InputMismatchException e) {
            System.out.println("\nEntrada no válida. Debes introducir una cantidad numérica (ej: 125.50).");
        }

        scn.close();
    }
}