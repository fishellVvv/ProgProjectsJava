package ut04EstructurasAlacenamiento.sesion11.ej02ArrayListArrayList;

import java.util.ArrayList;

public class ej01ListaEstudiantes {
    public static void main(String[] args) {

        /*
        1. Lista de Listas de Estudiantes:
         Crea un ArrayList<ArrayList<String>> que contenga información sobre 3 estudiantes:
         nombre, apellido y edad.
         Imprime la información de todos los estudiantes.
         */

        ArrayList<ArrayList<String>> estudiantes = new ArrayList<>();

        ArrayList<String> est1 = new ArrayList<>();
        est1.add("Juan");
        est1.add("Lopez");
        est1.add("23");
        estudiantes.add(est1);

        ArrayList<String> est2 = new ArrayList<>();
        est2.add("Luis");
        est2.add("Perez");
        est2.add("21");
        estudiantes.add(est2);

        ArrayList<String> est3 = new ArrayList<>();
        est3.add("Manolo");
        est3.add("Sanchez");
        est3.add("25");
        estudiantes.add(est3);

        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println("Estudiante " + (i+1) + ":");
            for (int j = 0; j < estudiantes.get(i).size(); j++) {
                if (j == 0) {
                    System.out.print("Nombre: ");
                } else if (j == 1) {
                    System.out.print("Apellido: ");
                } else {
                    System.out.print("Edad: ");
                }
                System.out.println(estudiantes.get(i).get(j));
            }
            System.out.println();
        }
    }
}