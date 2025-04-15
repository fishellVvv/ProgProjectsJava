package ut02IdentificacionElementos.sesion06;

public class Ej02ForContinue {
    public static void main(String[] args) {

        // 2 – Saltarse los múltiplos de 3 con continue
        // Escribe un programa que muestre los números del 1 al 10, excepto los múltiplos de 3. Usa un bucle for con continue.

        for(int i=1; i<=10; i++) {

            if(i%3 == 0) {
                continue;
            }

            System.out.println("Numero: " + i);
        }
    }
}