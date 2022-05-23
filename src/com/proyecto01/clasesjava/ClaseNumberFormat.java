package com.proyecto01.clasesjava;

import java.text.NumberFormat;

public class ClaseNumberFormat {
    public static void main(String[] args) {
        float numero = 327.7788F;
        System.out.println("numero = " + numero);
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        System.out.println(nf.format(numero));
    }
}
