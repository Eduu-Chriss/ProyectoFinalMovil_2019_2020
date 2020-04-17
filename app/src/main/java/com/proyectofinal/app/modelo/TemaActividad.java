package com.proyectofinal.app.modelo;

import java.util.Date;

public class TemaActividad {

    private int idTemAct;
    private int idActUsu;
    private int idTema;
    private boolean estado;
    private Date fecha;

    public TemaActividad() {
    }


    public int getIdTemAct() {
        return idTemAct;
    }

    public void setIdTemAct(int idTemAct) {
        this.idTemAct = idTemAct;
    }

    public int getIdActUsu() {
        return idActUsu;
    }

    public void setIdActUsu(int idActUsu) {
        this.idActUsu = idActUsu;
    }

    public int getIdTema() {
        return idTema;
    }

    public void setIdTema(int idTema) {
        this.idTema = idTema;
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


