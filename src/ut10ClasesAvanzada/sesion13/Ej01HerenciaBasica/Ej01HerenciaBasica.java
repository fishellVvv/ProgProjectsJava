package ut10ClasesAvanzada.sesion13.Ej01HerenciaBasica;

// Ejercicio 01 – Herencia básica
// Diseña una clase Vehículo con los métodos double calcularVelocidadMaxima() y double consumo().
// En la clase padre, esos métodos simplemente imprimirán “No implementado”.
// Crea dos subclases:
//     • Coche (con atributo caballos)
//     • Bicicleta (con atributo numeroMarchas)
// En el main, guarda varios vehículos en un array y muestra la velocidad máxima y el consumo de cada uno.

public class Ej01HerenciaBasica {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
                new Coche("SEAT_Leon", 110),
                new Bicicleta("Orbea_Terra", 12),
                new Coche("Audi_A6", 204)
        };

        for (Vehiculo v : vehiculos) {
            System.out.printf("%nNombre: %s", v.getNombre() );
            System.out.printf("%nVelMáxima: %.2f Km/h", v.calcularVelocidadMaxima() );
            if (v instanceof Coche c) {
                System.out.printf("%nConsumo: %.2f l/100Km%n", c.consumo());
            } else if (v instanceof Bicicleta b) {
                System.out.printf("%nConsumo: %.2f Kcal/h%n", b.consumo());
            }
        }
    }
}
