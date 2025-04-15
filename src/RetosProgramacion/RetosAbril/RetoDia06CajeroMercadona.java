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
        int precioProducto, precioConIVA, dineroRecibido, elCambio; // vamos a trabajar con enteros porque usaremos los valores en céntimos y al mostralos los dividiremos por 100 para simplificar las operaciones
        int[] cambioValores = {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1}; // Definimos Arrays con los valores (en céntimos) y las etiquetas de los diferentes tipos de billetes y monedas
        String[] cambioEtiquetas = {"billetes de 500 €", "billetes de 200 €", "billetes de 100 €", "billetes de 50 €", "billetes de 20 €", "billetes de 10 €", "billetes de 5 €",
                "monedas de 2 €", "monedas de 1 €", "monedas de 50 cént.", "monedas de 20 cént.", "monedas de 10 cént.", "monedas de 5 cént.", "monedas de 2 cént.", "monedas de 1 cént."};

        System.out.println("Iniciando cajero..."); // mensajes iniciales
        System.out.println("** Bienvenido a Mercadona **");
        System.out.println("Escaneando producto...");

        precioProducto = ThreadLocalRandom.current().nextInt(100, 10000); // generamos un valor aleatorio para el coste del producto entre 1 y 100 euros
        precioConIVA = (int) Math.round(precioProducto * 1.21); // calculamos el precio con IVA redondeando al céntimo
        System.out.printf("\nEl precio es: \t%.2f €\n", precioProducto / 100.0); // mostramos en pantalla el "ticket"
        System.out.printf("+ IVA 21%%: \t\t%.2f €\n", (precioConIVA - precioProducto) / 100.0);
        System.out.println("------------------------");
        System.out.printf("Total a pagar: \t%.2f €\n", precioConIVA / 100.0);

        try {
            System.out.print("\nIntroduce la cantidad de dinero aportada por el cliente: "); // solicitamos la cantidad de dinero que el cliente paga
            double dineroCliente = scn.nextDouble();
            dineroRecibido = (int) Math.round(dineroCliente * 100); // convertimos a céntimos

            elCambio = dineroRecibido - precioConIVA; // calculamos el cambio

            if (elCambio > 0) { // Si nos da suficiente dinero, calculamos el cambio y el desglose
                System.out.printf("\nEl cambio es: %.2f €", elCambio / 100.0);
                System.out.println("\nDesglose del cambio: ");

                for (int i = 0; i < cambioValores.length; i++) { // iteramos los valores del Array de mayor a menor (del billete de 500 € a la moneda de 1 céntimo)
                    int cantidad = elCambio / cambioValores[i]; // calculamos cuantos billetes o monedas de este tipo "caben" en el cambio
                    if (cantidad > 0) {
                        System.out.println("\t" + cantidad + " " + cambioEtiquetas[i]); // si el Valor del Array es menor al cambio, calculamos cuantos billetes o monedas de este tipo hay que dar
                        elCambio %= cambioValores[i]; // recalculamos el cambio dejando el resto, de esta manera en la siguiente iteración podemos comprobar el siguiente valor del Array
                    }
                }

                System.out.println("\nGracias por comprar en Mercadona."); // Mensaje de despedida
            } else if (elCambio == 0) { // Si nos da el dinero exacto salta a esta opción
                System.out.println("\nEl cambio es: 0€");
                System.out.println("\nGracias por comprar en Mercadona.");
            } else { // Si falta dinero salta a esta opción
                System.out.println("\nFalta dinero, ¿donde está la pasta?");
            }

        } catch (InputMismatchException e) { // excepción que nos avisa de que el dato dado no es del tipo esperado
            System.out.println("\nEntrada no válida. Debes introducir una cantidad numérica (ej: 125.50).");
        }

        scn.close();
    }
}