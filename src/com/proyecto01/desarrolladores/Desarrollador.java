package com.proyecto01.desarrolladores;

import java.util.Scanner;

public class Desarrollador extends Empleado {
    private int aniosExperiencia;
    private String descripcion;

    public Desarrollador() {
        super();
        aniosExperiencia = 0;
        descripcion = "Ninguna";
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void leerDatos() {
        Scanner sc = new Scanner(System.in);
        super.leerDatos();
        System.out.println("Ingrese los anios de experiencia: ");
        aniosExperiencia = sc.nextInt();
        System.out.println("Ingrese la descripcion: ");
        descripcion = sc.next();
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Experiencia: " + aniosExperiencia + " anios");
        System.out.println("Descripcion: " + descripcion);
    }
}
