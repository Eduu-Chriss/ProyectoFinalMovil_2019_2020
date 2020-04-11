package com.proyectofinal.app.modelo;

import java.util.List;

public class Tema {

    // VARIABLES
    private int id;
    private String titulo;
    private int imagen;
    private int porcentaje;
    private List<Tarea> listaTareas;

    // CONSTRUCTORES

    public Tema() {

    }

    public Tema(int id, String titulo, int imagen, int porcentaje, List<Tarea> listaTareas) {
        this.id = id;
        this.titulo = titulo;
        this.imagen = imagen;
        this.porcentaje = porcentaje;
        this.listaTareas = listaTareas;
    }

    // MÉTODOS SET Y GET

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public List<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(List<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    // TO STRING
    @Override
    public String toString() {
        return titulo;
    }
}
