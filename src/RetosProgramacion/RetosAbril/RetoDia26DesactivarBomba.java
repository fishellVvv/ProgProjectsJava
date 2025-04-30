package RetosProgramacion.RetosAbril;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RetoDia26DesactivarBomba {
    public static void main(String[] args) {

        /*
        Imagina un programa donde el usuario tiene que introducir una secuencia de 4 números para desactivar una "bomba" (simulada).
        Usa un bucle for para pedir cada número.
        Implementa un try-catch para cuando el usuario introduce algo que no es un número,
            y en ese caso, ¡la bomba hace un sonido gracioso en la consola
            ("¡Pium! ¡Casi explotas por un carácter extraño!") y se reinician los intentos.
        Solo tienen 3 intentos (tras el primer input) antes de la "explosión" final (un mensaje en la consola).
         */

        Scanner scn = new Scanner(System.in);
        int[] codigoUsuario = {0, 0, 0, 0};
        int[] codigoSecreto = {0, 0, 0, 0};
        String[] codigoComparado = {"", "", "", ""};
        int intentos = 3;
        boolean bombaActiva = true;

        for (int i = 0; i < codigoSecreto.length; i++) { // generamos un número secreto aleatorio
            codigoSecreto[i] = ThreadLocalRandom.current().nextInt(10); // random de 0 a 9
        }

        System.out.println("Hola artificiero, 👨‍🚒💣 se que es tu primer día pero tenemos una urgencia y tienes que desactivar la bomba."); // mensaje inicial
        System.out.println("Aquí tienes... 🧨📟");
        System.out.println("Ante tí ves una pequeña pantalla en la que tienes que introducir cuatro dígitos de uno en uno:");
        System.out.println("╔═════════════════════════╗");
        System.out.println("║ Ingresa el código:      ║");
        System.out.println("╠═════════════════════════╣");
        System.out.printf ("║ [ %d ] [ %d ] [ %d ] [ %d ] ║\n", codigoUsuario[0], codigoUsuario[1], codigoUsuario[2], codigoUsuario[3]);
        System.out.println("╚═════════════════════════╝");

        do { // entramos mientras la bomba esté activa y queden intentos
            for (int i = 0; i < codigoUsuario.length; i++) { //iteramos los dígitos
                try { // comprobamos que introduzca un entero
                    System.out.print("Dígito " + (i + 1) + ": "); // solicitamos el digito
                    codigoUsuario[i] = scn.nextInt();

                    if (codigoUsuario[i] >= 0 && codigoUsuario[i] <= 9) { // comprobamos que sea de 0 a 9
                        if (codigoUsuario[i] < codigoSecreto[i]) { // si el numero secreto es mayor
                            codigoComparado[i] = "▲";
                        } else if (codigoUsuario[i] > codigoSecreto[i]) { // si el numero secreto es menor
                            codigoComparado[i] = "▼";
                        } else { // cuando hemos acertado el dígito
                            codigoComparado[i] = "✓";
                        }
                    } else { // si no es de 0 a 9
                        System.out.println("Error, introduce un dígito válido (0-9) ⛔️❌");
                        i--; // restamos la iteración para volver a introducir el dígito
                    }
                } catch (Exception e) { // si no es un entero
                    System.out.println("¡Pium! ¡Casi explotas por un carácter extraño! 💥😵");
                    scn.nextLine(); // limpiamos el búfer
                    i--; // restamos la iteración para volver a introducir el dígito
                }
            }

            System.out.println("\nLa bomba parece evaluar los datos introducidos:\n"); // enseñamos en la pantalla los resultados

            System.out.println("╔═════════════════════════╗");
            System.out.printf ("║ Intentos restantes: %d   ║\n", intentos);
            System.out.println("╠═════════════════════════╣");
            System.out.printf ("║ [ %d ] [ %d ] [ %d ] [ %d ] ║\n", codigoUsuario[0], codigoUsuario[1], codigoUsuario[2], codigoUsuario[3]);
            System.out.println("╠═════════════════════════╣");
            System.out.printf ("║ [ %s ] [ %s ] [ %s ] [ %s ] ║\n", codigoComparado[0], codigoComparado[1], codigoComparado[2], codigoComparado[3]);
            System.out.println("╚═════════════════════════╝");

            intentos--; // restamos 1 intento

            int aciertos = 0;
            for (String simbolo : codigoComparado) { // revisamos iterando si todos los dígitos son correctos
                if (simbolo.equals("✓")) {
                    aciertos++; // vamos contando los aciertos
                }
            }
            if (aciertos == codigoComparado.length) { // si todos son correctos, desactivamos la bomba
                bombaActiva = false;
            }
        } while (bombaActiva && intentos >=0);

        if (!bombaActiva) { // si la bomba se ha desactivado
            System.out.println("¡Bomba desactivada! 🎉🟢🧯");
        } else { // si no se ha desactivado
            System.out.println("¡BOOOOOM! 💣💥🔥☠️");
        }
        scn.close(); // cerramos al salir
    }
}