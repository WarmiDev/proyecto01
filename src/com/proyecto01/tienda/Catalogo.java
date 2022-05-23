package com.proyecto01.tienda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Catalogo {
    List<Producto> productos = new ArrayList<>();
    public void adicionarProducto(){
        Producto producto = new Producto();
        producto.leerProductoDesdeTeclado();
        producto.mostrarProducto();
        productos.add(producto);
        System.out.println("Producto adicionado correctamente");
    }

    public void listarProductos() {
        System.out.println("---CATALOGO ACTUALIZADO");
        System.out.println("NRO. \t CODIGO \t NOMBRE \t MARCA \t PRECIO");
        for(int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + "\t" +
                    productos.get(i).getCodigo() + "\t" +
                    productos.get(i).getNombre() + "\t" +
                    productos.get(i).getMarca() + "\t" +
                    productos.get(i).getPrecio());
        }
    }

    public void eliminarProducto(int nro){
        productos.remove(nro-1);
        System.out.println("El producto se elimino correctamente");
    }

    public void editarProducto(int nro) {
        Scanner sc = new Scanner(System.in);
        Producto producto = productos.get(nro-1);
        System.out.println("Que dato desea editar del producto seleccionado?");
        System.out.println("1. Codigo");
        System.out.println("2. Nombre");
        System.out.println("3. Marca");
        System.out.println("4. Precio");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Ingrese el nuevo codigo");
                String codigo = (String) sc.next();
                producto.setCodigo(codigo);
                break;
            case 2:
                System.out.println("Ingrese el nuevo nombre");
                String nombre = (String) sc.next();
                producto.setNombre(nombre);
                break;
            case 3:
                System.out.println("Ingrese la nueva marca");
                String marca = (String) sc.next();
                producto.setMarca(marca);
                break;
            case 4:
                System.out.println("Ingrese el nuevo precio");
                double precio = sc.nextDouble();
                producto.setPrecio(precio);
                break;
        }
    }
}
