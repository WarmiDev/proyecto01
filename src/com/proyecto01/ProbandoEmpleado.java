package com.proyecto01;

import com.proyecto01.desarrolladores.DesarrolladorDoNet;
import com.proyecto01.desarrolladores.DesarrolladorJava;
import com.proyecto01.desarrolladores.DesarrolladorPhp;

public class ProbandoEmpleado {
    public static void main(String[] args) {
        DesarrolladorJava desJava1 = new DesarrolladorJava();
        DesarrolladorJava desJava2 = new DesarrolladorJava();
        DesarrolladorDoNet desDoNet1 = new DesarrolladorDoNet();
        DesarrolladorDoNet desDoNet2 = new DesarrolladorDoNet();
        DesarrolladorPhp desPhp1 = new DesarrolladorPhp();
        DesarrolladorPhp desPhp2 = new DesarrolladorPhp();

        desJava1.leerDatos();
        desJava2.leerDatos();
        desDoNet1.leerDatos();
        desDoNet2.leerDatos();
        desPhp1.leerDatos();
        desPhp2.leerDatos();

        desJava1.mostrarDatos();
        desJava2.mostrarDatos();
        desDoNet1.mostrarDatos();
        desDoNet2.mostrarDatos();
        desPhp1.mostrarDatos();
        desPhp2.mostrarDatos();
    }
}
