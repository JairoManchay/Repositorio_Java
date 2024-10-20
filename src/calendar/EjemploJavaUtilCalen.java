package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalen {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        // El mes parte a partir del 0 que es Enero
        // calendario.set(2020, 0, 21, 19,20,10);

        // Formateando la fecha de acuerdo al dia que querramos
//        calendario.set(Calendar.YEAR, 2024);
//        calendario.set(Calendar.MONTH, Calendar.OCTOBER);
//        calendario.set(Calendar.DAY_OF_MONTH, 20);
//        calendario.set(Calendar.HOUR_OF_DAY, 14);
//        calendario.set(Calendar.MINUTE, 0);
//        calendario.set(Calendar.SECOND, 25);

        Date fecha = calendario.getTime();

        System.out.println("Fecha = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd ' ' HH:mm:ss");
        String fechaString = formato.format(fecha);
        System.out.println("Fecha String = " + fechaString);

        System.out.println("calendario = " + calendario);


    }

}
