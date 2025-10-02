package ut10ClasesAvanzada.sesion15.Ej07InterfacesHerenciaMultiple;

public class Portatil extends Dispositivo implements Encendible {
    public Portatil(String marca) {
        super(marca);
    }

    @Override
    public void encender() {
        System.out.println("Portátil " + this.marca + " encendido.");
    }
}
