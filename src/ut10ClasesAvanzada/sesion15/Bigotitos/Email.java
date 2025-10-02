package ut10ClasesAvanzada.sesion15.Bigotitos;

public class Email implements Enviable{
    private String direccion;

    public Email(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando email a " + this.direccion + " mensaje: " + mensaje);
    }
}
