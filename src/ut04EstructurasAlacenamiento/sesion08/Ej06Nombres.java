package ut04EstructurasAlacenamiento.sesion08;

import java.util.ArrayList;

public class Ej06Nombres {
    public static void main(String[] args) {

        /*
        6. Crear una lista de nombres
        Crea una ArrayList de tipo String, añade 5 nombres y muéstralos por pantalla.
         */

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Luis");
        nombres.add("Antonio");
        nombres.add("Francisco");
        nombres.add("José");
        System.out.println(nombres);
    }
}