package com.proyecto01.instituto;

public class Curso {
    private String nombreCurso;
    private double costo;
    private Docente docente = new Docente(); //Composicion
    private Estudiante[] estudiantes; //Agregacion

    public Curso() {
        this.nombreCurso = "Ninguno";
        this.costo = 0;
    }

    public Curso(String nombreCurso, double costo) {
        this.nombreCurso = nombreCurso;
        this.costo = costo;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }
}
