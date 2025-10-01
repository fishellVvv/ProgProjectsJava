package ut05OrientacionObjetos.sesion14.PasarelaPago;

public class PasarelaPago {
    public static void main(String[] args) {
        Pago pago1 = new PagoTarjeta(150, "1234-5678-1234-5678");
        Pago pago2 = new Paypal(300, "cliente@correo.com");

        Pago[] pagos = {pago1, pago2};

        for (Pago p: pagos){
            p.procesarPago();
            System.out.println(p.getCantidad() + " €");
        }
    }
}
