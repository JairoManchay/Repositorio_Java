package calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class EjercicioEdadActual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        int resultado = 0;

        try {
            System.out.println(" Ingrese una fecha de nacimiento con formato yyyy-MM-dd " );
            Date fechaRecibida = formato.parse(sc.nextLine());

            formato = new SimpleDateFormat("yyyyMMdd");
            int desde = Integer.parseInt(formato.format(fechaRecibida));


            int hasta = Integer.parseInt(formato.format(cal.getTime()));

            System.out.println("hasta  " + hasta);
            System.out.println("desde  " + desde);


            // luego restamos ambas fechas y dividimos en 10000 para quitar decimales y
            // dejar la fecha en decenas o centenas
            resultado = (hasta - desde) / 10000;

            System.out.println("La edad que usted tiene es  " + resultado);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
