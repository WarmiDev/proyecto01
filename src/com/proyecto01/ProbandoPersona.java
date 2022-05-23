package com.proyecto01;

import com.proyecto01.instituto.Persona;

public class ProbandoPersona {
    public static void main(String[] args) {
        //instanciar objetos de la clase persona
        Persona per1 = new Persona("Ana", 14);
        System.out.println("DATOS PERSONA 1:");
        per1.mostrarDatosPersona();

        System.out.println("--------------------------------------");

        Persona per2 = new Persona("Luis", 19);
        System.out.println("DATOS PERSONA 2:");
        per2.mostrarDatosPersona();

        System.out.println("--------------------------------------");

        Persona per3 = new Persona("Ana", 33);
        System.out.println("DATOS PERSONA 3:");
        per3.mostrarDatosPersona();
        System.out.println(per3); //Podemos imprimir esto gracias al metodo toString
    }
}
