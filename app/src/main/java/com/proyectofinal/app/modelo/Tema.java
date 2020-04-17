package com.proyectofinal.app.modelo;

import java.util.List;

public class Tema {

    // VARIABLES
    private int id;
    private String titulo;
    private int imagen;
    private int imagenBloq;
    private int porcentaje;
    private List<Leccion> listaLeccions;

    // CONSTRUCTORES

    public Tema() {

    }

    public Tema(int id, String titulo, int imagen, int imagenBloq, int porcentaje, List<Leccion> listaLeccions) {
        this.id = id;
        this.titulo = titulo;
        this.imagen = imagen;
        this.imagenBloq = imagenBloq;
        this.porcentaje = porcentaje;
        this.listaLeccions = listaLeccions;
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

    public List<Leccion> getListaLeccions() {
        return listaLeccions;
    }

    public void setListaLeccions(List<Leccion> listaLeccions) {
        this.listaLeccions = listaLeccions;
    }

    public int getImagenBloq() {
        return imagenBloq;
    }

    public void setImagenBloq(int imagenBloq) {
        this.imagenBloq = imagenBloq;
    }

    // TO STRING
    @Override
    public String toString() {
        return titulo;
    }
}
