package com.proyecto01.cuerposgeometricos;

public class Esfera implements CuerpoGeometrico{
    float radio;

    public Esfera() {
        this.radio = 0;
    }

    public Esfera(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea() {
        float area = (float) (4 * CuerpoGeometrico.PI * Math.pow(radio, 2));
        return area;
    }

    @Override
    public float calcularVolumen() {
        float volumen = (float) ((4 / 3) * CuerpoGeometrico.PI * Math.pow(radio, 3));
        return volumen;
    }
}
