package ut05OrientacionObjetos.sesion15.Ej05InterfacesComportamiento;

// 5 – Interfaces de comportamiento
// Define una interfaz Reproducible con el mét_odo void reproducir().
// Implementa la interfaz en dos clases:
//         • Cancion (imprime “Reproduciendo canción...”)
//         • Video (imprime “Reproduciendo video...”)
// En el main, crea una lista de Reproducible y haz que todos los elementos se reproduzcan.

import java.util.ArrayList;
import java.util.List;

public class Ej05InterfacesComportamiento {
    public static void main(String[] args) {
        List<Reproducible> medios = new ArrayList<>();
        medios.add(new Cancion("Coil", "Metal Progresivo"));
        medios.add(new Video("Me at the Zoo", "4:3"));

        for (Reproducible r: medios) {
            r.reproducir();
        }
    }
}
