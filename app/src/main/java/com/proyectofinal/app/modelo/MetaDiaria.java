package com.proyectofinal.app.modelo;

import java.util.Date;

public class MetaDiaria {

    private int idMeta;
    private int idUsuario;
    private int numMeta;
    private boolean estado;
    private Date fecha;


    public MetaDiaria() {

    }

    public int getIdMeta() {
        return idMeta;
    }

    public void setIdMeta(int idMeta) {
        this.idMeta = idMeta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getNumMeta() {
        return numMeta;
    }

    public void setNumMeta(int numMeta) {
        this.numMeta = numMeta;
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
