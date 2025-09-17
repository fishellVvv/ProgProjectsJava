package ut05OrientacionObjetos.cuadernoSantillana;

// 19. Clase Persona
// Crea una clase Persona con nombre, edad y mét_odo esMayorDeEdad().
// Luego crea 3 personas y muestra si son mayores de edad.

import java.util.List;

public class Ej19ClasePersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Ana", 17);
        Persona p2 = new Persona("Luis", 18);
        Persona p3 = new Persona("María", 25);

        List<Persona> personas = List.of(p1, p2, p3);

        for (Persona p : personas) {
            System.out.printf("%s (%d) - %s%n",
                    p.getNombre(), p.getEdad(),
                    p.esMayorEdad() ? "mayor de edad" : "menor de edad");
        }
    }
}
