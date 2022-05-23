package com.proyecto01;

import com.proyecto01.cuerposgeometricos.Cubo;
import com.proyecto01.cuerposgeometricos.CuerpoGeometrico;
import com.proyecto01.cuerposgeometricos.Esfera;

public class ProbandoCuerpoGeometrico {
    public static void main(String[] args) {
        CuerpoGeometrico cubo1 = new Cubo(5);
        System.out.println("--CUBO 1, lado = " + ((Cubo)cubo1).getLado());
        System.out.println("Area del cubo1 = " + cubo1.calcularArea());
        System.out.println("Volumen del cubo1 = " + cubo1.calcularVolumen());

        CuerpoGeometrico cubo2 = new Cubo(16);
        System.out.println("--CUBO 2, lado = " + ((Cubo)cubo2).getLado());
        System.out.println("Area del cubo2 = " + cubo2.calcularArea());
        System.out.println("Volumen del cubo2 = " + cubo2.calcularVolumen());

        CuerpoGeometrico esfera1 = new Esfera(3.4f);
        System.out.println("--ESFERA 1, radio = " + ((Esfera)esfera1).getRadio());
        System.out.println("Area de la esfera1 = " + esfera1.calcularArea());
        System.out.println("Volumen del esfera1 = " + esfera1.calcularVolumen());

        CuerpoGeometrico esfera2 = new Esfera(7f);
        System.out.println("--ESFERA 2, radio = " + ((Esfera)esfera2).getRadio());
        System.out.println("Area de la esfera2 = " + esfera2.calcularArea());
        System.out.println("Volumen del esfera2 = " + esfera2.calcularVolumen());

        CuerpoGeometrico esfera3 = new Esfera(14.05f);
        System.out.println("--ESFERA 3, radio = " + ((Esfera)esfera3).getRadio());
        System.out.println("Area de la esfera3 = " + esfera3.calcularArea());
        System.out.println("Volumen del esfera3 = " + esfera3.calcularVolumen());

    }
}
