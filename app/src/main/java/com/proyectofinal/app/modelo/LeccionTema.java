package com.proyectofinal.app.modelo;

import java.util.Date;

public class LeccionTema {

    private int idLecTem;
    private int idTemAct;
    private int idLeccion;
    private boolean estado;
    private Date fecha;

    public LeccionTema() {
    }

    public int getIdLecTem() {
        return idLecTem;
    }

    public void setIdLecTem(int idLecTem) {
        this.idLecTem = idLecTem;
    }

    public int getIdTemAct() {
        return idTemAct;
    }

    public void setIdTemAct(int idTemAct) {
        this.idTemAct = idTemAct;
    }

    public int getIdLeccion() {
        return idLeccion;
    }

    public void setIdLeccion(int idLeccion) {
        this.idLeccion = idLeccion;
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
