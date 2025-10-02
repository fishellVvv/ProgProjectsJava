package ut10ClasesAvanzada.sesion14.PasarelaPago;

public class Paypal extends Pago{
    private String email;

    public Paypal(double cantidad, String email) {
        super(cantidad);
        this.email = email;
    }

    public String getEmail() { return email; }

    @Override
    public void procesarPago() {
        System.out.println("Procesar Paypal con email '" + this.email + "' - cantidad: " + this.cantidad + " €");
    }
}
