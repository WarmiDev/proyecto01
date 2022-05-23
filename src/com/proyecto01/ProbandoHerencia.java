package com.proyecto01;

import com.proyecto01.instituto.Docente;
import com.proyecto01.instituto.Estudiante;

public class ProbandoHerencia {
    public static void main(String[] args) {
        Docente doc1 = new Docente("Luis", 38, 7000, "Lic.");
        System.out.println("DATOS DOCENTE: ");
        doc1.mostrarDatosDocente();

        Estudiante est1 = new Estudiante("Carlos", 19, 100, 61, 52);
        System.out.println("DATOS ESTUDIANTE1: ");
        est1.mostrarDatosEstudiante();

        Estudiante est2 = new Estudiante("Carlos", 19, 85, 61, 15);
        System.out.println("DATOS ESTUDIANTE2: ");
        est2.mostrarDatosEstudiante();

        Estudiante est3 = new Estudiante("Alicia", 35, 100, 85, 10);
        System.out.println("DATOS ESTUDIANTE3: ");
        est3.mostrarDatosEstudiante();

    }
}
