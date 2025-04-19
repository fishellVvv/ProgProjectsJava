package RetosProgramacion.RetosAbril;

import java.util.Scanner;

public class RetoDia19CajeroAventurero {
    public static void main(String[] args) {

        /*
        Simula un cajero automático con un saldo inicial.
        Permite al usuario realizar las siguientes acciones (usando un bucle for para un máximo de 3 intentos fallidos de PIN):
        - Introducir PIN: Pide al usuario un PIN (establece uno secreto).
            Si lo introduce incorrectamente 3 veces, bloquea la cuenta (simula esto con un mensaje y terminal).
        - Consultar Saldo: Muestra el saldo actual.
        - Retirar Fondos: Pide la cantidad a retirar.
            Usa try-catch para manejar si el usuario introduce algo que no es un número.
            Si la cantidad es válida, verifica si hay suficiente saldo.
            Si no, informa del saldo insuficiente.
            Si t_odo va bien, resta la cantidad del saldo y muestra un mensaje de éxito.
        - Salir: Termina la simulación.
            El programa debe mostrar un menú de opciones en cada paso hasta que el usuario elija salir o la cuenta se bloquee.
         */

        Scanner scn = new Scanner(System.in);
        int saldo = 1000;
        int pinTarjeta = 1234;
        int opcion;

        System.out.println("Bienvenido al Cajero Aventurero."); // mensaje de bienvenida

        for (int i=0; i<3; i++) { // iteramos 3 intentos para el pin
            System.out.print("Ingrese su PIN: ");
            try {
                int pinUsuario = scn.nextInt(); // escaneamos el pin
                scn.nextLine(); // limpiamos el búfer tras cada scn.nextInt()

                if (pinUsuario == pinTarjeta) { // pin correcto
                    System.out.println("Pin correcto, accediendo...");
                    break;
                } else if (i < 2) { // pin erróneo pero quedan intentos
                    System.out.println("Pin erróneo, le quedan " + (2 - i) + " intentos.");
                } else { // pin erróneo y no quedan intentos, bloqueamos la cuenta
                    System.out.println("Pin erróneo, la cuenta se ha bloqueado.");
                    scn.close();
                    return;
                }

            } catch (Exception e) { // en caso de no introducir un entero, mostramos el mensaje de error y volvemos al bucle sin contarlo como intento real
                System.out.println("Pin no válido. Solo se permiten números.");
                scn.nextLine();
                i--; // Solo un pin numérico cuenta como intento real
            }
        }

        while (true) { // una vez introducido el pin correcto accedemos al menú
            System.out.println("\n--------------------------------------------------------");
            System.out.println("Bienvenido al Cajero Aventurero, ¿Que desea hacer ahora?");
            System.out.println("1. Consultar saldo.");
            System.out.println("2. Retirar fondos.");
            System.out.println("3. Salir.\n");

            try {
                opcion = scn.nextInt(); // escaneamos la opción del menú elegida
                scn.nextLine(); // limpiamos el búfer tras cada scn.nextInt()

                switch (opcion) {
                    case 1: // consultamos el saldo
                        System.out.printf("Saldo actual: %.2f €\n", (float) saldo);
                        System.out.print("\nPulsa ENTER para volver al menú..."); // solicitamos enter para continuar para que sea más comodo de leer
                        scn.nextLine();
                        break;
                    case 2: // retiramos fondos
                        if (saldo > 0) { // comprobamos que hay saldo para hacer la retirada
                            System.out.print("Ingrese la cantidad a retirar: ");
                            int cantidadRetirada = scn.nextInt(); // escaneamos la cantidad a retirar
                            scn.nextLine(); // limpiamos el búfer tras cada scn.nextInt()
                            if (cantidadRetirada > saldo) { // comprobamos que la cantidad a retirar es menor que el saldo actual
                                System.out.println("No dispone de suficiente saldo.");
                            }else if (cantidadRetirada <= 0) { // comprobamos que la cantidad a retirar es mayor o igual a cero
                                System.out.println("Introduce una cantidad válida mayor que cero.");
                            } else { // se recalcula el saldo tras la retirada
                                saldo = saldo - cantidadRetirada;
                                System.out.printf("Retirada exitosa, saldo actual: %.2f €\n", (float) saldo);
                            }
                        } else { // si no hay saldo salimos con un mensaje
                            System.out.println("No dispone de saldo.");
                        }
                        System.out.print("\nPulsa ENTER para volver al menú..."); // solicitamos enter para continuar para que sea más comodo de leer
                        scn.nextLine();
                        break;
                    case 3: // salimos del programa
                        System.out.println("Gracias por usar el Cajero Aventurero.");
                        scn.close(); // cerramos al salir
                        System.exit(0);
                    default:
                        System.out.println("Opción no válida. Por favor introduzca un número (1-3)."); // en caso de introducir una opción que no está en el menú, mostramos el mensaje de error y volvemos al bucle
                }
            } catch (Exception e) {
                System.out.println("Error en la introducción del dato."); // en caso de no introducir un entero, mostramos el mensaje de error y volvemos al bucle
                scn.nextLine();
            }
        }
    }
}