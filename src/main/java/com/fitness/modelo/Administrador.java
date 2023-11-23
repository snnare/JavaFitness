package com.fitness.modelo;

public class Administrador {
    private int idAdministrador;
    private String nombreCompleto;
    private String correoElectronico;
    private String contrasenia;

    // Constructors

    public Administrador() {
    }

    public Administrador(int idAdministrador, String nombreCompleto, String correoElectronico, String contrasenia) {
        this.idAdministrador = idAdministrador;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.contrasenia = contrasenia;
    }

    // Getters and Setters

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
