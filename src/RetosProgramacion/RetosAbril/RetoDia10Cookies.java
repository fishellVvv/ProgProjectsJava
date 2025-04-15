package RetosProgramacion.RetosAbril;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RetoDia10Cookies {
    public static void main(String[] args) {

        /*
        Una tienda de galletas artesanales vende al por mayor en su página web. Cada caja de galletas cuesta 6€. Solicita la cantidad de cajas de galletas en cada venta y dependiendo de la cantidad introducida se realizan los siguientes pasos:
        Si la cantidad de cajas de galletas vendidas es menor a 5: no se permiten compras inferiores a 5 cajas de galletas.
        Si la cantidad de cajas de galletas es mayor o igual a 5, pero menor a 15: los gastos de envío son de 10€.
        Si la cantidad de cajas de galletas es mayor a 15: El envío es gratuito.

        Promociones:
        Si el precio total es inferior a 120€ no hay promociones.
        Si el precio total supera los 120€ pero es menor a 250€: Tiene un descuento del 5%.
        Si el precio total supera los 250€: Tiene un descuento del 10%.

        Muestra al cliente un mensaje por pantalla según la cantidad de cajas de galletas que quiera comprar:
        Número total de cajas a comprar.
        Total € de la compra.
        Gastos de envío (si los tiene o si es gratuito)
        Descuento por compra (Indicar al cliente cuántos € falta para entrar en una promoción si la compra es <100€ o el importe de descuento generado si es superior)
         */

        Scanner scn = new Scanner(System.in);
        int numeroCajasPedido;
        final int precioCaja = 600; // Definimos el precio de la caja como una constante y en céntimos para facilitar las operaciones
        int cajasMinimas = 5;
        int precioGastosEnvio = 0;
        int cajasEnvioGratuito = 15;
        int precioMinimoPromo1 = 12000; // Definimos en céntimos
        int precioMinimoPromo2 = 25000; // Definimos en céntimos
        int descuentoPromo = 0;

        System.out.println("\uD83C\uDF6A\uD83C\uDF6A\uD83C\uDF6A Bienvenido a COOKIES SUPER RICAS S.A. \uD83C\uDF6A\uD83C\uDF6A\uD83C\uDF6A"); // texto de inicio
        System.out.println("Nuestras galletas son las más ricas del multiverso.");
        System.out.println("\n Antes de pedir recuerda nuestras ofertas:");
        System.out.println("¡¡¡OFERTA Coockie Monster!!!: 5%% de descuento en compras a partir de las 120 cajas.");
        System.out.println("¡¡¡OFERTA Coockie Clicker!!!: 10%% de descuento en compras a partir de las 250 cajas.");
        System.out.print("\n(compra mínima de 5 cajas) ");
        System.out.print("(los pedidos de menos de 15 cajas tendrán un coste adicional de 10 € de gastos de envío) ");
        System.out.print("(COOKIES SUPER RICAS S.A. se reserva el derecho a opinar sobre la ricura de sus propias galletas)");

        try {
            System.out.print("\nPor favor, indica el número de cajas de galletas que deseas comprar: "); // solicitamos un número de cajas
            numeroCajasPedido = scn.nextInt();

            if (numeroCajasPedido < cajasMinimas) { // Si no llega al mínimo salimos
                System.out.println("\nLo sentimos, el número de cajas mínimo es " + cajasMinimas);
            } else {

                if (numeroCajasPedido < cajasEnvioGratuito) { // comprobamos si hay que cobrar los gastos de envío
                    precioGastosEnvio = 1000;
                }

                if ((numeroCajasPedido * precioCaja) + precioGastosEnvio > precioMinimoPromo2) { // comprobamos la oferta mayor primero para que no salte
                    descuentoPromo = 10;
                } else if ((numeroCajasPedido * precioCaja) + precioGastosEnvio > precioMinimoPromo1) { // comprobamos la otra oferta en caso de ni haber entrado la primera
                    descuentoPromo = 5;
                }

                System.out.println("\nResumen del pedido:"); // imprimimos el resumen del pedido
                System.out.printf("\nNúmero de cajas pedidas: %d.", numeroCajasPedido);
                System.out.printf("\nA %.2f € cada caja, suman un total de %.2f €.", precioCaja / 100.0, (numeroCajasPedido * precioCaja) / 100.0);
                System.out.printf("\nGastos de envío: %.2f €", precioGastosEnvio / 100.0);
                System.out.printf("\nDescuento por oferta: %d %%", descuentoPromo);
                // se aplica precio de las cajas de galletas más los gastos de envío y luego a eso lo convertimos a € y le aplicamos el descuento
                System.out.printf("\n\nTotal a pagar: %.2f €", ((numeroCajasPedido * precioCaja) + precioGastosEnvio) / 100 * (1-(descuentoPromo / 100.0)));
                System.out.println("\n\n\uD83C\uDF6A\uD83C\uDF6A\uD83C\uDF6A Muchas gracias por comprar en COOKIES SUPER RICAS S.A. Vuelva pronto!!! \uD83C\uDF6A\uD83C\uDF6A\uD83C\uDF6A");
            }
        } catch (InputMismatchException e){ // revisamos que el valor introducido sea un entero
            System.out.println("Error: Debes introducir un número entero.");
        }

        scn.close();
    }
}