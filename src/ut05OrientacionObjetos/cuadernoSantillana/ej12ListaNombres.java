package ut05OrientacionObjetos.cuadernoSantillana;

// 12. Lista de nombres
// Usa un ArrayList<String> para guardar nombres introducidos por el usuario hasta que escriba "fin".
// Luego muestra todos los nombres.

import java.util.ArrayList;
import java.util.Scanner;

public class ej12ListaNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();
        String entrada;

        do {
            System.out.print("Introduce un nombre (escribe fin para finalizar): ");
            entrada = sc.nextLine().trim();

            if (!"fin".equalsIgnoreCase(entrada)) {
                if (!nombres.contains(entrada)) {
                    nombres.add(entrada);
                    System.out.printf("%s añadido a la lista.%n", entrada);
                } else {
                    System.out.printf("%s no añadido (ya existe).%n", entrada);
                }
            }
        } while (!"fin".equalsIgnoreCase(entrada));

        if (nombres.isEmpty()) {
            System.out.println("\nLa lista de nombres está vacía");
        } else {
            System.out.print("\nLista de nombres: ");
            for (int i = 0; i < nombres.size(); i++) {
                if (i>0) {
                    System.out.print(", ");
                    System.out.print(nombres.get(i));
                } else {
                    System.out.print(nombres.get(i));
                }
            }
            System.out.println();
        }
    }
}
