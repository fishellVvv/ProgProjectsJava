package ut04EstructurasAlacenamiento.sesion11.ej02ArrayListArrayList;

import java.util.ArrayList;

public class ej02AgregarLista {
    public static void main(String[] args) {

        /*
        2. Agregar una Lista a una Lista de Listas:

         Crea un ArrayList<ArrayList<String>> y agrega 3 listas internas.
         Cada lista interna debe contener un nombre y dos apellidos de un estudiante.
         Imprime la lista de listas.
         */

        ArrayList<ArrayList<String>> estudiantes = new ArrayList<>();

        ArrayList<String> est1 = new ArrayList<>();
        est1.add("Juan");
        est1.add("Lopez");
        est1.add("Gómez");
        estudiantes.add(est1);

        ArrayList<String> est2 = new ArrayList<>();
        est2.add("Luis");
        est2.add("Perez");
        est2.add("Rodriguez");
        estudiantes.add(est2);

        ArrayList<String> est3 = new ArrayList<>();
        est3.add("Manolo");
        est3.add("Sanchez");
        est3.add("Fernandez");
        estudiantes.add(est3);

        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println("Estudiante " + (i+1) + ":");
            for (int j = 0; j < estudiantes.get(i).size(); j++) {
                if (j == 0) {
                    System.out.print("Nombre: ");
                } else if (j == 1) {
                    System.out.print("1º Apellido: ");
                } else {
                    System.out.print("2º Apellido: ");
                }
                System.out.println(estudiantes.get(i).get(j));
            }
            System.out.println();
        }
    }
}