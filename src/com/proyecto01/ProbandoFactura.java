package com.proyecto01;

import com.proyecto01.facturas.Factura;

public class ProbandoFactura {
    public static void main(String[] args) {
        Factura[] facturas = new Factura[5];

        for(int i = 0; i < 5; i++) {
            facturas[i] = new Factura();
            facturas[i].leerDatos();
            System.out.println();
        }

        for(Factura f: facturas){
            f.reporte();
        }
    }
}
