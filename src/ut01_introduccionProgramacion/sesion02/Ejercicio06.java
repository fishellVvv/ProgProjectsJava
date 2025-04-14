package ut01_introduccionProgramacion.sesion02;

public class Ejercicio06 {
    public static void main(String[] args) {

        /*
        📌 EJERCICIO 6:
            Declara un array de 5 nombres y muéstralos en la consola usando un bucle.
         */

        String[] nombres = {"Victor", "Marcelino", "Juan Luis", "Jose Luis", "Fulanito"};

        for (int indice = 0; indice < 5; indice++){
            System.out.println("La posición " + indice + " del Array es: " + nombres[indice]);
        }

    }
}