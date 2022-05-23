package com.proyecto01;

import java.util.Scanner;

public class EjerciciosStrings {
    public static void main(String[] args) {
        String texto = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una palabra: ");
        texto = (String)sc.next();

        System.out.println("El primer caracter de la palabra es: " + texto.charAt(0));
        System.out.println("El ultimo caracter de la palabra es: " + texto.charAt(texto.length()-1));

        StringBuilder sb = new StringBuilder(texto);

        System.out.println("La palabra invertida es: " + sb.reverse().toString());

        String textoGuiones = "" + texto.charAt(0);
        for(int i = 1; i < texto.length(); i++){
            textoGuiones += ("-" + texto.charAt(i));
        }
        System.out.println("La palabra con guiones entre letras es: " + textoGuiones);

        int cantidadVocales = 0;
        for(int i = 0; i < texto.length() ; i++) {
            if(texto.charAt(i) == 'a' || texto.charAt(i) == 'A' ||
                    texto.charAt(i) == 'e' || texto.charAt(i) == 'E' ||
                    texto.charAt(i) == 'i' || texto.charAt(i) == 'I' ||
                    texto.charAt(i) == 'o' || texto.charAt(i) == 'O' ||
                    texto.charAt(i) == 'u' || texto.charAt(i) == 'U') {
                cantidadVocales++;
            }
        }
        System.out.println("La palabra tiene " + cantidadVocales + " vocales");
    }
}
