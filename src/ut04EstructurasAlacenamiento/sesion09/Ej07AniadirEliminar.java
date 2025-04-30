package ut04EstructurasAlacenamiento.sesion09;

import java.util.ArrayList;

public class Ej07AniadirEliminar {
    public static void main(String[] args) {

        /*
        7. Añadir y eliminar elementos
        Crea una lista de tareas (ArrayList<String>), añade elementos y elimina uno por su nombre.
         */

        ArrayList<String> tareas = new ArrayList<>();
        tareas.add("Jugar a Videojuegos");
        tareas.add("Limpiar");
        tareas.add("Montar en Moto");
        tareas.add("Programar");
        tareas.remove("Limpiar");
        System.out.println(tareas);
    }
}