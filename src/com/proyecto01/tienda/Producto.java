package com.proyecto01.tienda;

import java.util.Scanner;

public class Producto {
    private String codigo;
    private String nombre;
    private String marca;
    private double precio;

    Scanner sc = new Scanner(System.in);

    public Producto() {
        this.codigo = "";
        this.nombre = "";
        this.marca = "";
        this.precio = 0;
    }

    public Producto(String codigo, String nombre, String marca, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Producto con codigo " + codigo + " es un/a " + nombre);
        System.out.println("\t marca " + marca + " y cuesta " + precio + " Bs.");
    }

    public void leerProductoDesdeTeclado(){
        System.out.println("Ingrese el codigo del producto: ");
        setCodigo((String)sc.next());
        System.out.println("Ingrese el nombre del producto: ");
        setNombre((String)sc.next());
        System.out.println("Ingrese la marca del producto: ");
        setMarca((String)sc.next());
        System.out.println("Ingrese el precio del producto: ");
        setPrecio(sc.nextDouble());
    }
}
