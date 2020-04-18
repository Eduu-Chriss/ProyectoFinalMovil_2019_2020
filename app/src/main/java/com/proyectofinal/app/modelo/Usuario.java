package com.proyectofinal.app.modelo;

public class Usuario {

    private int idUsuario;
    private String correo;
    private String nombre;
    private String urlFoto;
    private String sexo;
    private String contrasena;
    private String motivo;

    public static final String AVATAR_HOMBRE = "urlAvatarHombre";
    public static final String AVATAR_MUJER = "urlAvatarMujer";
    public static final String AVATAR_INDIFERENTE = "urlAvatarPrefieroNoDecirlo";

    public Usuario() {

    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getNombreUsuario(){

        String nombreUsuario="";
        return nombreUsuario;
    }

    @Override
    public String toString() {
        return getNombreUsuario();
    }
}
