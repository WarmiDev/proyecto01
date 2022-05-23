package com.proyecto01.desarrolladores;

import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int edad;

    public Empleado() {
        nombre = "Ninguno";
        edad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void leerDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = sc.next();
        System.out.println("Ingrese la edad del empleado: ");
        edad = sc.nextInt();
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
