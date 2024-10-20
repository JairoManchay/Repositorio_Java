package calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploUtilDateParse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con el siguiente formato: dd-MM-yyyy");
        try {
            Date fecha = format.parse(s.nextLine());
//            Date fecha = format.parse("18-01-2020");
            System.out.println("fecha = " + fecha);
            System.out.println("Format = " + format.format((fecha)));


            Date fecha2 = new Date();

            if(fecha.after(fecha2)) {
                System.out.println("Fecha del usuario es despues que la fecha actual");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha del usuario es antes que la fecha actual");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha1 es igual a Fecha2");
            }

            System.out.println("Valor de compareTo = " + fecha2.compareTo(fecha));
            if (fecha.compareTo(fecha2) > 0) {
                System.out.println("Fecha del usuario es despues que la fecha actual");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha del usuario es antes que la fecha actual");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Fecha1 es igual a Fecha2");
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
