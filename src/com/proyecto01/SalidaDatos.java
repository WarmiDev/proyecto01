package com.proyecto01;

public class SalidaDatos {
    // main + tab
    public static void main(String[] args) {
        //sout + tab
        System.out.println("SALIDA DE DATOS");
        // Para guardar Ctrl + s
        // Para ejecutar clic derecho Run SalidaDatos.main()
        String nombre = "Juan";
        System.out.println("Nombre: " + nombre);
        // Ctrl + z para deshacer cambios
        char genero = 'm';
        System.out.println("Genero: " + genero);
        int edad = 23;
        System.out.println("Edad:" + edad);
        float sueldo = (float) 5200.52;
        System.out.println("Sueldo: " + sueldo);
        float ahorro = 10200.45f; // o 10200.45F
        System.out.println("Ahorro: " + ahorro);
        double mensualidad = 8200.78;
        System.out.println("Mensualidad: " + mensualidad);
        boolean esCasado = true;
        System.out.println("Es usted casado?: " + esCasado);
        String[] frutas = new String[4];
        frutas[0] = "Limon";
        frutas[1] = "Manzana";
        frutas[2] = "Papaya";
        frutas[3] = "Cereza";
        System.out.println("frutas[0]: " + frutas[0]);
        System.out.println("frutas[1]: " + frutas[1]);
        System.out.println("frutas[2]: " + frutas[2]);
        System.out.println("frutas[3]: " + frutas[3]);
        int a = 5;
        int b = 6;
        int c = a + b;
        System.out.println("Suma: " + c);
        System.out.println("Pos-incremento: " + a);
        System.out.println("Pre-incremento: " + ++b);
        String mensaje = edad > 18 ? "Mayor de edad" : "Menor de edad";
        System.out.println(mensaje);

    }
}
