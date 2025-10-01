package ut05OrientacionObjetos.sesion14.Bigotitos;

public interface Enviable {
    void enviar(String mensaje);

    default void confirmar(){
        System.out.println("Mensaje enviado correctamente");
    }
}
