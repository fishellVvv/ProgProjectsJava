package ut05OrientacionObjetos.sesion14.PasarelaPago;

public class PagoTarjeta extends Pago {
    private String numTarjeta;

    public PagoTarjeta(double cantidad, String numTarjeta) {
        super(cantidad);
        this.numTarjeta = numTarjeta;
    }

    public String getNumTarjeta() { return numTarjeta; }

    @Override
    public void procesarPago() {
        System.out.println("Procesar pago con tarjeta '" + this.numTarjeta + "' - cantidad: " + this.cantidad + " €");
    }
}
