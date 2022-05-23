package com.proyecto01.clasesjava;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class ClaseString {
    private char obtenerUltimoCaracter(String str) {
        return str.charAt(str.length()-1);
    }
    public static void main(String[] args) {
        String nombre = "Luis";
        String apellido = new String("Antezana");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        int cantidadCaracteresNombre = nombre.length();
        int cantidadCaracteresApellido = apellido.length();
        System.out.println("cantidadCaracteresNombre = " + cantidadCaracteresNombre);
        System.out.println("cantidadCaracteresApellido = " + cantidadCaracteresApellido);
        System.out.println("Iniciales: " + nombre.charAt(0) + "." + apellido.charAt(0) + ".");
        ClaseString cs = new ClaseString();
        System.out.println("Ultimo caracter de nombre: " + cs.obtenerUltimoCaracter(nombre));
        System.out.println("Ultimo caracter de apellido: " + cs.obtenerUltimoCaracter(apellido));
        System.out.println("Nombre en maysuculas: " + nombre.toUpperCase());
        System.out.println("Nombre en minusculas: " + nombre.toLowerCase());
        System.out.println("Comparar nombre con apellido: " + nombre.equals(apellido));
        String saludo = "Hola mundo";
        System.out.println("saludo = " + saludo);
        saludo = saludo.replace('o', 'u');
        System.out.println("saludo = " + saludo);
        String fecha = "29/05/2022";
        String[] arrayFecha = fecha.split("/");
        String dia = arrayFecha[0];
        String mes = arrayFecha[1];
        String anio = arrayFecha[2];
        System.out.println("dia = " + dia);
        System.out.println("mes = " + mes);
        System.out.println("anio = " + anio);
    }
}
