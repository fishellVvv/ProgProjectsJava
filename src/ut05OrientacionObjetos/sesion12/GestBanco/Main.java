package ut05OrientacionObjetos.sesion12.GestBanco;

public class Main {
    public static void main(String[] args) {
        Banco miBanco = new Banco("Mi Banco");
        Cliente c1 = new Cliente("Victor", "26239203K", 0.0);
        Cliente c2 = new Cliente("Pepe", "12345678A", 2000.0);

        miBanco.agregarCliente(c1);
        miBanco.agregarCliente(c2);
        System.out.println();

        miBanco.mostrarTodosLosClientes();
        System.out.println();

        miBanco.transferir(c2.getDni(), c1.getDni(), 1500.0);
        System.out.println();

        miBanco.mostrarTodosLosClientes();
        System.out.println();
    }
}
