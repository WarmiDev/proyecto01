package com.proyecto01;

import com.proyecto01.instituto.*;

import java.util.Scanner;

public class ProbandoCurso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("****** SISTEMA DE INSCRIPCIONES ****");
        System.out.println("--- INGRESAR DATOS DEL CURSO");
        Curso cur01 = new Curso();
        System.out.println("Ingrese el nombre del curso: ");
        cur01.setNombreCurso(sc.next());
        System.out.println("Ingrese el costo del curso: ");
        cur01.setCosto(sc.nextDouble());

        System.out.println("-- DATOS DEL DOCENTE ");
        Docente doc = new Docente();
        doc.leerDatosDocente();
        cur01.setDocente(doc);

        System.out.println("-- DATOS DE ESTUDIANTES ");
        System.out.println("Ingresar la cantidad de estudiantes: ");
        int cantidadEstudiantes = sc.nextInt();
        Estudiante[] estudiantes = new Estudiante[cantidadEstudiantes];
        for(int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("--- INGRESAR ESTUDIANTE " + (i + 1));
            Estudiante e = new Estudiante();
            e.leerDatosEstudiante();
            estudiantes[i] = e;
        }
        cur01.setEstudiantes(estudiantes);
        System.out.println("******************************");
        System.out.println("***** REPORTE DEL CURSO ******");
        System.out.println("******************************");

        System.out.println("Curso: " + cur01.getNombreCurso());
        System.out.println("Costo: " + cur01.getCosto());
        System.out.println("Docente: " + cur01.getDocente().getGradoAcademico() +
                                " " + cur01.getDocente().getNombre());
        System.out.println("Sueldo docente: " + cur01.getDocente().getSueldo());
        System.out.println("------ LISTA DE ESTUDIANTES ---------");
        System.out.println("# \t NOMBRE \t EDAD \t N1 \t N2 \t N3  \t PROM");
        for(int i = 0; i < cur01.getEstudiantes().length; i++){
            System.out.println((i+1) + "\t" + cur01.getEstudiantes()[i].getNombre() +
                        "\t" + cur01.getEstudiantes()[i].getEdad() +
                        "\t" + cur01.getEstudiantes()[i].getNota1() +
                        "\t" + cur01.getEstudiantes()[i].getNota2() +
                        "\t" + cur01.getEstudiantes()[i].getNota2() +
                        "\t" + cur01.getEstudiantes()[i].getNota3() +
                        "\t" + cur01.getEstudiantes()[i].promedio());
        }
    }
}
