package com.proyecto01;

import com.proyecto01.empresa.Empleado;
import com.proyecto01.empresa.Gerente;
import com.proyecto01.empresa.Obrero;

public class ProbandoAbstract {
    public static void main(String[] args) {
        Obrero ob01= new Obrero("Luis", 7000.00f, 1050);
        System.out.println("---OBRERO 01");
        System.out.println("Nombre: " + ob01.getNombre());
        System.out.println("Sueldo: " + ob01.getSueldo());
        System.out.println("Seguro de vida: " + ob01.getSeguroVida());
        System.out.println("Liquido pagable: " + ob01.liquidoPagable());

        Gerente ge01= new Gerente("Carlos", 9000.00f, 4564);
        System.out.println("---GERENTE 01");
        System.out.println("Nombre: " + ge01.getNombre());
        System.out.println("Sueldo: " + ge01.getSueldo());
        System.out.println("Viatico: " + ge01.getViatico());
        System.out.println("Liquido pagable: " + ge01.liquidoPagable());

        com.proyecto01.empresa.Empleado em01 = new Obrero("Pedro", 4520, 1000);
        com.proyecto01.empresa.Empleado em02 = new Obrero("Ana", 4550, 900);
        Empleado em03 = new Gerente("Andres", 9520, 100);

        System.out.println("--- EMPLEADO 01 - OBRERO");
        System.out.println("Nombre: " + em01.getNombre());
        System.out.println("Sueldo: " + em01.getSueldo());
        System.out.println("Seguro de vida: " + ((Obrero)em01).getSeguroVida());
        System.out.println("Liquido pagable: " + ((Obrero)em01).liquidoPagable());
    }
}
