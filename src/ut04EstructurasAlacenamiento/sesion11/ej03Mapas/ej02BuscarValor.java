package ut04EstructurasAlacenamiento.sesion11.ej03Mapas;

import java.util.HashMap;
import java.util.Scanner;

public class ej02BuscarValor {
    public static void main(String[] args) {

        /*
        2. Buscar un Valor en un Mapa:

         Crea un HashMap<String, String> que almacene nombres de países como claves y sus capitales como valores.
         Permite al usuario ingresar el nombre de un país para mostrar su capital.
         */

        Scanner scn = new Scanner(System.in);

        HashMap<String, String> capitales = new HashMap<>();
        capitales.put("España", "Madrid");
        capitales.put("Portugal", "Lisboa");
        capitales.put("Francia", "París");
        capitales.put("Alemania", "Berlín");
        capitales.put("Italia", "Roma");

        System.out.print("Introduce un país: ");
        String pais = scn.nextLine();
        System.out.println("Capital: " + capitales.get(pais));
    }
}