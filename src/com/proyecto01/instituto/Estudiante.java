package com.proyecto01.instituto;

import java.util.Scanner;

public class Estudiante extends Persona {
    private int nota1;
    private int nota2;
    private int nota3;

    public Estudiante() {
        super();
        nota1 = 0;
        nota2 = 0;
        nota3 = 0;
    }

    public Estudiante(String nombre, int edad, int nota1, int nota2, int nota3) {
        super(nombre, edad);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public double promedio() {
        double prom = (nota1 + nota2 + nota3)/3;
        return prom;
    }

    public void mostrarDatosEstudiante() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Nota1: " + nota1);
        System.out.println("Nota2: " + nota2);
        System.out.println("Nota3: " + nota3);
    }

    public void leerDatosEstudiante(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre del estudiante: ");
        setNombre(teclado.next());
        System.out.println("Ingrese edad del estudiante: ");
        setEdad(teclado.nextInt());
        System.out.println("Ingrese nota 1: ");
        setNota1(teclado.nextInt());
        System.out.println("Ingrese nota 2: ");
        setNota2(teclado.nextInt());
        System.out.println("Ingrese nota 3: ");
        setNota3(teclado.nextInt());
    }

    @Override
    public String toString() {
        return "com.proyecto01.Estudiante{" +
                "nombre=" + getNombre() +
                "edad=" + getEdad() +
                "nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                '}';
    }
}
