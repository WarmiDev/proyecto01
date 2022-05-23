package com.proyecto01.figuras;

public class Circulo implements Figura{
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public float calculaArea() {
        float area;
        area = (float) (Figura.PI * Math.pow(radio, 2));
        return area;
    }

    @Override
    public float calculaPerimetro() {
        float perimetro;
        perimetro = 2 * PI * radio;
        return perimetro;
    }
}
