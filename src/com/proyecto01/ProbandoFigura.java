package com.proyecto01;

import com.proyecto01.figuras.Circulo;
import com.proyecto01.figuras.Figura;
import com.proyecto01.figuras.Rectangulo;

public class ProbandoFigura {
    public static void main(String[] args) {
        System.out.println("-- DATOS RECTANGULO 1");
        Rectangulo rect1 = new Rectangulo(15, 8);
        System.out.println("Base: " + rect1.getBase());
        System.out.println("Altura: " + rect1.getAltura());
        System.out.println("Area = " + rect1.calculaArea());
        System.out.println("Perimetro = " + rect1.calculaPerimetro());

        Rectangulo[] arrayRectangulos = new Rectangulo[2];
        arrayRectangulos[0] = rect1;

        System.out.println("-- DATOS CIRCULO 1");
        Circulo cir1 = new Circulo(6);
        System.out.println("Radio: " + cir1.getRadio());
        System.out.println("Area = " + cir1.calculaArea());
        System.out.println("Perimetro = " + cir1.calculaPerimetro());

        Circulo[] arrayCirculos = new Circulo[2];
        arrayCirculos[0] = cir1;

        System.out.println("-- DATOS FIGURA RECTANGULO");
        Figura fig01 = new Rectangulo(5, 8);
        System.out.println("Base: " + ((Rectangulo)fig01).getBase());
        System.out.println("Altura: " + ((Rectangulo)fig01).getAltura());
        System.out.println("Area = " + fig01.calculaArea());
        System.out.println("Perimetro = " + fig01.calculaPerimetro());

        System.out.println("-- DATOS FIGURA CIRCULO");
        Figura fig02 = new Circulo(8);
        System.out.println("Radio: " + ((Circulo)fig02).getRadio());
        System.out.println("Area = " + fig01.calculaArea());
        System.out.println("Perimetro = " + fig01.calculaPerimetro());

        Figura[] arrayFiguras = new Figura[2];
        arrayFiguras[0] = fig01;
        arrayFiguras[1] = fig02;
    }
}
