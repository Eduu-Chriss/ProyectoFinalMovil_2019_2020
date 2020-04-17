package com.proyectofinal.app.modelo;

import java.util.List;

public class Actividad {

    // VARIABLES
    private int id;
    private int porcentaje;
    private boolean estado;
    private List <Tema> listaTemas;

    //CONSTRUCTORES
    public Actividad() {

    }

    public Actividad(int id, int porcentaje, boolean estado, List<Tema> listaTemas) {
        this.id = id;
        this.porcentaje = porcentaje;
        this.estado = estado;
        this.listaTemas = listaTemas;
    }

    // MÉTODOS SET Y GET

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<Tema> getListaTemas() {
        return listaTemas;
    }

    public void setListaTemas(List<Tema> listaTemas) {
        this.listaTemas = listaTemas;
    }

    //TO STRING

    @Override
    public String toString() {
        return ""+id;
    }
}
