package com.proyecto01;

import com.proyecto01.tienda.Catalogo;

import java.util.Scanner;

public class ProbandoTienda {
    public static void main(String[] args) {
        int op = 0;
        Scanner sc = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();
        while(op != 5) {
            System.out.println();
            System.out.println("MENU PRINCIPAL - PRODUCTOS");
            System.out.println("1. Adicionar nuevo producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Eliminar productos");
            System.out.println("4. Editar un producto");
            System.out.println("5. Salir de la aplicacion");
            System.out.println("Que accion desea realizar?");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    catalogo.adicionarProducto();
                    break;
                case 2:
                    catalogo.listarProductos();
                    break;
                case 3:
                    catalogo.listarProductos();
                    System.out.println("Que Nro de producto desea eliminar? ");
                    int n = sc.nextInt();
                    catalogo.eliminarProducto(n);
                    break;
                case 4:
                    catalogo.listarProductos();
                    System.out.println("Que Nro de producto desea editar? ");
                    int i = sc.nextInt();
                    catalogo.editarProducto(i);
                    break;
            }
        }
    }
}
