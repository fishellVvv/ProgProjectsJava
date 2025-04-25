package RetosProgramacion.RetosAbril;

public class RetoDia02Calendario {
    public static void main(String[] args) {

        /*
        Tu misión es simple, soldado: crear un calendario que muestre todos los meses del año y sus semanas de forma clara y organizada.
        Nada de efectos especiales ni complicaciones innecesarias, solo un buen código que haga el trabajo. Crea un programa que:
        Itere los meses del año
        Itere las semanas del mes

        PISTA: Bucle for anidado.

        --Ejemplo:
        Enero
        Semana 1
        Semana 2
        Semana 3
        …
         */

        String[] mesesAnio = new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
            "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}; // definimos los meses del año
        int diasMes;
        int diasAnio = 2; // el día del año empieza en 2 porque 2025 comienza en miércoles
        int diasSemana = 2; // al igual que el año, la primera semana comienza en miércoles
        int numSemana = 0;

        System.out.println("\n** Calendario 2025 **"); // imprimimos el año

        for (int i=0; i<12; i++) { // bucle que recorre los 12 meses

            if (i == 1) { // definimos los días para febrero (28 porque 2025 no es bisiesto)
                diasMes = 28;
            } else if (i == 3 || i == 5 || i == 8 || i == 10) { // para los meses de 30 días
                diasMes = 30;
            } else { // para el resto que son los de 31 días
                diasMes = 31;
            }

            System.out.println("\n" + mesesAnio[i]); // imprimimos el nombre del mes

            for (int j=diasSemana; j>0; j--){ // imprimimos guiones "-" para los días de la semana que no son de este mes
                System.out.print("-\t");
            }

            for (int k=1; k<=diasMes; k++) { // bucle que recorre los días de cada mes

                System.out.print(k + "\t"); // imprimimos el número del día
                diasAnio++;

                if (diasAnio % 7 == 0) { // cada 7 días imprimimos la semana y un salto de línea
                    numSemana++;
                    System.out.println("Semana " + numSemana);
                }
            }

            diasSemana = diasAnio % 7; // recalculamos el número de días de la semana que hay recorridos ya antes de empezar el nuevo mes

            System.out.println(); // separación entre los meses
        }
    }
}