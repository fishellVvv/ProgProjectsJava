package ut10ClasesAvanzada.sesion13.Ej02EspecializacionUsuarios;

// Ejercicio 2 – Especialización de usuarios
// Crea una clase Cuenta con atributos titular y saldo, y un mét_odo mostrarDatos().
// En la clase padre, ese mét_odo simplemente imprimirá “No implementado”.
// Crea dos subclases:
//     • CuentaAhorro (con atributo interesAnual)
//     • CuentaCorriente (con atributo limiteDescubierto)
// En el main, guarda varias cuentas en una lista y, usando polimorfismo, muestra los datos de cada una.

import java.util.List;

public class Ej02EspecializacionUsuarios {
    public static void main(String[] args) {
        List<Cuenta> cuentas = List.of(
                new CuentaAhorro("Juan", 6050.00, 1.5),
                new CuentaAhorro("Luisa", 6350.00, 3.2),
                new CuentaCorriente("Andrés", 145.00, 2000.00)
        );

        for (Cuenta c : cuentas) {
            System.out.println( c.mostrarDatos() );
        }
    }
}
