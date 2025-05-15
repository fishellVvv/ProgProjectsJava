package ut04EstructurasAlacenamiento.sesion11.ej02ArrayListArrayList;

import java.util.ArrayList;

public class ej05SumarValores {
    public static void main(String[] args) {

        /*
        5. Sumar Valores de una Lista de Listas:

         Crea un ArrayList<ArrayList<Integer>> que contenga varias listas con números.
         Suma todos los números dentro de las listas internas y muestra el resultado total.
         */

        ArrayList<ArrayList<Integer>> sumandos = new ArrayList<>();

        ArrayList<Integer> sum1 = new ArrayList<>();
        sum1.add(1);
        sum1.add(2);
        sum1.add(3);
        sumandos.add(sum1);

        ArrayList<Integer> sum2 = new ArrayList<>();
        sum2.add(4);
        sum2.add(5);
        sum2.add(6);
        sumandos.add(sum2);

        ArrayList<Integer> sum3 = new ArrayList<>();
        sum3.add(7);
        sum3.add(8);
        sum3.add(9);
        sumandos.add(sum3);

        int suma = 0;

        for (int i = 0; i < sumandos.size(); i++) {
            for (Integer sumando : sumandos.get(i)) {
                suma += sumando;
            }
        }
        System.out.println("La suma total es " + suma);
    }
}