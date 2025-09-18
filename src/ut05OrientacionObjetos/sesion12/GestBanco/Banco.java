package ut05OrientacionObjetos.sesion12.GestBanco;

import java.util.ArrayList;

public class Banco {
    private final String nombreBanco;
    private final ArrayList<Cliente> clientes;

    public Banco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
        this.clientes = new ArrayList<>();
    }

    public String getNombreBanco() { return this.nombreBanco; }
    public ArrayList<Cliente> getClientes() { return this.clientes; }

    public void agregarCliente(Cliente c) {
        this.clientes.add(c);
        System.out.println("Cliente añadido con éxito.");
    }

    public Cliente buscarClientePorDNI(String dni) {
        for (Cliente c : this.clientes) {
            if (c.getDni().equals(dni)) {
                return c;
            }
        }
        return null;
    }

    public void mostrarTodosLosClientes() {
        System.out.println("Clientes en el banco:");
        for (Cliente c : this.clientes) {
            c.mostrarInfo();
            System.out.println();
        }
    }

    public void transferir(String dniOrigen, String dniDestino, double cantidad) {
        Cliente origen = buscarClientePorDNI(dniOrigen);
        Cliente destino = buscarClientePorDNI(dniDestino);

        if (origen != null && destino != null) {
            System.out.printf("Realizando transferencia de %.2f € de %s a %s...%n", cantidad, origen.getNombre(), destino.getNombre());
            if (origen.retirar(cantidad)) {
                destino.depositar(cantidad);
                System.out.printf("Transferencia de %.2f € realizada con éxito.%n", cantidad);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Alguno de los usuarios no existe.");
        }
    }
}
