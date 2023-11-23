package com.fitness.modelo;

public class Rutina {
    private int idRutina;
    private int idAdministrador;
    private String nombre;
    private String descripcion;
    private String intensidad;

    // Constructors

    public Rutina() {
    }

    public Rutina(int idRutina, int idAdministrador, String nombre, String descripcion, String intensidad) {
        this.idRutina = idRutina;
        this.idAdministrador = idAdministrador;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.intensidad = intensidad;
    }

    // Getters and Setters

    public int getIdRutina() {
        return idRutina;
    }

    public void setIdRutina(int idRutina) {
        this.idRutina = idRutina;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(String intensidad) {
        this.intensidad = intensidad;
    }
}
