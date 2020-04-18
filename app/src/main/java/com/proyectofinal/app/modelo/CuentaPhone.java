package com.proyectofinal.app.modelo;

public class CuentaPhone {

    private int idCuenta;
    private String correo;
    private String contrasena;
    private int porcentajeTotal;
    private int porcentajeIntro;
    private  String nombre;
    private String urlFoto;
    private String sexo;
    private int metaDiaria;
    private int nivel;
    private int sesion;

    public CuentaPhone() {

    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getPorcentajeTotal() {
        return porcentajeTotal;
    }

    public void setPorcentajeTotal(int porcentajeTotal) {
        this.porcentajeTotal = porcentajeTotal;
    }

    public int getPorcentajeIntro() {
        return porcentajeIntro;
    }

    public void setPorcentajeIntro(int porcentajeIntro) {
        this.porcentajeIntro = porcentajeIntro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMetaDiaria() {
        return metaDiaria;
    }

    public void setMetaDiaria(int metaDiaria) {
        this.metaDiaria = metaDiaria;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getSesion() {
        return sesion;
    }

    public void setSesion(int sesion) {
        this.sesion = sesion;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombreUsuario(){

        String nombreUsuario="admin";
        return nombreUsuario;
    }

    @Override
    public String toString() {
        return getNombreUsuario();
    }
}
