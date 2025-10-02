package ut05OrientacionObjetos.sesion15.Ej07InterfacesHerenciaMultiple;

public class Movil extends Dispositivo implements Encendible, Recargable {
    public Movil(String marca) {
        super(marca);
    }

    @Override
    public void encender() {
        System.out.println("Móvil " + this.marca + " encendido.");
    }

    @Override
    public void recargar() {
        System.out.println("Móvil " + this.marca + " recargando.");
    }
}
