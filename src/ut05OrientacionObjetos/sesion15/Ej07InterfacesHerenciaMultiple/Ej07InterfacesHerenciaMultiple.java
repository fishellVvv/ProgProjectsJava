package ut05OrientacionObjetos.sesion15.Ej07InterfacesHerenciaMultiple;

// 7 – Interfaces + herencia múltiple simulada
// Crea dos interfaces:
//         • Recargable con el mét_odo void recargar().
//         • Encendible con el mét_odo void encender().
// Crea una clase abstracta Dispositivo con atributo marca.
// Crea las siguientes clases:
//         • Movil (hereda de Dispositivo, implementa Recargable y Encendible)
//         • Portatil (hereda de Dispositivo, implementa Encendible)
//         • BateriaPortatil (hereda de Dispositivo, implementa Recargable)
// En el main, guarda distintos dispositivos en un array y,
// usando instanceof, comprueba cuáles pueden recargarse o encenderse y
// llama a los métodos correspondientes.

import java.util.ArrayList;
import java.util.List;

public class Ej07InterfacesHerenciaMultiple {
    public static void main(String[] args) {
        List<Dispositivo> aparatos = new ArrayList<>();
        aparatos.add(new Movil("Samsung"));
        aparatos.add(new Portatil("Asus"));
        aparatos.add(new BateriaPortatil("Duracell"));

        for (Dispositivo d: aparatos) {
            if (d instanceof Encendible) ((Encendible) d).encender();
            if (d instanceof Recargable) ((Recargable) d).recargar();
        }
    }
}
