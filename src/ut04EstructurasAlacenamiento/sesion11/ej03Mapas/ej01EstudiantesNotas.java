package ut04EstructurasAlacenamiento.sesion11.ej03Mapas;

import java.util.HashMap;
import java.util.Map;

public class ej01EstudiantesNotas {
    public static void main(String[] args) {

        /*
        1. Asociar Nombres de Estudiantes con Notas:

         Crea un HashMap<String, Integer> que asocie los nombres de estudiantes con sus notas.
         Añade al menos 5 estudiantes y muestra sus nombres y notas
         */

        HashMap<String, Integer> notas = new HashMap<>();
        notas.put("Juan", 8);
        notas.put("Luis", 6);
        notas.put("Manolo", 9);
        notas.put("Andrés", 7);
        notas.put("Víctor", 10);

        for (Map.Entry<String, Integer> alumno : notas.entrySet()) {
            System.out.println("Nombre: " + alumno.getKey() + "\nNota: " + alumno.getValue());
        }
    }
}