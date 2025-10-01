package ut05OrientacionObjetos.sesion15.Bigotitos;

import java.util.ArrayList;
import java.util.List;

public class Bigotitos {
    public static void main(String[] args) {
        List<Enviable> servicios = new ArrayList<>();
        servicios.add(new Email("cliente@pepe.com"));
        servicios.add(new SMS("+34666778899"));

        for (Enviable e: servicios) {
            e.enviar("Pedido enviado");
            e.confirmar();
        }
    }
}
