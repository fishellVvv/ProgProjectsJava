package ut05OrientacionObjetos.cuadernoSantillana;

// 13.Números pares de un array
// Llena un array con 20 números aleatorios del 1 al 100 y muestra solo los pares.

public class ej13ParesArray {
    public static void main(String[] args) {
        int[] nums = new int[20];

        for (int i = 0; i < nums.length; i++) nums[i] = (int) ((Math.random() * 99) + 1);

        for (int n : nums) {
            if (n % 2 == 0) {
                System.out.printf("%,d, ", n);
            }
        }
    }
}
