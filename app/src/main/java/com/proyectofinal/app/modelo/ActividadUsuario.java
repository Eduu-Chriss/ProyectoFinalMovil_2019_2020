package com.proyectofinal.app.modelo;

import java.util.Date;

public class ActividadUsuario {

    private int idActUsu;
    private int idUsuario;
    private int idActividad;
    private boolean estado;
    private Date fecha;

    public ActividadUsuario() {

    }

    public int getIdActUsu() {
        return idActUsu;
    }

    public void setIdActUsu(int idActUsu) {
        this.idActUsu = idActUsu;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
