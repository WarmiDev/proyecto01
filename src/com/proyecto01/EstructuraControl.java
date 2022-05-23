package com.proyecto01;
import java.util.Scanner;

public class EstructuraControl {
    public static void main(String[] args) {
        //Instabanciar un objeto Scanner
        Scanner teclado = new Scanner(System.in);
        System.out.println("--DATOS DE ESTUDIANTES--");
        System.out.println("Ingrese el numero de estudiantes: ");
        int cantidadEstudiantes = teclado.nextInt();
        String[] nombres = new String[cantidadEstudiantes];
        byte[] notas = new byte[cantidadEstudiantes];
        byte[] edades = new byte[cantidadEstudiantes];
        for(int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("ESTUDIANTE NRO " + i);
            System.out.println("Ingresar el nombre del estudiante: ");
            nombres[i] = teclado.next();
            System.out.println("Ingresar la nota del estudiante: ");
            notas[i] = teclado.nextByte();
            System.out.println("Ingresar la edad del estudiante: ");
            edades[i] = teclado.nextByte();
        }
        System.out.println("--LISTA DE ESTUDIANTES--");
        System.out.println("# \t NOMBRE \t NOTA \t EDAD \t Obs.Edad \t Obs.Nota");
        for(int i = 0; i < cantidadEstudiantes; i++){
            System.out.println(i + "\t" + nombres[i] +
                                "\t" + notas[i] +
                                "\t" + edades[i] +
                                "\t" + (edades[i]<18 ? "Menor de edad" : "Mayor de edad") +
                                "\t" + (notas[i]<51 ? "Reprobado" : "Aprobado"));
        }
        System.out.println("Estudiantes inscritos: " + cantidadEstudiantes);
    }
}
