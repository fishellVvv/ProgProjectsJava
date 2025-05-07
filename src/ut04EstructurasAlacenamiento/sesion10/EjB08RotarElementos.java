package ut04EstructurasAlacenamiento.sesion10;

public class EjB08RotarElementos {
    public static void main(String[] args) {

        /*
        8. Rotar elementos
        Escribe un programa que rote los elementos de un array una posición hacia la derecha.
        Ejemplo: {1, 2, 3, 4, 5} → {5, 1, 2, 3, 4}.
         */

        int[] numeros = new int[] {1, 2, 3, 4, 5};
        int ultimo = numeros[numeros.length-1];

        for (int i = numeros.length -1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = ultimo;

        for(int numero : numeros) {
            System.out.print(numero + ", ");
        }
    }
}