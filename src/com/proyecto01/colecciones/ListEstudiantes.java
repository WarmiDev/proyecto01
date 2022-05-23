package com.proyecto01.colecciones;

import com.proyecto01.instituto.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class ListEstudiantes {
    public static void main(String[] args) {
        List<Estudiante> estudianteList = new ArrayList<>();
        estudianteList.add(new Estudiante("Luis", 23, 59, 95, 85));
        estudianteList.add(new Estudiante("Ana", 52, 45, 56, 50));
        estudianteList.add(new Estudiante("Pedro", 27, 59, 65, 100));

        for(Estudiante e: estudianteList){
            System.out.println(e);
        }

        estudianteList.remove(1);
        System.out.println("LISTA DESCPUES DE REMOVER A UN ESTUDIANTE");
        for(Estudiante e: estudianteList){
            System.out.println(e);
        }
    }
}
