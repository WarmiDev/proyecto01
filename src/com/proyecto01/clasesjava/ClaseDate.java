package com.proyecto01.clasesjava;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ClaseDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("Fecha actual: " + fecha);
        DateFormat df = DateFormat.getDateInstance();
        System.out.println("Fecha con formato: " + df.format(fecha));
        df = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("Fecha corta: " + df.format(fecha));
        df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Fecha medio: " + df.format(fecha));
        df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Fecha larga: " + df.format(fecha));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
        System.out.println("Mi formato: " + sdf.format(fecha));
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento (dd/mm/aaaa): ");
        String fechaNacimientoCadena = sc.next();
        Date fechaNacimientoDate = new Date();
        try {
            fechaNacimientoDate = sdf.parse(fechaNacimientoCadena);
        } catch (ParseException e) {
            System.out.println(e);
        }
        System.out.println("Mi fecha de nacimiento es: " + sdf.format(fechaNacimientoDate));
    }
}
