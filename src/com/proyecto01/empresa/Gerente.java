package com.proyecto01.empresa;

public class Gerente extends Empleado{
    private float viatico;

    public Gerente(String nombre, float sueldo, float viatico) {
        super(nombre, sueldo);
        this.viatico = viatico;
    }

    @Override
    public float liquidoPagable() {
        float lp = this.getSueldo() + viatico * 2;
        return lp;
    }

    public float getViatico() {
        return viatico;
    }

    public void setViatico(float viatico) {
        this.viatico = viatico;
    }
}
