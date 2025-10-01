package ut05OrientacionObjetos.sesion15.Bigotitos;

public class SMS implements Enviable{
    private String numero;

    public SMS(String numero) {
        this.numero = numero;
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS al " + this.numero + " mensaje: " + mensaje);
    }
}
