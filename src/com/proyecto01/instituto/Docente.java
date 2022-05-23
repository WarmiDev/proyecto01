package com.proyecto01.instituto;

import java.util.Scanner;

public class Docente extends Persona {
    private double sueldo;
    private String gradoAcademico;

    public Docente() {
        super();
        sueldo = 0;
        gradoAcademico = "ninguno";
    }

    public Docente(String nombre, int edad, double sueldo, String gradoAcademico) {
        super(nombre, edad);
        this.sueldo = sueldo;
        this.gradoAcademico = gradoAcademico;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }


    public void mostrarDatosDocente() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Grado Academico: " + gradoAcademico);
    }

    public void leerDatosDocente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del docente: ");
        setNombre(sc.next());
        System.out.println("Ingrese la edad del docente: ");
        setEdad(sc.nextInt());
        System.out.println("Ingrese el sueldo del docente: ");
        setSueldo(sc.nextFloat());
        System.out.println("Ingrese el grado academico del docente: ");
        setGradoAcademico(sc.next());
    }
}
