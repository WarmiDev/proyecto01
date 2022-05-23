package com.proyecto01.desarrolladores;

import java.util.Scanner;

public class DesarrolladorPhp extends Desarrollador{
    private boolean expertoCodeigniter;
    private boolean expertoMySql;

    public DesarrolladorPhp() {
        expertoCodeigniter = false;
        expertoMySql = false;
    }

    public boolean isExpertoCodeigniter() {
        return expertoCodeigniter;
    }

    public void setExpertoCodeigniter(boolean expertoCodeigniter) {
        this.expertoCodeigniter = expertoCodeigniter;
    }

    public boolean isExpertoMySql() {
        return expertoMySql;
    }

    public void setExpertoMySql(boolean expertoMVC) {
        this.expertoMySql = expertoMVC;
    }

    public void leerDatos() {
        Scanner sc = new Scanner(System.in);
        super.leerDatos();
        System.out.println("Es Experto en Codeigniter?: ");
        expertoCodeigniter = sc.nextBoolean();
        System.out.println("Es Experto en MySql?: ");
        expertoMySql = sc.nextBoolean();
    }

    public void mostrarDatos() {
        System.out.println("\n--- EMPLEADO PHP---");
        super.mostrarDatos();
        System.out.println("Experto en Codeigniter: " + (expertoCodeigniter ? "Si" : "No"));
        System.out.println("Experto en MySql: " + (expertoMySql ? "Si" : "No"));
    }
}