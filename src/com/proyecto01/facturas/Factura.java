package com.proyecto01.facturas;

import java.util.Scanner;

public class Factura {
    private int nro;
    private String aNombreDe;
    private String nit;
    private int dia;
    private int mes;
    private int anio;
    private float importe;
    private int descuentoPorcentual;

    public Factura() {
        nro = 0;
        aNombreDe = "Ninguno";
        nit = "Ninguno";
        dia = 0;
        mes = 0;
        anio = 0;
        importe = 0;
        descuentoPorcentual = 0;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getaNombreDe() {
        return aNombreDe;
    }

    public void setaNombreDe(String aNombreDe) {
        this.aNombreDe = aNombreDe;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public int getDescuentoPorcentual() {
        return descuentoPorcentual;
    }

    public void setDescuentoPorcentual(int descuentoPorcentual) {
        this.descuentoPorcentual = descuentoPorcentual;
    }

    public double totalCancelar() {
        double total = (double)importe - ((double)importe * descuentoPorcentual/100);
        return total;
    }

    public void leerDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de la factura: ");
        nro = sc.nextInt();
        System.out.println("Ingrese a que nombre se emite la factura: ");
        aNombreDe = sc.next();
        System.out.println("Ingrese el NIT: ");
        nit = sc.next();
        System.out.println("Ingrese el dia: ");
        dia = sc.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = sc.nextInt();
        System.out.println("Ingrese el anio: ");
        anio = sc.nextInt();
        System.out.println("Ingrese el importe: ");
        importe = (float) sc.nextDouble();
        System.out.println("Ingrese el descuento en porcentaje: ");
        descuentoPorcentual = sc.nextInt();
    }

    public void reporte() {
        System.out.println("\n--- REPORTE FACTURA " + nro + " ---");
        System.out.println("Nro: " + nro);
        System.out.println("Nombre: " + aNombreDe);
        System.out.println("Fecha: " + dia + "/" + mes + "/" + anio);
        System.out.println("Importe: " + importe);
        System.out.println("Descuento: "+ descuentoPorcentual + "%");
        System.out.println("Total a cancelar: " + totalCancelar() + " Bs.");
    }
}
