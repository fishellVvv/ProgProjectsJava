package ut04EstructurasAlacenamiento.sesion10;

public class EjB06InvertirArray {
    public static void main(String[] args) {

        /*
        6. Invertir un array
        Crea un programa que invierta los elementos de un array.
        Por ejemplo, si el array es {1, 2, 3, 4, 5}, el resultado debe ser {5, 4, 3, 2, 1}.
         */

        int[] numeros = new int[] { 1, 2, 3, 4, 5 };
        int[] numerosInvertidos = new int[numeros.length];

        for(int i=0; i<numeros.length; i++) {
            numerosInvertidos[i] = numeros[numeros.length -1 -i];
        }
        for(int numero : numeros) {
            System.out.print(numero + ", ");
        }
        System.out.println("\n");
        for(int numero : numerosInvertidos) {
            System.out.print(numero + ", ");
        }
    }
}