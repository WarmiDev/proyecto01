package com.proyecto01.desarrolladores;

import java.util.Scanner;

public class DesarrolladorJava extends Desarrollador{
    private boolean expertoJSE;
    private boolean expertoJEE;

    public DesarrolladorJava() {
        expertoJSE = false;
        expertoJEE = false;
    }

    public boolean isExpertoJSE() {
        return expertoJSE;
    }

    public void setExpertoJSE(boolean expertoJSE) {
        this.expertoJSE = expertoJSE;
    }

    public boolean isExpertoJEE() {
        return expertoJEE;
    }

    public void setExpertoJEE(boolean expertoJEE) {
        this.expertoJEE = expertoJEE;
    }

    public void leerDatos() {
        Scanner sc = new Scanner(System.in);
        super.leerDatos();
        System.out.println("Es Experto en JSE?: ");
        expertoJSE = sc.nextBoolean();
        System.out.println("Es Experto en JEE?: ");
        expertoJEE = sc.nextBoolean();
    }

    public void mostrarDatos() {
        System.out.println("\n--- EMPLEADO JAVA---");
        super.mostrarDatos();
        System.out.println("Experto en JSE: " + (expertoJSE ? "Si" : "No"));
        System.out.println("Experto en JEE: " + (expertoJEE ? "Si" : "No"));
    }
}
