package ut05OrientacionObjetos.sesion15.Bigotitos;

public interface Enviable {
    void enviar(String mensaje);

    default void confirmar(){
        System.out.println("Mensaje enviado correctamente");
    }
}
