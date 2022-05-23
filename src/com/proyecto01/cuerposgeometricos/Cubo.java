package com.proyecto01.cuerposgeometricos;

public class Cubo implements CuerpoGeometrico{

    private int lado;

    public Cubo() {
        this.lado = 0;
    }

    public Cubo(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
        float area = (float) (6 * Math.pow(lado, 2));
        return area;
    }

    @Override
    public float calcularVolumen() {
        float volumen = (float) Math.pow(lado, 3);
        return volumen;
    }
}
