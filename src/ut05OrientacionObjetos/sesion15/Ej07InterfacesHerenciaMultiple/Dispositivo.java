package ut05OrientacionObjetos.sesion15.Ej07InterfacesHerenciaMultiple;

public abstract class Dispositivo {
    protected String marca;

    public Dispositivo(String marca) {
        this.marca = marca;
    }

    public String getMarca() { return marca; }
}
