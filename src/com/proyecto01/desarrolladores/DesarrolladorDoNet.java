package com.proyecto01.desarrolladores;

import java.util.Scanner;

public class DesarrolladorDoNet extends Desarrollador{
    private boolean expertoASP;
    private boolean expertoMVC;

    public DesarrolladorDoNet() {
        expertoASP = false;
        expertoMVC = false;
    }

    public boolean isExpertoASP() {
        return expertoASP;
    }

    public void setExpertoASP(boolean expertoASP) {
        this.expertoASP = expertoASP;
    }

    public boolean isExpertoMVC() {
        return expertoMVC;
    }

    public void setExpertoMVC(boolean expertoMVC) {
        this.expertoMVC = expertoMVC;
    }

    public void leerDatos() {
        Scanner sc = new Scanner(System.in);
        super.leerDatos();
        System.out.println("Es Experto en ASP?: ");
        expertoASP = sc.nextBoolean();
        System.out.println("Es Experto en MVC?: ");
        expertoMVC = sc.nextBoolean();
    }

    public void mostrarDatos() {
        System.out.println("\n--- EMPLEADO DO NET---");
        super.mostrarDatos();
        System.out.println("Experto en ASP: " + (expertoASP ? "Si" : "No"));
        System.out.println("Experto en MVC: " + (expertoMVC ? "Si" : "No"));
    }
}
