package com.proyecto01.instituto;

public class Persona {
    //Propiedades o atributos de la clase
    private String nombre;
    private int edad;

    //Constructor
    public Persona() {
        nombre = "ninguno";
        edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodos getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Otros metodos

    public String observacionEdad() {
        return edad <18 ? "Menor de edad" : "Mayor de edad";
    }

    public void cumpleanos() {
        edad++;
    }

    public char obtenerInicial() {
        return nombre.charAt(0);
    }

    public void mostrarDatosPersona() {
        System.out.println("Nombre: " + getNombre() +
                "\nEdad: " + getEdad() +
                "\nObservacion: " + observacionEdad());
        System.out.println("Inicial: " + obtenerInicial());
        cumpleanos();
        System.out.println("Edad despues de cumplir anios: " + getEdad());
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
