package RetosProgramacion.RetosAbril;

import java.util.HashMap;
import java.util.Scanner;

public class RetoDia18Votaciones {
    public static void main(String[] args) {

        /*
        Simula una votación simple para 3 candidatos ("Coder", "Debugger", "Tester").
        Pide a 5 votantes que introduzcan su voto (el nombre del candidato).
        Usa un bucle for para simular los 5 votantes.
        Usa un diccionario (o similar) para llevar el conteo de votos para cada candidato.
        Usa if/else para verificar si el voto introducido es para uno de los candidatos válidos.
        Si no lo es, incrementa un contador de "votos inválidos".
        Introduce la posibilidad de un "error de conteo" aleatorio (simula lanzar una excepción dentro del if/else de los votos válidos).
        Usa un try-catch alrededor del proceso de conteo. Si ocurre el error, muestra un mensaje de "¡Error en el conteo! ¡Se descarta este voto!".
        Al final, muestra el número de votos para cada candidato y el número total de votos inválidos.
         */

        Scanner scn = new Scanner(System.in);
        String voto;
        HashMap<String, Integer> recuentoVotos = new HashMap<>(); // Diccionario con los candidatos y sus votos correspondientes
        recuentoVotos.put("Coder", 0);
        recuentoVotos.put("Debugger", 0);
        recuentoVotos.put("Tester", 0);
        int contadorVotosInvalidos = 0;

        System.out.println("Bienvenido a la votación, los candidatos son: Coder, Debugger y Tester."); // Mensaje de bienvenida
        System.out.println("Por favor, a continuación introduce el voto de cada votante y pulsa Enter para continuar.");

        for (int i=1; i<=5; i++) { // Bucle para iterar los 5 votantes
            System.out.print("Votante " + i + ": "); // Solicitamos la introducción del voto del votante
            voto = scn.nextLine();

            try {
                if (recuentoVotos.containsKey(voto)) { // Comprobamos que el voto cruce con algún candidato
                    int aleatorio = (int) (Math.random() * 10); // Generamos un numero aleatorio (0-10) para simular un error de conteo
                    if (aleatorio == 0) { // Si el número aleatorio es 0 (<10% de probabilidad), lanzamos el error y descartamos el voto
                        throw new Exception("Error de conteo");
                    }
                    recuentoVotos.put(voto, recuentoVotos.get(voto) + 1); // Se suma un 1 al contador de votos del candidato correspondiente (si no ha saltado el error aleatorio)
                } else {
                    throw new Exception("Error de conteo"); // Si el voto no coincide con ningún candidato, lanzamos el error y descartamos el voto
                }
            } catch (Exception e) { // Aquí se recuentan los votos invalidados y se muestra un mensaje de error
                contadorVotosInvalidos += 1;
                System.out.println("¡Error en el conteo! ¡Se descarta este voto!");
            }
        }

        System.out.println("\nConteo final de votos: "); // Mensaje de conteo final
        for (String candidato : recuentoVotos.keySet()) { // Recorremos el diccionario
            System.out.println(candidato + ": " + recuentoVotos.get(candidato));
        }
        System.out.println("Votos inválidados: " + contadorVotosInvalidos); // Finálmente mostramos también el recuento de los votos invalidados

        scn.close();
    }
}