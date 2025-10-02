package ut05OrientacionObjetos.sesion15.Ej07InterfacesHerenciaMultiple;

public class BateriaPortatil extends Dispositivo implements Recargable{
    public BateriaPortatil(String marca) {
        super(marca);
    }

    @Override
    public void recargar() {
        System.out.println("Batería de portátil " + this.marca + " recargando.");
    }
}
