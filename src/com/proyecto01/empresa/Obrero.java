package com.proyecto01.empresa;

public class Obrero extends Empleado {

    private float seguroVida;

    public Obrero(String nombre, float sueldo, float seguroVida) {
        super(nombre, sueldo);
        this.seguroVida = seguroVida;
    }

    @Override
    public float liquidoPagable() {
        float lp = this.getSueldo() + this.seguroVida;
        return 0;
    }

    public float getSeguroVida() {
        return seguroVida;
    }

    public void setSeguroVida(float seguroVida) {
        this.seguroVida = seguroVida;
    }
}
