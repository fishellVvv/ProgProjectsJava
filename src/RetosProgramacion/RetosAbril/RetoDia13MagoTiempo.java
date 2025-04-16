package RetosProgramacion.RetosAbril;

import java.util.Scanner;

public class RetoDia13MagoTiempo {
    public static void main(String[] args) {

        /*
        ¿Alguna vez te has levantado con la necesidad de crear un cronómetro? Tranquilo, no eres el único. Hoy vas a poder hacer tu sueño realidad.
        Crea un programa que:
        Pida al usuario que ingrese el número de segundos que desea contar.
        Usa un bucle para contar desde el primer segundo hasta el número total de segundos indicado por el usuario.
        Cada vez que el cronómetro llegue a 60 segundos, debe reiniciar los segundos a 0 y sumar 1 minuto.
        Cuando los minutos lleguen a 60, debe reiniciar los minutos a 0 y sumar 1 hora.
        El cronómetro debe mostrar el tiempo en formato hh:mm:ss, donde hh son las horas, mm los minutos y ss los segundos.

        PISTA: Para que el cronómetro se actualice cada segundo, puedes utilizar la función time.sleep(1).
            Esto hará que el programa espere 1 segundo entre cada iteración del bucle, imitando el comportamiento de un cronómetro real.

        Ejemplo:
        ---------
        00:00:01
        00:00:02
        00:00:03
        etc.
         */

        Scanner scn = new Scanner(System.in);
        int numeroSegundos, horas, minutos, segundos;

        System.out.println("⏱ Cronómetro Mágico ⏱");
        System.out.println("\nIndica el número de segundos que quieres contar con el cronómetro mágico.");
        System.out.println("Recuerda que un minuto son 60 segundos y una hora son 3600 segundos.");
        System.out.print("Numero de Segundos: ");
        numeroSegundos = scn.nextInt();
        System.out.println("---------");

        try {
            for (int i = 1; i <= numeroSegundos; i++) {
                horas = i / 3600;
                minutos = (i % 3600) / 60;
                segundos = i % 60;
                Thread.sleep(1000);
                System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("---------\n");
        System.out.println("⏰ ¡Tiempo! ⏰");

        scn.close();
    }
}