package ut05OrientacionObjetos.sesion13.Ej01HerenciaBasica;

// Ejercicio 01 – Herencia básica
// Diseña una clase Vehículo con los métodos double calcularVelocidadMaxima() y double consumo().
// En la clase padre, esos métodos simplemente imprimirán “No implementado”.
// Crea dos subclases:
//     • Coche (con atributo caballos)
//     • Bicicleta (con atributo numeroMarchas)
// En el main, guarda varios vehículos en un array y muestra la velocidad máxima y el consumo de cada uno.

public class Ej01HerenciaBasica {
    public static void main(String[] args) {
        Vehiculo c1 = new Coche("SEAT_Leon", 110);
        Vehiculo b2 = new Bicicleta("Orbea_Terra", 12);
        Vehiculo c3 = new Coche("Audi_A6", 204);

        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = c1;
        vehiculos[1] = b2;
        vehiculos[2] = c3;

        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println();
            System.out.println("Nombre: " + vehiculos[i].getNombre() );
            System.out.print("VelMáxima: ");
            System.out.println( vehiculos[i].calcularVelocidadMaxima() );
            System.out.print("Consumo: ");
            System.out.println( vehiculos[i].consumo() );
        }
    }
}
