package com.proyecto01.figuras;

public class Rectangulo implements Figura{
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public float calculaArea() {
        float area;
        area = base * altura;
        return area;
    }

    @Override
    public float calculaPerimetro() {
        float perimetro;
        perimetro = 2 * (base + altura);
        return perimetro;
    }
}
