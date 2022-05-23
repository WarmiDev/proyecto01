package com.proyecto01.clasesjava;

import java.util.Calendar;
import java.util.Date;

public class ClaseCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date fecha = calendar.getTime();
        System.out.println("Fecha: " + fecha);

        System.out.println("Año: " + calendar.get(Calendar.YEAR));
        System.out.println("Mes: " + calendar.get(Calendar.MONTH)+1); // Los meses estan entre 0 y 11
        System.out.println("Dia: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hora: " + calendar.get(Calendar.HOUR));
        System.out.println("Minuto: " + calendar.get(Calendar.MINUTE));
        System.out.println("Segundo: " + calendar.get(Calendar.SECOND));
    }
}
