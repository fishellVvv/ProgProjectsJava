package RetosProgramacion.RetosAbril;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class RetoDia03ElTiempo {
    public static void main(String[] args) {

        /*
        Crear dos variables utilizando los objetos fecha.

        En la primera se representa la fecha (día, mes, año) actual.
        En la segunda se representa la fecha de nacimiento.

        Calcular cuántos años han transcurrido entre ambas fechas y muestra su resultado de maneras diferentes.
        Día, mes y año.
        Hora, minuto y segundo.
        Día de año.
        Día de la semana.
        Nombre del mes.

        Pistas: buscar sobre el paquete java.time para fechas y horas.
         */

        Scanner scn = new Scanner(System.in);

        System.out.print("Porfa, dime tu fecha de nacimiento (dd/mm/aaaa): ");
        LocalDate fechaNacimiento = LocalDate.parse(scn.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")); // guardamos la fecha de nacimiento como fecha (LocalDate) asignando el formato
        LocalDate fechaActual = LocalDate.now(); // y registramos la fecha de hoy

        Period diasVividos = Period.between(fechaNacimiento, fechaActual); // calculamos el tiempo que ha pasado entre ambas fechas
        System.out.println("\nHas vivido ya " + diasVividos.getYears() + " años, " + diasVividos.getMonths() + " meses y " + diasVividos.getDays() + " días (casi nada!).");

        System.out.print("Teniendo en cuenta que hoy es " + fechaActual.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("es-ES")) + ", "
                + fechaActual.getDayOfMonth() + " de "
                + fechaActual.getMonth().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("es-ES")) + " de "
                + fechaActual.getYear());
        System.out.println(" y que son las " + LocalTime.now().getHour() + ":" + LocalTime.now().getMinute() + ":" + LocalTime.now().getSecond() + " :");

        System.out.println("Te informo de que han pasado " + fechaActual.getDayOfYear() + " días dede el inicio del año (que son " + (LocalTime.now().getHour() + (fechaActual.getDayOfYear()*24)) + " horas).");

        // A partir de aquí se me ha ocurrido complicarme la vida y voy a imprimir los dias y horas desde que naciste

        LocalDateTime horaNacimiento = fechaNacimiento.atStartOfDay(); // definimos la hora de nacimiento a las 00:00
        LocalDateTime horaActual = LocalDateTime.now(); // y registramos la hora actual
        Duration horasVividas = Duration.between(horaNacimiento, horaActual);

        System.out.println("\n(y desde que naciste han pasado " + horasVividas.toDays() + " días, que son unas " + horasVividas.toHours() + " horas)");

        scn.close();
    }
}