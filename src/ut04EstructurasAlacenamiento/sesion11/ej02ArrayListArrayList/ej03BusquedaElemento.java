package ut04EstructurasAlacenamiento.sesion11.ej02ArrayListArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ej03BusquedaElemento {
    public static void main(String[] args) {

        /*
        3. Búsqueda de un Elemento en una Lista Interna:

         Crea un ArrayList<ArrayList<String>> que almacene nombres de ciudades en cada lista interna.
         Permite al usuario ingresar una ciudad para buscar en qué lista se encuentra.
         Imprime la lista que contiene la ciudad.
         */

        Scanner scn = new Scanner(System.in);
        ArrayList<ArrayList<String>> ciudades = new ArrayList<>();

        ArrayList<String> cAndalucia = new ArrayList<>();
        cAndalucia.add("Jaén");
        cAndalucia.add("Málaga");
        cAndalucia.add("Cádiz");
        ciudades.add(cAndalucia);

        ArrayList<String> cExtremadura = new ArrayList<>();
        cExtremadura.add("Badajoz");
        cExtremadura.add("Cáceres");
        cExtremadura.add("Mérida");
        ciudades.add(cExtremadura);

        ArrayList<String> cLaMancha = new ArrayList<>();
        cLaMancha.add("Ciudad Real");
        cLaMancha.add("Albacete");
        cLaMancha.add("Puertollano");
        ciudades.add(cLaMancha);

        boolean encontrada = false;

        System.out.print("Introduce la ciudad a buscar: ");
        String ciudadBuscada = scn.nextLine();

        for (int i = 0; i < ciudades.size(); i++) {
            for (String ciudad : ciudades.get(i)) {
                if (ciudad.equalsIgnoreCase(ciudadBuscada)) {
                    System.out.println("La ciudad indicada se encuentra en la lista " + (i+1) + ": " + ciudades.get(i));
                    encontrada = true;
                    break;
                }
            }
        }
        if (!encontrada) System.out.println("La ciudad no se encuentra en los listados.");
    }
}