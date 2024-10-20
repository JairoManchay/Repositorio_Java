package calendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtil {

    public static void main(String[] args) {

        Date fecha = new Date();
        System.out.println("fecha: " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM yyyy");


        String FechaSimpleDate =df.format(fecha);
        System.out.println("Fecha: " + FechaSimpleDate);

        //Asignar fecha a un lenguaje local
        String fechaFormateada = DateFormat.getDateInstance(DateFormat.MEDIUM).format(fecha);


        // Contabilizar milisegundos mediante un for
        long j=0;
        for (int i=0; i< 1000000; i++){
            j +=i;
        }

        System.out.println("J = " + j);

        Date fecha2= new Date();
        long timepoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("tiempo transcurrido en el for = " + timepoFinal);


        System.out.println("fechaFormateada: " + fechaFormateada);
    }
}
