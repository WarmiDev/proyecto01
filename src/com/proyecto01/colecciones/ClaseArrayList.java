package com.proyecto01.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClaseArrayList {
    public static void main(String[] args) {
        System.out.println("---LISTADO DE NOMBRES");
        List<String> nombresList = new ArrayList();
        nombresList.add("Lucia");
        nombresList.add("Amilcar");
        nombresList.add("Adela");
        nombresList.add("Nataniel");
        // Para mostrar los datos, instanciamos un iterador
        Iterator it = nombresList.iterator();
        while(it.hasNext()){
            String nombre = (String)it.next();
            System.out.println(nombre);
        }

        //Otra forma de mostrar la coleccion
        System.out.println("---LISTADO DE NOMBRES con iterador2");
        Iterator<String> it2 = nombresList.iterator();
        while(it2.hasNext()){
            String nombre = it2.next();
            System.out.println(nombre);
        }

        System.out.println("---LISTADO DE NOMBRES con for");
        for(int i = 0; i < nombresList.size(); i++) {
            System.out.println(nombresList.get(i));
        }

        System.out.println("---LISTADO DE NOMBRES con for-each");
        for(String n : nombresList) {
            System.out.println(n);
        }
    }
}
