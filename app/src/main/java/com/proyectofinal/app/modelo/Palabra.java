package com.proyectofinal.app.modelo;

public class Palabra {

    private int idPalabra;
    private int idLeccion;
    private String palabraEspañol;
    private String palabraKichwa;
    private String urlImagen;
    private String urlAudio;
    private String descripcion;

    public Palabra() {

    }

    public int getIdPalabra() {
        return idPalabra;
    }

    public void setIdPalabra(int idPalabra) {
        this.idPalabra = idPalabra;
    }

    public int getIdLeccion() {
        return idLeccion;
    }

    public void setIdLeccion(int idLeccion) {
        this.idLeccion = idLeccion;
    }

    public String getPalabraEspañol() {
        return palabraEspañol;
    }

    public void setPalabraEspañol(String palabraEspañol) {
        this.palabraEspañol = palabraEspañol;
    }

    public String getPalabraKichwa() {
        return palabraKichwa;
    }

    public void setPalabraKichwa(String palabraKichwa) {
        this.palabraKichwa = palabraKichwa;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getUrlAudio() {
        return urlAudio;
    }

    public void setUrlAudio(String urlAudio) {
        this.urlAudio = urlAudio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
